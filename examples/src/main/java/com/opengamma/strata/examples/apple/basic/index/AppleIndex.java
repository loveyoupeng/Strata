package com.opengamma.strata.examples.apple.basic.index;

import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.collect.ArgChecker;
import com.opengamma.strata.collect.named.ExtendedEnum;
import com.opengamma.strata.collect.named.Named;
import org.joda.convert.FromString;

public interface AppleIndex extends Index, Named {
  @FromString
  static AppleIndex of(String uniqueName) {
    ArgChecker.notNull(uniqueName, "uniqueName");
    return extendedEnum().lookup(uniqueName);
  }

  static ExtendedEnum<AppleIndex> extendedEnum() {
    return AppleIndices.ENUM_LOOKUP;
  }

  Currency getCurrency();

  String getLocation();

  int getGrade();

  DaysAdjustment getMaturityDaysAdjustment();

  HolidayCalendarId getCalendar();

}
