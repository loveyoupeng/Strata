package com.opengamma.strata.examples.apple.measures;

import com.opengamma.strata.data.MarketData;
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
public class DefaultAppleMarketData implements AppleMarketData, ImmutableBean, Serializable {

  /**
   * The serialization version id.
   */
  private static final long serialVersionUID = 1L;

  static {
    MetaBean.register(DefaultAppleMarketData.Meta.INSTANCE);
  }

  //------------------------- AUTOGENERATED START -------------------------

  @PropertyDefinition(validate = "notNull")
  private final AppleMarketDataLookup lookup;
  @PropertyDefinition(validate = "notNull")
  private final MarketData marketData;

  /**
   * Restricted constructor.
   *
   * @param builder the builder to copy from, not null
   */
  protected DefaultAppleMarketData(DefaultAppleMarketData.Builder builder) {
    JodaBeanUtils.notNull(builder.lookup, "lookup");
    JodaBeanUtils.notNull(builder.marketData, "marketData");
    this.lookup = builder.lookup;
    this.marketData = builder.marketData;
  }

  /**
   * The meta-bean for {@code DefaultAppleMarketData}.
   *
   * @return the meta-bean, not null
   */
  public static DefaultAppleMarketData.Meta meta() {
    return DefaultAppleMarketData.Meta.INSTANCE;
  }

  /**
   * Returns a builder used to create an instance of the bean.
   *
   * @return the builder, not null
   */
  public static DefaultAppleMarketData.Builder builder() {
    return new DefaultAppleMarketData.Builder();
  }

  @Override
  public DefaultAppleMarketData.Meta metaBean() {
    return DefaultAppleMarketData.Meta.INSTANCE;
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
  public MarketData getMarketData() {
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
      DefaultAppleMarketData other = (DefaultAppleMarketData) obj;
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
    buf.append("DefaultAppleMarketData{");
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
   * The meta-bean for {@code DefaultAppleMarketData}.
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
        this, "lookup", DefaultAppleMarketData.class, AppleMarketDataLookup.class);
    /**
     * The meta-property for the {@code marketData} property.
     */
    private final MetaProperty<MarketData> marketData = DirectMetaProperty.ofImmutable(
        this, "marketData", DefaultAppleMarketData.class, MarketData.class);
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
    public DefaultAppleMarketData.Builder builder() {
      return new DefaultAppleMarketData.Builder();
    }

    @Override
    public Class<? extends DefaultAppleMarketData> beanType() {
      return DefaultAppleMarketData.class;
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
    public final MetaProperty<MarketData> marketData() {
      return marketData;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -1097094790:  // lookup
          return ((DefaultAppleMarketData) bean).getLookup();
        case 1116764678:  // marketData
          return ((DefaultAppleMarketData) bean).getMarketData();
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
   * The bean-builder for {@code DefaultAppleMarketData}.
   */
  public static class Builder extends DirectFieldsBeanBuilder<DefaultAppleMarketData> {

    private AppleMarketDataLookup lookup;
    private MarketData marketData;

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
    protected Builder(DefaultAppleMarketData beanToCopy) {
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
          this.marketData = (MarketData) newValue;
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
    public DefaultAppleMarketData build() {
      return new DefaultAppleMarketData(this);
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
    public Builder marketData(MarketData marketData) {
      JodaBeanUtils.notNull(marketData, "marketData");
      this.marketData = marketData;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(96);
      buf.append("DefaultAppleMarketData.Builder{");
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
