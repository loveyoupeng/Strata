package com.opengamma.strata.examples.apple.measures;

import com.opengamma.strata.data.scenario.ScenarioMarketData;
import java.io.Serializable;
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
public class DefaultAppleScenarioMarketData implements AppleScenarioMarketData,
    ImmutableBean, Serializable {

  /**
   * The serialization version id.
   */
  private static final long serialVersionUID = 1L;

  static {
    MetaBean.register(DefaultAppleScenarioMarketData.Meta.INSTANCE);
  }

  @PropertyDefinition(validate = "notNull")
  private final AppleMarketDataLookup lookup;
  @PropertyDefinition(validate = "notNull")
  private final ScenarioMarketData marketData;

  //------------------------- AUTOGENERATED START -------------------------

  /**
   * Restricted constructor.
   *
   * @param builder the builder to copy from, not null
   */
  protected DefaultAppleScenarioMarketData(DefaultAppleScenarioMarketData.Builder builder) {
    JodaBeanUtils.notNull(builder.lookup, "lookup");
    JodaBeanUtils.notNull(builder.marketData, "marketData");
    this.lookup = builder.lookup;
    this.marketData = builder.marketData;
  }

  /**
   * The meta-bean for {@code DefaultAppleScenarioMarketData}.
   *
   * @return the meta-bean, not null
   */
  public static DefaultAppleScenarioMarketData.Meta meta() {
    return DefaultAppleScenarioMarketData.Meta.INSTANCE;
  }

  /**
   * Returns a builder used to create an instance of the bean.
   *
   * @return the builder, not null
   */
  public static DefaultAppleScenarioMarketData.Builder builder() {
    return new DefaultAppleScenarioMarketData.Builder();
  }

  @Override
  public int getScenarioCount() {
    return marketData.getScenarioCount();
  }

  @Override
  public AppleMarketData scenario(final int index) {
    return lookup.marketDataView(marketData.scenario(index));
  }

  @Override
  public DefaultAppleScenarioMarketData.Meta metaBean() {
    return DefaultAppleScenarioMarketData.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------

  /**
   * Gets the lookup.
   *
   * @return the value of the property, not null
   */
  public AppleMarketDataLookup getLookup() {
    return lookup;
  }

  //-----------------------------------------------------------------------

  /**
   * Gets the marketData.
   *
   * @return the value of the property, not null
   */
  public ScenarioMarketData getMarketData() {
    return marketData;
  }

  //-----------------------------------------------------------------------

  /**
   * Returns a builder that allows this bean to be mutated.
   *
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
      DefaultAppleScenarioMarketData other = (DefaultAppleScenarioMarketData) obj;
      return JodaBeanUtils.equal(lookup, other.lookup) &&
          JodaBeanUtils.equal(marketData, other.marketData);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(lookup);
    hash = hash * 31 + JodaBeanUtils.hashCode(marketData);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(96);
    buf.append("DefaultAppleScenarioMarketData{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  protected void toString(StringBuilder buf) {
    buf.append("lookup").append('=').append(JodaBeanUtils.toString(lookup)).append(',').append(' ');
    buf.append("marketData").append('=').append(JodaBeanUtils.toString(marketData)).append(',')
        .append(' ');
  }

  //-----------------------------------------------------------------------

  /**
   * The meta-bean for {@code DefaultAppleScenarioMarketData}.
   */
  public static class Meta extends DirectMetaBean {

    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code lookup} property.
     */
    private final MetaProperty<AppleMarketDataLookup> lookup = DirectMetaProperty.ofImmutable(
        this, "lookup", DefaultAppleScenarioMarketData.class, AppleMarketDataLookup.class);
    /**
     * The meta-property for the {@code marketData} property.
     */
    private final MetaProperty<ScenarioMarketData> marketData = DirectMetaProperty.ofImmutable(
        this, "marketData", DefaultAppleScenarioMarketData.class, ScenarioMarketData.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "lookup",
        "marketData");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -1097094790:  // lookup
          return lookup;
        case 1116764678:  // marketData
          return marketData;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public DefaultAppleScenarioMarketData.Builder builder() {
      return new DefaultAppleScenarioMarketData.Builder();
    }

    @Override
    public Class<? extends DefaultAppleScenarioMarketData> beanType() {
      return DefaultAppleScenarioMarketData.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------

    /**
     * The meta-property for the {@code lookup} property.
     *
     * @return the meta-property, not null
     */
    public final MetaProperty<AppleMarketDataLookup> lookup() {
      return lookup;
    }

    /**
     * The meta-property for the {@code marketData} property.
     *
     * @return the meta-property, not null
     */
    public final MetaProperty<ScenarioMarketData> marketData() {
      return marketData;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -1097094790:  // lookup
          return ((DefaultAppleScenarioMarketData) bean).getLookup();
        case 1116764678:  // marketData
          return ((DefaultAppleScenarioMarketData) bean).getMarketData();
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
   * The bean-builder for {@code DefaultAppleScenarioMarketData}.
   */
  public static class Builder extends DirectFieldsBeanBuilder<DefaultAppleScenarioMarketData> {

    private AppleMarketDataLookup lookup;
    private ScenarioMarketData marketData;

    /**
     * Restricted constructor.
     */
    protected Builder() {
    }

    /**
     * Restricted copy constructor.
     *
     * @param beanToCopy the bean to copy from, not null
     */
    protected Builder(DefaultAppleScenarioMarketData beanToCopy) {
      this.lookup = beanToCopy.getLookup();
      this.marketData = beanToCopy.getMarketData();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case -1097094790:  // lookup
          return lookup;
        case 1116764678:  // marketData
          return marketData;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case -1097094790:  // lookup
          this.lookup = (AppleMarketDataLookup) newValue;
          break;
        case 1116764678:  // marketData
          this.marketData = (ScenarioMarketData) newValue;
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
    public DefaultAppleScenarioMarketData build() {
      return new DefaultAppleScenarioMarketData(this);
    }

    //-----------------------------------------------------------------------

    /**
     * Sets the lookup.
     *
     * @param lookup the new value, not null
     * @return this, for chaining, not null
     */
    public Builder lookup(AppleMarketDataLookup lookup) {
      JodaBeanUtils.notNull(lookup, "lookup");
      this.lookup = lookup;
      return this;
    }

    /**
     * Sets the marketData.
     *
     * @param marketData the new value, not null
     * @return this, for chaining, not null
     */
    public Builder marketData(ScenarioMarketData marketData) {
      JodaBeanUtils.notNull(marketData, "marketData");
      this.marketData = marketData;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(96);
      buf.append("DefaultAppleScenarioMarketData.Builder{");
      int len = buf.length();
      toString(buf);
      if (buf.length() > len) {
        buf.setLength(buf.length() - 2);
      }
      buf.append('}');
      return buf.toString();
    }

    protected void toString(StringBuilder buf) {
      buf.append("lookup").append('=').append(JodaBeanUtils.toString(lookup)).append(',')
          .append(' ');
      buf.append("marketData").append('=').append(JodaBeanUtils.toString(marketData)).append(',')
          .append(' ');
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
