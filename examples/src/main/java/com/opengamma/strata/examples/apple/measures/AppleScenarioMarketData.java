package com.opengamma.strata.examples.apple.measures;

public interface AppleScenarioMarketData {

  int getScenarioCount();

  AppleMarketData scenario(int index);
}
