package com.opengamma.strata.examples.apple.measures;

import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.calc.runner.CalculationFunction;
import com.opengamma.strata.calc.runner.CalculationParameters;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.collect.result.Result;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.examples.apple.product.AppleTrade;
import java.util.Map;
import java.util.Set;

public class AppleTradeCalculationFunction implements CalculationFunction<AppleTrade> {

  @Override
  public Class<AppleTrade> targetType() {
    return null;
  }

  @Override
  public Set<Measure> supportedMeasures() {
    return null;
  }

  @Override
  public Currency naturalCurrency(final AppleTrade target, final ReferenceData refData) {
    return null;
  }

  @Override
  public FunctionRequirements requirements(final AppleTrade target, final Set<Measure> measures,
      final CalculationParameters parameters, final ReferenceData refData) {
    return null;
  }

  @Override
  public Map<Measure, Result<?>> calculate(final AppleTrade target, final Set<Measure> measures,
      final CalculationParameters parameters, final ScenarioMarketData marketData,
      final ReferenceData refData) {
    return null;
  }
}
