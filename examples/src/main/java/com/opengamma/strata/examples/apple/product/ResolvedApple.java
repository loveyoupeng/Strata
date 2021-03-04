package com.opengamma.strata.examples.apple.product;

import com.opengamma.strata.examples.apple.basic.index.AppleIndexObservation;
import com.opengamma.strata.product.ResolvedProduct;
import java.io.Serializable;
import java.time.LocalDate;
import org.joda.beans.ImmutableBean;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.PropertyDefinition;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
public class ResolvedApple implements ResolvedProduct, ImmutableBean, Serializable {
  @PropertyDefinition(validate = "notNull")
  private final LocalDate matureDate;

  @PropertyDefinition(validate = "notNull")
  private final int grade;

  @PropertyDefinition(validate = "notNull")
  private final AppleIndexObservation observation;


  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code ResolvedApple}.
   * @return the meta-bean, not null
   */
  public static ResolvedApple.Meta meta() {
    return ResolvedApple.Meta.INSTANCE;
  }

  static {
    MetaBean.register(ResolvedApple.Meta.INSTANCE);
  }

  /**
   * The serialization version id.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static ResolvedApple.Builder builder() {
    return new ResolvedApple.Builder();
  }

  /**
   * Restricted constructor.
   * @param builder  the builder to copy from, not null
   */
  protected ResolvedApple(ResolvedApple.Builder builder) {
    JodaBeanUtils.notNull(builder.matureDate, "matureDate");
    JodaBeanUtils.notNull(builder.grade, "grade");
    JodaBeanUtils.notNull(builder.observation, "observation");
    this.matureDate = builder.matureDate;
    this.grade = builder.grade;
    this.observation = builder.observation;
  }

  @Override
  public ResolvedApple.Meta metaBean() {
    return ResolvedApple.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the matureDate.
   * @return the value of the property, not null
   */
  public LocalDate getMatureDate() {
    return matureDate;
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
   * Gets the observation.
   * @return the value of the property, not null
   */
  public AppleIndexObservation getObservation() {
    return observation;
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
      ResolvedApple other = (ResolvedApple) obj;
      return JodaBeanUtils.equal(matureDate, other.matureDate) &&
          (grade == other.grade) &&
          JodaBeanUtils.equal(observation, other.observation);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(matureDate);
    hash = hash * 31 + JodaBeanUtils.hashCode(grade);
    hash = hash * 31 + JodaBeanUtils.hashCode(observation);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(128);
    buf.append("ResolvedApple{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  protected void toString(StringBuilder buf) {
    buf.append("matureDate").append('=').append(JodaBeanUtils.toString(matureDate)).append(',').append(' ');
    buf.append("grade").append('=').append(JodaBeanUtils.toString(grade)).append(',').append(' ');
    buf.append("observation").append('=').append(JodaBeanUtils.toString(observation)).append(',').append(' ');
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ResolvedApple}.
   */
  public static class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code matureDate} property.
     */
    private final MetaProperty<LocalDate> matureDate = DirectMetaProperty.ofImmutable(
        this, "matureDate", ResolvedApple.class, LocalDate.class);
    /**
     * The meta-property for the {@code grade} property.
     */
    private final MetaProperty<Integer> grade = DirectMetaProperty.ofImmutable(
        this, "grade", ResolvedApple.class, Integer.TYPE);
    /**
     * The meta-property for the {@code observation} property.
     */
    private final MetaProperty<AppleIndexObservation> observation = DirectMetaProperty.ofImmutable(
        this, "observation", ResolvedApple.class, AppleIndexObservation.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "matureDate",
        "grade",
        "observation");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 950846422:  // matureDate
          return matureDate;
        case 98615255:  // grade
          return grade;
        case 122345516:  // observation
          return observation;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public ResolvedApple.Builder builder() {
      return new ResolvedApple.Builder();
    }

    @Override
    public Class<? extends ResolvedApple> beanType() {
      return ResolvedApple.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code matureDate} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<LocalDate> matureDate() {
      return matureDate;
    }

    /**
     * The meta-property for the {@code grade} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Integer> grade() {
      return grade;
    }

    /**
     * The meta-property for the {@code observation} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<AppleIndexObservation> observation() {
      return observation;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 950846422:  // matureDate
          return ((ResolvedApple) bean).getMatureDate();
        case 98615255:  // grade
          return ((ResolvedApple) bean).getGrade();
        case 122345516:  // observation
          return ((ResolvedApple) bean).getObservation();
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
   * The bean-builder for {@code ResolvedApple}.
   */
  public static class Builder extends DirectFieldsBeanBuilder<ResolvedApple> {

    private LocalDate matureDate;
    private int grade;
    private AppleIndexObservation observation;

    /**
     * Restricted constructor.
     */
    protected Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    protected Builder(ResolvedApple beanToCopy) {
      this.matureDate = beanToCopy.getMatureDate();
      this.grade = beanToCopy.getGrade();
      this.observation = beanToCopy.getObservation();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 950846422:  // matureDate
          return matureDate;
        case 98615255:  // grade
          return grade;
        case 122345516:  // observation
          return observation;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 950846422:  // matureDate
          this.matureDate = (LocalDate) newValue;
          break;
        case 98615255:  // grade
          this.grade = (Integer) newValue;
          break;
        case 122345516:  // observation
          this.observation = (AppleIndexObservation) newValue;
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
    public ResolvedApple build() {
      return new ResolvedApple(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the matureDate.
     * @param matureDate  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder matureDate(LocalDate matureDate) {
      JodaBeanUtils.notNull(matureDate, "matureDate");
      this.matureDate = matureDate;
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
     * Sets the observation.
     * @param observation  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder observation(AppleIndexObservation observation) {
      JodaBeanUtils.notNull(observation, "observation");
      this.observation = observation;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(128);
      buf.append("ResolvedApple.Builder{");
      int len = buf.length();
      toString(buf);
      if (buf.length() > len) {
        buf.setLength(buf.length() - 2);
      }
      buf.append('}');
      return buf.toString();
    }

    protected void toString(StringBuilder buf) {
      buf.append("matureDate").append('=').append(JodaBeanUtils.toString(matureDate)).append(',').append(' ');
      buf.append("grade").append('=').append(JodaBeanUtils.toString(grade)).append(',').append(' ');
      buf.append("observation").append('=').append(JodaBeanUtils.toString(observation)).append(',').append(' ');
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
