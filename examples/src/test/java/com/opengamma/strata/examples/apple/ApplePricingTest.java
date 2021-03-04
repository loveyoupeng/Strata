package com.opengamma.strata.examples.apple;

import com.opengamma.strata.examples.apple.basic.index.AppleIndex;
import org.junit.jupiter.api.Test;

public class ApplePricingTest {
  @Test
  public void test_apple_index() {
    AppleIndex.extendedEnum().lookupAll().entrySet().forEach(System.out::println);
  }

}
