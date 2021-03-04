package com.opengamma.strata.examples.apple.basic.index;

import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.index.ImmutableFxIndex;
import com.opengamma.strata.collect.io.CsvFile;
import com.opengamma.strata.collect.io.CsvRow;
import com.opengamma.strata.collect.io.ResourceConfig;
import com.opengamma.strata.collect.io.ResourceLocator;
import com.opengamma.strata.collect.named.NamedLookup;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppleIndexCsvLookup  implements NamedLookup<AppleIndex> {

  /**
   * The logger.
   */
  private static final Logger log = Logger.getLogger(AppleIndexCsvLookup.class.getName());
  /**
   * The singleton instance of the lookup.
   */
  public static final AppleIndexCsvLookup INSTANCE = new AppleIndexCsvLookup();

  // CSV column headers
  private static final String NAME_FIELD = "Name";
  private static final String CURRENCY_FIELD = "Currency";
  private static final String LOCATION_CURRENCY_FIELD = "Location";
  private static final String GRADE_FIELD = "Grade";
  private static final String MATURITY_DATE_ADJUSTMENT_FIELD = "MaturityDateAdjustment";
  private static final String CALENDAR_FIELD = "Calendar";

  /**
   * The cache by name.
   */
  private static final ImmutableMap<String, AppleIndex> BY_NAME = loadFromCsv();

  /**
   * Restricted constructor.
   */
  private AppleIndexCsvLookup() {
  }

  //-------------------------------------------------------------------------
  @Override
  public Map<String, AppleIndex> lookupAll() {
    return BY_NAME;
  }

  private static ImmutableMap<String, AppleIndex> loadFromCsv() {
    List<ResourceLocator> resources = ResourceConfig.orderedResources("FxIndexData.csv");
    Map<String, AppleIndex> map = new HashMap<>();
    for (ResourceLocator resource : resources) {
      try {
        CsvFile csv = CsvFile.of(resource.getCharSource(), true);
        for (CsvRow row : csv.rows()) {
          AppleIndex parsed = parseFxIndex(row);
          map.put(parsed.getName(), parsed);
          map.putIfAbsent(parsed.getName().toUpperCase(Locale.ENGLISH), parsed);
        }
      } catch (RuntimeException ex) {
        log.log(Level.SEVERE, "Error processing resource as FX Index CSV file: " + resource, ex);
        return ImmutableMap.of();
      }
    }
    return ImmutableMap.copyOf(map);
  }

  private static AppleIndex parseFxIndex(CsvRow row) {
    String name = row.getField(NAME_FIELD);
    Currency baseCurrency = Currency.parse(row.getField(CURRENCY_FIELD));
    Currency counterCurrency = Currency.parse(row.getField(LOCATION_CURRENCY_FIELD));
    HolidayCalendarId fixingCal = HolidayCalendarId.of(row.getField(GRADE_FIELD));
    HolidayCalendarId maturityCal = HolidayCalendarId.of(row.getField(CALENDAR_FIELD));
    // build result
//    return ImmutableAppleIndex.builder()
//        .name(name)
//        .currencyPair(CurrencyPair.of(baseCurrency, counterCurrency))
//        .fixingCalendar(fixingCal)
//    //    .maturityDateOffset(DaysAdjustment.ofBusinessDays(maturityDays, maturityCal))
//        .build();
    return null;
  }

}
