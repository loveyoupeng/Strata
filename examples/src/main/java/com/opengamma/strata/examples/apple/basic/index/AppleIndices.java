package com.opengamma.strata.examples.apple.basic.index;

import com.opengamma.strata.basics.index.FxIndex;
import com.opengamma.strata.collect.named.ExtendedEnum;

public class AppleIndices {
  public static final ExtendedEnum<AppleIndex> ENUM_LOOKUP = ExtendedEnum.of(AppleIndex.class);

  public static final AppleIndex A_APPLE = AppleIndex.of("A-APPLE");

  public static final AppleIndex B_APPLE = AppleIndex.of("B-APPLE");

  public static final AppleIndex C_APPLE = AppleIndex.of("C-APPLE");

}
