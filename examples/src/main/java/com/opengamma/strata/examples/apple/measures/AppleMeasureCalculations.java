package com.opengamma.strata.examples.apple.measures;

import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.data.scenario.CurrencyScenarioArray;
import com.opengamma.strata.examples.apple.pricer.AppleTradePricer;
import com.opengamma.strata.examples.apple.product.ResolvedAppleTrade;

final class AppleMeasureCalculations {

  public static final AppleMeasureCalculations DEFAULT = new AppleMeasureCalculations(
      AppleTradePricer.DEFAULT);
  private final AppleTradePricer tradePricer;

  AppleMeasureCalculations(
      final AppleTradePricer tradePricer) {
    this.tradePricer = tradePricer;
  }


  CurrencyAmount presentValue(final ResolvedAppleTrade trade, final AppleMarketData marketData) {
    return tradePricer.presentValue(trade, marketData);
  }

  CurrencyScenarioArray presentValue(final ResolvedAppleTrade trade,
      final AppleScenarioMarketData marketData) {
    return CurrencyScenarioArray
        .of(marketData.getScenarioCount(), i -> presentValue(trade, marketData.scenario(i)));
  }
}
