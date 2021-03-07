package com.opengamma.strata.examples.apple.measures;

import static com.opengamma.strata.measure.Measures.PRESENT_VALUE;

import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.calc.runner.CalculationFunction;
import com.opengamma.strata.calc.runner.CalculationParameters;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.collect.result.FailureReason;
import com.opengamma.strata.collect.result.Result;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.examples.apple.product.AppleTrade;
import com.opengamma.strata.examples.apple.product.ResolvedAppleTrade;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AppleTradeCalculationFunction implements CalculationFunction<AppleTrade> {

  private static final ImmutableMap<Measure, SingleMeasureCalculation> CALCULATORS =
      ImmutableMap.<Measure, SingleMeasureCalculation>builder()
          .put(PRESENT_VALUE, AppleMeasureCalculations.DEFAULT::presentValue)
          .build();
  private static final Set<Measure> MEASURES = CALCULATORS.keySet();

  @Override
  public Class<AppleTrade> targetType() {
    return AppleTrade.class;
  }

  @Override
  public Set<Measure> supportedMeasures() {
    return MEASURES;
  }

  @Override
  public Currency naturalCurrency(final AppleTrade target, final ReferenceData refData) {
    return target.getProduct().getIndex().getCurrency();
  }

  @Override
  public FunctionRequirements requirements(final AppleTrade target, final Set<Measure> measures,
      final CalculationParameters parameters, final ReferenceData refData) {
    return parameters.getParameter(AppleMarketDataLookup.class)
        .requirements(target.getProduct().getIndex().getCurrency());
  }

  @Override
  public Map<Measure, Result<?>> calculate(final AppleTrade target, final Set<Measure> measures,
      final CalculationParameters parameters, final ScenarioMarketData marketData,
      final ReferenceData refData) {
    final ResolvedAppleTrade resolved = target.resolve(refData);
    final AppleMarketDataLookup appleMarketDataLookup = parameters
        .getParameter(AppleMarketDataLookup.class);
    final AppleScenarioMarketData appleMarketData = appleMarketDataLookup
        .marketDataView(marketData);

    final Map<Measure, Result<?>> results = new HashMap<>();
    for (final Measure measure : measures) {
      results.put(measure, calculate(measure, resolved, appleMarketData));
    }
    return results;
  }

  private Result<?> calculate(final Measure measure, final ResolvedAppleTrade trade,
      final AppleScenarioMarketData marketData) {
    final SingleMeasureCalculation calculator = CALCULATORS.get(measure);
    if (calculator == null) {
      return Result
          .failure(FailureReason.UNSUPPORTED, "Unsupported measure for AppleTrade: {}", measure);
    }

    return Result.of(() -> calculator.calculate(trade, marketData));
  }

  @FunctionalInterface
  interface SingleMeasureCalculation {

    Object calculate(final ResolvedAppleTrade trade, final AppleScenarioMarketData marketData);
  }
}
