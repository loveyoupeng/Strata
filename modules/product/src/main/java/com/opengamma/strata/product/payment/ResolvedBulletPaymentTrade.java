/*
 * Copyright (C) 2016 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.product.payment;

import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.ImmutableDefaults;
import org.joda.beans.gen.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.product.ResolvedTrade;
import com.opengamma.strata.product.TradeInfo;

/**
 * A bullet payment trade, resolved for pricing.
 * <p>
 * This is the resolved form of {@link BulletPaymentTrade} and is the primary input to the pricers.
 * Applications will typically create a {@code ResolvedBulletPaymentTrade} from a {@code BulletPaymentTrade}
 * using {@link BulletPaymentTrade#resolve(ReferenceData)}.
 * <p>
 * A {@code ResolvedBulletPaymentTrade} is bound to data that changes over time, such as holiday calendars.
 * If the data changes, such as the addition of a new holiday, the resolved form will not be updated.
 * Care must be taken when placing the resolved form in a cache or persistence layer.
 */
@BeanDefinition
public final class ResolvedBulletPaymentTrade
    implements ResolvedTrade, ImmutableBean, Serializable {

  /**
   * The additional trade information, defaulted to an empty instance.
   * <p>
   * This allows additional information to be attached to the trade.
   */
  @PropertyDefinition(validate = "notNull", overrideGet = true)
  private final TradeInfo info;
  /**
   * The resolved bullet payment product.
   * <p>
   * The product captures the contracted financial details of the trade.
   */
  @PropertyDefinition(validate = "notNull", overrideGet = true)
  private final ResolvedBulletPayment product;

  //-------------------------------------------------------------------------
  /**
   * Obtains an instance of a resolved Bullet Payment trade.
   * 
   * @param info  the trade info
   * @param product  the product
   * @return the resolved trade
   */
  public static ResolvedBulletPaymentTrade of(TradeInfo info, ResolvedBulletPayment product) {
    return new ResolvedBulletPaymentTrade(info, product);
  }

  @ImmutableDefaults
  private static void applyDefaults(Builder builder) {
    builder.info = TradeInfo.empty();
  }

  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code ResolvedBulletPaymentTrade}.
   * @return the meta-bean, not null
   */
  public static ResolvedBulletPaymentTrade.Meta meta() {
    return ResolvedBulletPaymentTrade.Meta.INSTANCE;
  }

  static {
    MetaBean.register(ResolvedBulletPaymentTrade.Meta.INSTANCE);
  }

  /**
   * The serialization version id.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static ResolvedBulletPaymentTrade.Builder builder() {
    return new ResolvedBulletPaymentTrade.Builder();
  }

  private ResolvedBulletPaymentTrade(
      TradeInfo info,
      ResolvedBulletPayment product) {
    JodaBeanUtils.notNull(info, "info");
    JodaBeanUtils.notNull(product, "product");
    this.info = info;
    this.product = product;
  }

  @Override
  public ResolvedBulletPaymentTrade.Meta metaBean() {
    return ResolvedBulletPaymentTrade.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the additional trade information, defaulted to an empty instance.
   * <p>
   * This allows additional information to be attached to the trade.
   * @return the value of the property, not null
   */
  @Override
  public TradeInfo getInfo() {
    return info;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the resolved bullet payment product.
   * <p>
   * The product captures the contracted financial details of the trade.
   * @return the value of the property, not null
   */
  @Override
  public ResolvedBulletPayment getProduct() {
    return product;
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
      ResolvedBulletPaymentTrade other = (ResolvedBulletPaymentTrade) obj;
      return JodaBeanUtils.equal(info, other.info) &&
          JodaBeanUtils.equal(product, other.product);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(info);
    hash = hash * 31 + JodaBeanUtils.hashCode(product);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(96);
    buf.append("ResolvedBulletPaymentTrade{");
    buf.append("info").append('=').append(JodaBeanUtils.toString(info)).append(',').append(' ');
    buf.append("product").append('=').append(JodaBeanUtils.toString(product));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ResolvedBulletPaymentTrade}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code info} property.
     */
    private final MetaProperty<TradeInfo> info = DirectMetaProperty.ofImmutable(
        this, "info", ResolvedBulletPaymentTrade.class, TradeInfo.class);
    /**
     * The meta-property for the {@code product} property.
     */
    private final MetaProperty<ResolvedBulletPayment> product = DirectMetaProperty.ofImmutable(
        this, "product", ResolvedBulletPaymentTrade.class, ResolvedBulletPayment.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "info",
        "product");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 3237038:  // info
          return info;
        case -309474065:  // product
          return product;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public ResolvedBulletPaymentTrade.Builder builder() {
      return new ResolvedBulletPaymentTrade.Builder();
    }

    @Override
    public Class<? extends ResolvedBulletPaymentTrade> beanType() {
      return ResolvedBulletPaymentTrade.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code info} property.
     * @return the meta-property, not null
     */
    public MetaProperty<TradeInfo> info() {
      return info;
    }

    /**
     * The meta-property for the {@code product} property.
     * @return the meta-property, not null
     */
    public MetaProperty<ResolvedBulletPayment> product() {
      return product;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 3237038:  // info
          return ((ResolvedBulletPaymentTrade) bean).getInfo();
        case -309474065:  // product
          return ((ResolvedBulletPaymentTrade) bean).getProduct();
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
   * The bean-builder for {@code ResolvedBulletPaymentTrade}.
   */
  public static final class Builder extends DirectFieldsBeanBuilder<ResolvedBulletPaymentTrade> {

    private TradeInfo info;
    private ResolvedBulletPayment product;

    /**
     * Restricted constructor.
     */
    private Builder() {
      applyDefaults(this);
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    private Builder(ResolvedBulletPaymentTrade beanToCopy) {
      this.info = beanToCopy.getInfo();
      this.product = beanToCopy.getProduct();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 3237038:  // info
          return info;
        case -309474065:  // product
          return product;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 3237038:  // info
          this.info = (TradeInfo) newValue;
          break;
        case -309474065:  // product
          this.product = (ResolvedBulletPayment) newValue;
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
    public ResolvedBulletPaymentTrade build() {
      return new ResolvedBulletPaymentTrade(
          info,
          product);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the additional trade information, defaulted to an empty instance.
     * <p>
     * This allows additional information to be attached to the trade.
     * @param info  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder info(TradeInfo info) {
      JodaBeanUtils.notNull(info, "info");
      this.info = info;
      return this;
    }

    /**
     * Sets the resolved bullet payment product.
     * <p>
     * The product captures the contracted financial details of the trade.
     * @param product  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder product(ResolvedBulletPayment product) {
      JodaBeanUtils.notNull(product, "product");
      this.product = product;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(96);
      buf.append("ResolvedBulletPaymentTrade.Builder{");
      buf.append("info").append('=').append(JodaBeanUtils.toString(info)).append(',').append(' ');
      buf.append("product").append('=').append(JodaBeanUtils.toString(product));
      buf.append('}');
      return buf.toString();
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
