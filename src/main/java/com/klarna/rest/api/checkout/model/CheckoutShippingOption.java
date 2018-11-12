/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.checkout.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutShippingOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T15:17:45.358Z")
public class CheckoutShippingOption {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("promo")
  private String promo = null;

  @JsonProperty("price")
  private Long price = null;

  @JsonProperty("tax_amount")
  private Long taxAmount = null;

  @JsonProperty("tax_rate")
  private Long taxRate = null;

  @JsonProperty("preselected")
  private Boolean preselected = false;

  @JsonProperty("shipping_method")
  private String shippingMethod = null;

  public CheckoutShippingOption id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @ApiModelProperty(example = "express_priority", required = true, value = "id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutShippingOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name.
   * @return name
  **/
  @ApiModelProperty(example = "EXPRESS 1-2 Days", required = true, value = "Name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckoutShippingOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description.
   * @return description
  **/
  @ApiModelProperty(example = "Delivery by 4:30 pm", value = "Description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CheckoutShippingOption promo(String promo) {
    this.promo = promo;
    return this;
  }

   /**
   * Promotion name. To be used if this shipping option is promotional.
   * @return promo
  **/
  @ApiModelProperty(example = "Christmas Promotion", value = "Promotion name. To be used if this shipping option is promotional.")
  public String getPromo() {
    return promo;
  }

  public void setPromo(String promo) {
    this.promo = promo;
  }

  public CheckoutShippingOption price(Long price) {
    this.price = price;
    return this;
  }

   /**
   * Price including tax.
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Price including tax.")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public CheckoutShippingOption taxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax amount.
   * @return taxAmount
  **/
  @ApiModelProperty(required = true, value = "Tax amount.")
  public Long getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
  }

  public CheckoutShippingOption taxRate(Long taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Non-negative. In percent, two implicit decimals. I.e 2500 &#x3D; 25%.
   * @return taxRate
  **/
  @ApiModelProperty(required = true, value = "Non-negative. In percent, two implicit decimals. I.e 2500 = 25%.")
  public Long getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Long taxRate) {
    this.taxRate = taxRate;
  }

  public CheckoutShippingOption preselected(Boolean preselected) {
    this.preselected = preselected;
    return this;
  }

   /**
   * If true, this option will be preselected when checkout loads. Default: false
   * @return preselected
  **/
  @ApiModelProperty(value = "If true, this option will be preselected when checkout loads. Default: false")
  public Boolean isPreselected() {
    return preselected;
  }

  public void setPreselected(Boolean preselected) {
    this.preselected = preselected;
  }

  public CheckoutShippingOption shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Shipping method. Possible values:&lt;ul&gt;&lt;li&gt;PickUpStore&lt;/li&gt;&lt;li&gt;Home&lt;/li&gt;&lt;li&gt;BoxReg&lt;/li&gt;&lt;li&gt;BoxUnreg&lt;/li&gt;&lt;li&gt;PickUpPoint&lt;/li&gt;&lt;li&gt;Own&lt;/li&gt;&lt;li&gt;Postal&lt;/li&gt;&lt;/ul&gt;
   * @return shippingMethod
  **/
  @ApiModelProperty(example = "PickUpStore", value = "Shipping method. Possible values:<ul><li>PickUpStore</li><li>Home</li><li>BoxReg</li><li>BoxUnreg</li><li>PickUpPoint</li><li>Own</li><li>Postal</li></ul>")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutShippingOption shippingOption = (CheckoutShippingOption) o;
    return Objects.equals(this.id, shippingOption.id) &&
        Objects.equals(this.name, shippingOption.name) &&
        Objects.equals(this.description, shippingOption.description) &&
        Objects.equals(this.promo, shippingOption.promo) &&
        Objects.equals(this.price, shippingOption.price) &&
        Objects.equals(this.taxAmount, shippingOption.taxAmount) &&
        Objects.equals(this.taxRate, shippingOption.taxRate) &&
        Objects.equals(this.preselected, shippingOption.preselected) &&
        Objects.equals(this.shippingMethod, shippingOption.shippingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, promo, price, taxAmount, taxRate, preselected, shippingMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutShippingOption {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    promo: ").append(toIndentedString(promo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    preselected: ").append(toIndentedString(preselected)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

