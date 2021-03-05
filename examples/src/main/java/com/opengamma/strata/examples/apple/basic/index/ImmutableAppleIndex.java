package com.opengamma.strata.examples.apple.basic.index;

import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
public class ImmutableAppleIndex implements AppleIndex, ImmutableBean, Serializable {

  @PropertyDefinition(validate = "notNull")
  private final String name;

  @PropertyDefinition(validate = "notNull")
  private final Currency currency;


  @PropertyDefinition(validate = "notNull")
  private final String location;


  @PropertyDefinition(validate = "notNull")
  private final int grade;


  @PropertyDefinition(validate = "notNull")
  private final DaysAdjustment maturityDaysAdjustment;


  @PropertyDefinition(validate = "notNull")
  private final HolidayCalendarId calendar;

  @Override
  public LocalDate calculateMaturityDate(final LocalDate pickupDate, final ReferenceData refData) {
    return maturityDaysAdjustment.adjust(calendar.resolve(refData).nextOrSame(pickupDate), refData);
  }


  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code ImmutableAppleIndex}.
   * @return the meta-bean, not null
   */
  public static ImmutableAppleIndex.Meta meta() {
    return ImmutableAppleIndex.Meta.INSTANCE;
  }

  static {
    MetaBean.register(ImmutableAppleIndex.Meta.INSTANCE);
  }

  /**
   * The serialization version id.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static ImmutableAppleIndex.Builder builder() {
    return new ImmutableAppleIndex.Builder();
  }

  /**
   * Restricted constructor.
   * @param builder  the builder to copy from, not null
   */
  protected ImmutableAppleIndex(ImmutableAppleIndex.Builder builder) {
    JodaBeanUtils.notNull(builder.name, "name");
    JodaBeanUtils.notNull(builder.currency, "currency");
    JodaBeanUtils.notNull(builder.location, "location");
    JodaBeanUtils.notNull(builder.grade, "grade");
    JodaBeanUtils.notNull(builder.maturityDaysAdjustment, "maturityDaysAdjustment");
    JodaBeanUtils.notNull(builder.calendar, "calendar");
    this.name = builder.name;
    this.currency = builder.currency;
    this.location = builder.location;
    this.grade = builder.grade;
    this.maturityDaysAdjustment = builder.maturityDaysAdjustment;
    this.calendar = builder.calendar;
  }

  @Override
  public ImmutableAppleIndex.Meta metaBean() {
    return ImmutableAppleIndex.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the name.
   * @return the value of the property, not null
   */
  public String getName() {
    return name;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the currency.
   * @return the value of the property, not null
   */
  public Currency getCurrency() {
    return currency;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the location.
   * @return the value of the property, not null
   */
  public String getLocation() {
    return location;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the grade.
   * @return the value of the property, not null
   */
  public int getGrade() {
    return grade;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the maturityDaysAdjustment.
   * @return the value of the property, not null
   */
  public DaysAdjustment getMaturityDaysAdjustment() {
    return maturityDaysAdjustment;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the calendar.
   * @return the value of the property, not null
   */
  public HolidayCalendarId getCalendar() {
    return calendar;
  }


  //-----------------------------------------------------------------------
  /**
   * Returns a builder that allows this bean to be mutated.
   * @return the mutable builder, not null
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      ImmutableAppleIndex other = (ImmutableAppleIndex) obj;
      return JodaBeanUtils.equal(name, other.name) &&
          JodaBeanUtils.equal(currency, other.currency) &&
          JodaBeanUtils.equal(location, other.location) &&
          (grade == other.grade) &&
          JodaBeanUtils.equal(maturityDaysAdjustment, other.maturityDaysAdjustment) &&
          JodaBeanUtils.equal(calendar, other.calendar);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(name);
    hash = hash * 31 + JodaBeanUtils.hashCode(currency);
    hash = hash * 31 + JodaBeanUtils.hashCode(location);
    hash = hash * 31 + JodaBeanUtils.hashCode(grade);
    hash = hash * 31 + JodaBeanUtils.hashCode(maturityDaysAdjustment);
    hash = hash * 31 + JodaBeanUtils.hashCode(calendar);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(224);
    buf.append("ImmutableAppleIndex{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  protected void toString(StringBuilder buf) {
    buf.append("name").append('=').append(JodaBeanUtils.toString(name)).append(',').append(' ');
    buf.append("currency").append('=').append(JodaBeanUtils.toString(currency)).append(',').append(' ');
    buf.append("location").append('=').append(JodaBeanUtils.toString(location)).append(',').append(' ');
    buf.append("grade").append('=').append(JodaBeanUtils.toString(grade)).append(',').append(' ');
    buf.append("maturityDaysAdjustment").append('=').append(JodaBeanUtils.toString(maturityDaysAdjustment)).append(',').append(' ');
    buf.append("calendar").append('=').append(JodaBeanUtils.toString(calendar)).append(',').append(' ');
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ImmutableAppleIndex}.
   */
  public static class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code name} property.
     */
    private final MetaProperty<String> name = DirectMetaProperty.ofImmutable(
        this, "name", ImmutableAppleIndex.class, String.class);
    /**
     * The meta-property for the {@code currency} property.
     */
    private final MetaProperty<Currency> currency = DirectMetaProperty.ofImmutable(
        this, "currency", ImmutableAppleIndex.class, Currency.class);
    /**
     * The meta-property for the {@code location} property.
     */
    private final MetaProperty<String> location = DirectMetaProperty.ofImmutable(
        this, "location", ImmutableAppleIndex.class, String.class);
    /**
     * The meta-property for the {@code grade} property.
     */
    private final MetaProperty<Integer> grade = DirectMetaProperty.ofImmutable(
        this, "grade", ImmutableAppleIndex.class, Integer.TYPE);
    /**
     * The meta-property for the {@code maturityDaysAdjustment} property.
     */
    private final MetaProperty<DaysAdjustment> maturityDaysAdjustment = DirectMetaProperty.ofImmutable(
        this, "maturityDaysAdjustment", ImmutableAppleIndex.class, DaysAdjustment.class);
    /**
     * The meta-property for the {@code calendar} property.
     */
    private final MetaProperty<HolidayCalendarId> calendar = DirectMetaProperty.ofImmutable(
        this, "calendar", ImmutableAppleIndex.class, HolidayCalendarId.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "name",
        "currency",
        "location",
        "grade",
        "maturityDaysAdjustment",
        "calendar");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 3373707:  // name
          return name;
        case 575402001:  // currency
          return currency;
        case 1901043637:  // location
          return location;
        case 98615255:  // grade
          return grade;
        case 527831829:  // maturityDaysAdjustment
          return maturityDaysAdjustment;
        case -178324674:  // calendar
          return calendar;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public ImmutableAppleIndex.Builder builder() {
      return new ImmutableAppleIndex.Builder();
    }

    @Override
    public Class<? extends ImmutableAppleIndex> beanType() {
      return ImmutableAppleIndex.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code name} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<String> name() {
      return name;
    }

    /**
     * The meta-property for the {@code currency} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Currency> currency() {
      return currency;
    }

    /**
     * The meta-property for the {@code location} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<String> location() {
      return location;
    }

    /**
     * The meta-property for the {@code grade} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Integer> grade() {
      return grade;
    }

    /**
     * The meta-property for the {@code maturityDaysAdjustment} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<DaysAdjustment> maturityDaysAdjustment() {
      return maturityDaysAdjustment;
    }

    /**
     * The meta-property for the {@code calendar} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<HolidayCalendarId> calendar() {
      return calendar;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 3373707:  // name
          return ((ImmutableAppleIndex) bean).getName();
        case 575402001:  // currency
          return ((ImmutableAppleIndex) bean).getCurrency();
        case 1901043637:  // location
          return ((ImmutableAppleIndex) bean).getLocation();
        case 98615255:  // grade
          return ((ImmutableAppleIndex) bean).getGrade();
        case 527831829:  // maturityDaysAdjustment
          return ((ImmutableAppleIndex) bean).getMaturityDaysAdjustment();
        case -178324674:  // calendar
          return ((ImmutableAppleIndex) bean).getCalendar();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code ImmutableAppleIndex}.
   */
  public static class Builder extends DirectFieldsBeanBuilder<ImmutableAppleIndex> {

    private String name;
    private Currency currency;
    private String location;
    private int grade;
    private DaysAdjustment maturityDaysAdjustment;
    private HolidayCalendarId calendar;

    /**
     * Restricted constructor.
     */
    protected Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    protected Builder(ImmutableAppleIndex beanToCopy) {
      this.name = beanToCopy.getName();
      this.currency = beanToCopy.getCurrency();
      this.location = beanToCopy.getLocation();
      this.grade = beanToCopy.getGrade();
      this.maturityDaysAdjustment = beanToCopy.getMaturityDaysAdjustment();
      this.calendar = beanToCopy.getCalendar();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 3373707:  // name
          return name;
        case 575402001:  // currency
          return currency;
        case 1901043637:  // location
          return location;
        case 98615255:  // grade
          return grade;
        case 527831829:  // maturityDaysAdjustment
          return maturityDaysAdjustment;
        case -178324674:  // calendar
          return calendar;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 3373707:  // name
          this.name = (String) newValue;
          break;
        case 575402001:  // currency
          this.currency = (Currency) newValue;
          break;
        case 1901043637:  // location
          this.location = (String) newValue;
          break;
        case 98615255:  // grade
          this.grade = (Integer) newValue;
          break;
        case 527831829:  // maturityDaysAdjustment
          this.maturityDaysAdjustment = (DaysAdjustment) newValue;
          break;
        case -178324674:  // calendar
          this.calendar = (HolidayCalendarId) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public ImmutableAppleIndex build() {
      return new ImmutableAppleIndex(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the name.
     * @param name  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder name(String name) {
      JodaBeanUtils.notNull(name, "name");
      this.name = name;
      return this;
    }

    /**
     * Sets the currency.
     * @param currency  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder currency(Currency currency) {
      JodaBeanUtils.notNull(currency, "currency");
      this.currency = currency;
      return this;
    }

    /**
     * Sets the location.
     * @param location  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder location(String location) {
      JodaBeanUtils.notNull(location, "location");
      this.location = location;
      return this;
    }

    /**
     * Sets the grade.
     * @param grade  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder grade(int grade) {
      JodaBeanUtils.notNull(grade, "grade");
      this.grade = grade;
      return this;
    }

    /**
     * Sets the maturityDaysAdjustment.
     * @param maturityDaysAdjustment  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder maturityDaysAdjustment(DaysAdjustment maturityDaysAdjustment) {
      JodaBeanUtils.notNull(maturityDaysAdjustment, "maturityDaysAdjustment");
      this.maturityDaysAdjustment = maturityDaysAdjustment;
      return this;
    }

    /**
     * Sets the calendar.
     * @param calendar  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder calendar(HolidayCalendarId calendar) {
      JodaBeanUtils.notNull(calendar, "calendar");
      this.calendar = calendar;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(224);
      buf.append("ImmutableAppleIndex.Builder{");
      int len = buf.length();
      toString(buf);
      if (buf.length() > len) {
        buf.setLength(buf.length() - 2);
      }
      buf.append('}');
      return buf.toString();
    }

    protected void toString(StringBuilder buf) {
      buf.append("name").append('=').append(JodaBeanUtils.toString(name)).append(',').append(' ');
      buf.append("currency").append('=').append(JodaBeanUtils.toString(currency)).append(',').append(' ');
      buf.append("location").append('=').append(JodaBeanUtils.toString(location)).append(',').append(' ');
      buf.append("grade").append('=').append(JodaBeanUtils.toString(grade)).append(',').append(' ');
      buf.append("maturityDaysAdjustment").append('=').append(JodaBeanUtils.toString(maturityDaysAdjustment)).append(',').append(' ');
      buf.append("calendar").append('=').append(JodaBeanUtils.toString(calendar)).append(',').append(' ');
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
