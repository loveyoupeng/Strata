package com.opengamma.strata.examples.apple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendarIds;
import com.opengamma.strata.examples.apple.basic.index.AppleIndex;
import com.opengamma.strata.examples.apple.basic.index.AppleIndices;
import com.opengamma.strata.examples.apple.basic.index.ImmutableAppleIndex;
import com.opengamma.strata.examples.apple.product.Apple;
import com.opengamma.strata.examples.apple.product.ResolvedApple;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class ApplePricingTest {

  @Test
  public void test_apple_index() {
    assertEquals("A-APPLE", AppleIndices.A_APPLE.getName());
    assertEquals("Shangdong", AppleIndices.A_APPLE.getLocation());
    assertEquals(10, AppleIndices.A_APPLE.getMaturityDaysAdjustment().getDays());
  }

  @Test
  public void test_apple_resolve() {
    final AppleIndex index = ImmutableAppleIndex.builder().currency(Currency.CNH)
        .calendar(HolidayCalendarIds.USGS).grade(1)
        .maturityDaysAdjustment(DaysAdjustment.ofBusinessDays(10, HolidayCalendarIds.USGS))
        .location("Shanghai")
        .name("APPLE-TEST").build();

    final Apple apple = Apple.builder().index(index).grade(1).pickupDate(LocalDate.of(2021, 1, 2))
        .build();
    final ResolvedApple resolvedApple = apple.resolve(ReferenceData.standard());

    assertEquals(1, resolvedApple.getGrade());
    assertEquals(LocalDate.of(2021, 1, 19), resolvedApple.getMatureDate());
    assertEquals(index, resolvedApple.getObservation().getIndex());

  }

}
