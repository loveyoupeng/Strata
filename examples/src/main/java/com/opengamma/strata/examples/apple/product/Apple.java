package com.opengamma.strata.examples.apple.product;

import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.Resolvable;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.examples.apple.basic.index.AppleIndex;
import com.opengamma.strata.examples.apple.basic.index.AppleIndexObservation;
import com.opengamma.strata.product.Product;
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
public class Apple implements Product, Resolvable<ResolvedApple>, ImmutableBean, Serializable {
  @PropertyDefinition(validate="notNull")
  private final LocalDate pickupDate;
  @PropertyDefinition(validate = "notNull")
  private final int grade;
  @PropertyDefinition(validate = "notNull")
  private final AppleIndex index;

  @Override
  public ResolvedApple resolve(final ReferenceData refData) {
    final LocalDate maturityDate = index.calculateMaturityDate(pickupDate, refData);
    return ResolvedApple.builder()
        .matureDate(maturityDate)
        .grade(grade)
        .observation(AppleIndexObservation.builder().index(index).maturityDate(maturityDate).build())
        .build();
  }

  @Override
  public ImmutableSet<Currency> allCurrencies() {
    return ImmutableSet.of(Currency.CNH);
  }
  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code Apple}.
   * @return the meta-bean, not null
   */
  public static Apple.Meta meta() {
    return Apple.Meta.INSTANCE;
  }

  static {
    MetaBean.register(Apple.Meta.INSTANCE);
  }

  /**
   * The serialization version id.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static Apple.Builder builder() {
    return new Apple.Builder();
  }

  /**
   * Restricted constructor.
   * @param builder  the builder to copy from, not null
   */
  protected Apple(Apple.Builder builder) {
    JodaBeanUtils.notNull(builder.pickupDate, "pickupDate");
    JodaBeanUtils.notNull(builder.grade, "grade");
    JodaBeanUtils.notNull(builder.index, "index");
    this.pickupDate = builder.pickupDate;
    this.grade = builder.grade;
    this.index = builder.index;
  }

  @Override
  public Apple.Meta metaBean() {
    return Apple.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the pickupDate.
   * @return the value of the property, not null
   */
  public LocalDate getPickupDate() {
    return pickupDate;
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
   * Gets the index.
   * @return the value of the property, not null
   */
  public AppleIndex getIndex() {
    return index;
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
      Apple other = (Apple) obj;
      return JodaBeanUtils.equal(pickupDate, other.pickupDate) &&
          (grade == other.grade) &&
          JodaBeanUtils.equal(index, other.index);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(pickupDate);
    hash = hash * 31 + JodaBeanUtils.hashCode(grade);
    hash = hash * 31 + JodaBeanUtils.hashCode(index);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(128);
    buf.append("Apple{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  protected void toString(StringBuilder buf) {
    buf.append("pickupDate").append('=').append(JodaBeanUtils.toString(pickupDate)).append(',').append(' ');
    buf.append("grade").append('=').append(JodaBeanUtils.toString(grade)).append(',').append(' ');
    buf.append("index").append('=').append(JodaBeanUtils.toString(index)).append(',').append(' ');
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code Apple}.
   */
  public static class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code pickupDate} property.
     */
    private final MetaProperty<LocalDate> pickupDate = DirectMetaProperty.ofImmutable(
        this, "pickupDate", Apple.class, LocalDate.class);
    /**
     * The meta-property for the {@code grade} property.
     */
    private final MetaProperty<Integer> grade = DirectMetaProperty.ofImmutable(
        this, "grade", Apple.class, Integer.TYPE);
    /**
     * The meta-property for the {@code index} property.
     */
    private final MetaProperty<AppleIndex> index = DirectMetaProperty.ofImmutable(
        this, "index", Apple.class, AppleIndex.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "pickupDate",
        "grade",
        "index");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -965488566:  // pickupDate
          return pickupDate;
        case 98615255:  // grade
          return grade;
        case 100346066:  // index
          return index;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public Apple.Builder builder() {
      return new Apple.Builder();
    }

    @Override
    public Class<? extends Apple> beanType() {
      return Apple.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code pickupDate} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<LocalDate> pickupDate() {
      return pickupDate;
    }

    /**
     * The meta-property for the {@code grade} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Integer> grade() {
      return grade;
    }

    /**
     * The meta-property for the {@code index} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<AppleIndex> index() {
      return index;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -965488566:  // pickupDate
          return ((Apple) bean).getPickupDate();
        case 98615255:  // grade
          return ((Apple) bean).getGrade();
        case 100346066:  // index
          return ((Apple) bean).getIndex();
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
   * The bean-builder for {@code Apple}.
   */
  public static class Builder extends DirectFieldsBeanBuilder<Apple> {

    private LocalDate pickupDate;
    private int grade;
    private AppleIndex index;

    /**
     * Restricted constructor.
     */
    protected Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    protected Builder(Apple beanToCopy) {
      this.pickupDate = beanToCopy.getPickupDate();
      this.grade = beanToCopy.getGrade();
      this.index = beanToCopy.getIndex();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case -965488566:  // pickupDate
          return pickupDate;
        case 98615255:  // grade
          return grade;
        case 100346066:  // index
          return index;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case -965488566:  // pickupDate
          this.pickupDate = (LocalDate) newValue;
          break;
        case 98615255:  // grade
          this.grade = (Integer) newValue;
          break;
        case 100346066:  // index
          this.index = (AppleIndex) newValue;
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
    public Apple build() {
      return new Apple(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the pickupDate.
     * @param pickupDate  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder pickupDate(LocalDate pickupDate) {
      JodaBeanUtils.notNull(pickupDate, "pickupDate");
      this.pickupDate = pickupDate;
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
     * Sets the index.
     * @param index  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder index(AppleIndex index) {
      JodaBeanUtils.notNull(index, "index");
      this.index = index;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(128);
      buf.append("Apple.Builder{");
      int len = buf.length();
      toString(buf);
      if (buf.length() > len) {
        buf.setLength(buf.length() - 2);
      }
      buf.append('}');
      return buf.toString();
    }

    protected void toString(StringBuilder buf) {
      buf.append("pickupDate").append('=').append(JodaBeanUtils.toString(pickupDate)).append(',').append(' ');
      buf.append("grade").append('=').append(JodaBeanUtils.toString(grade)).append(',').append(' ');
      buf.append("index").append('=').append(JodaBeanUtils.toString(index)).append(',').append(' ');
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
