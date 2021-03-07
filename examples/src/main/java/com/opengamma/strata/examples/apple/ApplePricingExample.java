package com.opengamma.strata.examples.apple;

import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.calc.CalculationRules;
import com.opengamma.strata.calc.CalculationRunner;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.Results;
import com.opengamma.strata.calc.runner.CalculationFunctions;
import com.opengamma.strata.data.ImmutableMarketData;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.examples.apple.basic.index.AppleIndices;
import com.opengamma.strata.examples.apple.measures.AppleTradeCalculationFunction;
import com.opengamma.strata.examples.apple.measures.DefaultAppleMarketDataLookup;
import com.opengamma.strata.examples.apple.product.Apple;
import com.opengamma.strata.examples.apple.product.AppleTrade;
import com.opengamma.strata.examples.marketdata.ExampleMarketData;
import com.opengamma.strata.examples.marketdata.ExampleMarketDataBuilder;
import com.opengamma.strata.measure.Measures;
import com.opengamma.strata.measure.StandardComponents;
import com.opengamma.strata.product.Trade;
import com.opengamma.strata.product.TradeInfo;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

public class ApplePricingExample {

  public static void main(String[] args) {
    try (CalculationRunner runner = CalculationRunner.of(Executors.newSingleThreadExecutor())) {
      calculate(runner);
    }
  }

  // obtains the data and calculates the grid of results
  private static void calculate(CalculationRunner runner) {

    List<Trade> trades = Arrays.asList(AppleTrade.builder().info(TradeInfo.empty()).product(
        Apple.builder().index(AppleIndices.A_APPLE).grade(1).pickupDate(LocalDate.of(2021, 1, 2))
            .build()).build());

    // the columns, specifying the measures to be calculated
    List<Column> columns = ImmutableList.of(
        Column.of(Measures.PRESENT_VALUE));

    // use the built-in example market data
    LocalDate valuationDate = LocalDate.of(2014, 1, 22);
    ExampleMarketDataBuilder marketDataBuilder = ExampleMarketData.builder();
    MarketData marketData = marketDataBuilder.buildSnapshot(valuationDate);

    // the complete set of rules for calculating measures
    CalculationFunctions functions = StandardComponents.calculationFunctions()
        .composedWith(CalculationFunctions.of(new AppleTradeCalculationFunction()));
    CalculationRules rules = CalculationRules
        .of(functions, marketDataBuilder.ratesLookup(valuationDate), DefaultAppleMarketDataLookup.builder().build());

    // the reference data, such as holidays and securities
    ReferenceData refData = ReferenceData.standard();

    // calculate the results
    Results results = runner.calculate(rules, trades, columns, marketData, refData);

    System.out.println(results);
  }

}

