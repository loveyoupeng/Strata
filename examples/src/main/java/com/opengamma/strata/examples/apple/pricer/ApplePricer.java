package com.opengamma.strata.examples.apple.pricer;

import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.examples.apple.measures.AppleMarketData;
import com.opengamma.strata.examples.apple.product.ResolvedAppleTrade;

public class ApplePricer {
  public static final ApplePricer DEFAULT = new ApplePricer();
  public CurrencyAmount presentValue(final ResolvedAppleTrade trade,
      final AppleMarketData marketData) {
    return CurrencyAmount.of(Currency.CNH, 100D);
  }
}
