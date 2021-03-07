package com.opengamma.strata.examples.apple.measures;

import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.scenario.ScenarioMarketData;

public interface AppleMarketDataLookup extends CalculationParameter {

  FunctionRequirements requirements(final Currency currency);

  AppleMarketData marketDataView(final MarketData marketData);

  AppleScenarioMarketData marketDataView(final ScenarioMarketData marketData);
}
