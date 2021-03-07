package com.opengamma.strata.examples.apple.pricer;

import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.examples.apple.measures.AppleMarketData;
import com.opengamma.strata.examples.apple.product.ResolvedAppleTrade;

public class AppleTradePricer {
  public static final AppleTradePricer DEFAULT = new AppleTradePricer(ApplePricer.DEFAULT);

  private final ApplePricer pricer;

  public AppleTradePricer(final ApplePricer pricer) {
    this.pricer = pricer;
  }

  public CurrencyAmount presentValue(final ResolvedAppleTrade trade,
      final AppleMarketData marketData) {
    return pricer.presentValue(trade.getProduct(), marketData);
  }
}
