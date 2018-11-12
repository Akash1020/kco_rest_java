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
import com.klarna.rest.api.checkout.model.CheckoutProductIdentifiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutOrderLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T15:17:45.358Z")
public class CheckoutOrderLine {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  @JsonProperty("quantity_unit")
  private String quantityUnit = null;

  @JsonProperty("unit_price")
  private Long unitPrice = null;

  @JsonProperty("tax_rate")
  private Long taxRate = null;

  @JsonProperty("total_amount")
  private Long totalAmount = null;

  @JsonProperty("total_discount_amount")
  private Long totalDiscountAmount = null;

  @JsonProperty("total_tax_amount")
  private Long totalTaxAmount = null;

  @JsonProperty("merchant_data")
  private String merchantData = null;

  @JsonProperty("product_url")
  private String productUrl = null;

  @JsonProperty("image_url")
  private String imageUrl = null;

  @JsonProperty("product_identifiers")
  private CheckoutProductIdentifiers productIdentifiers = null;

  public CheckoutOrderLine type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Order line type. Possible values:&lt;ul&gt;&lt;li&gt;&lt;em&gt;physical&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;discount&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;shipping_fee&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;sales_tax&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;digital&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;gift_card&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;store_credit&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;surcharge&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
   * @return type
  **/
  @ApiModelProperty(example = "physical", value = "Order line type. Possible values:<ul><li><em>physical</em></li><li><em>discount</em></li><li><em>shipping_fee</em></li><li><em>sales_tax</em></li><li><em>digital</em></li><li><em>gift_card</em></li><li><em>store_credit</em></li><li><em>surcharge</em></li></ul>")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CheckoutOrderLine reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Article number, SKU or similar.
   * @return reference
  **/
  @ApiModelProperty(example = "19-402-USA", value = "Article number, SKU or similar.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CheckoutOrderLine name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descriptive item name.
   * @return name
  **/
  @ApiModelProperty(example = "Red T-Shirt", required = true, value = "Descriptive item name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckoutOrderLine quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Non-negative. The item quantity.
   * minimum: 0
   * @return quantity
  **/
  @ApiModelProperty(example = "5", required = true, value = "Non-negative. The item quantity.")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public CheckoutOrderLine quantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
    return this;
  }

   /**
   * Unit used to describe the quantity, e.g. kg, pcs... If defined has to be 1-8 characters
   * @return quantityUnit
  **/
  @ApiModelProperty(example = "pcs", value = "Unit used to describe the quantity, e.g. kg, pcs... If defined has to be 1-8 characters")
  public String getQuantityUnit() {
    return quantityUnit;
  }

  public void setQuantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
  }

  public CheckoutOrderLine unitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Minor units. Includes tax, excludes discount. (max value: 100000000)
   * maximum: 100000000
   * @return unitPrice
  **/
  @ApiModelProperty(example = "10000", required = true, value = "Minor units. Includes tax, excludes discount. (max value: 100000000)")
  public Long getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
  }

  public CheckoutOrderLine taxRate(Long taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Non-negative. In percent, two implicit decimals. I.e 2500 &#x3D; 25%. (max value: 10000)
   * maximum: 10000
   * @return taxRate
  **/
  @ApiModelProperty(example = "1000", required = true, value = "Non-negative. In percent, two implicit decimals. I.e 2500 = 25%. (max value: 10000)")
  public Long getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Long taxRate) {
    this.taxRate = taxRate;
  }

  public CheckoutOrderLine totalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Includes tax and discount. Must match (quantity \\* unit_price) - total_discount_amount within ±quantity. (max value: 100000000)
   * maximum: 100000000
   * @return totalAmount
  **/
  @ApiModelProperty(example = "50000", required = true, value = "Includes tax and discount. Must match (quantity \\* unit_price) - total_discount_amount within ±quantity. (max value: 100000000)")
  public Long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }

  public CheckoutOrderLine totalDiscountAmount(Long totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * Non-negative minor units. Includes tax.
   * minimum: 0
   * @return totalDiscountAmount
  **/
  @ApiModelProperty(example = "0", value = "Non-negative minor units. Includes tax.")
  public Long getTotalDiscountAmount() {
    return totalDiscountAmount;
  }

  public void setTotalDiscountAmount(Long totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }

  public CheckoutOrderLine totalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Must be within ±1 of total_amount - total_amount \\* 10000 / (10000 + tax_rate). Negative when type is discount.
   * @return totalTaxAmount
  **/
  @ApiModelProperty(example = "5000", required = true, value = "Must be within ±1 of total_amount - total_amount \\* 10000 / (10000 + tax_rate). Negative when type is discount.")
  public Long getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public CheckoutOrderLine merchantData(String merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Pass through field. (max 255 characters)
   * @return merchantData
  **/
  @ApiModelProperty(example = "{\"marketplace_seller_info\":[{\"product_category\":\"Women's Fashion\",\"product_name\":\"Women Sweatshirt\"}]}", value = "Pass through field. (max 255 characters)")
  public String getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }

  public CheckoutOrderLine productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

   /**
   * URL to the product page that can be later embedded in communications between Klarna and the customer. (max 1024 characters)
   * @return productUrl
  **/
  @ApiModelProperty(example = "https://www.estore.com/products/f2a8d7e34", value = "URL to the product page that can be later embedded in communications between Klarna and the customer. (max 1024 characters)")
  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public CheckoutOrderLine imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters)
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://www.exampleobjects.com/logo.png", value = "URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters)")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public CheckoutOrderLine productIdentifiers(CheckoutProductIdentifiers productIdentifiers) {
    this.productIdentifiers = productIdentifiers;
    return this;
  }

   /**
   * Additional information identifying an item
   * @return productIdentifiers
  **/
  @ApiModelProperty(value = "Additional information identifying an item")
  public CheckoutProductIdentifiers getProductIdentifiers() {
    return productIdentifiers;
  }

  public void setProductIdentifiers(CheckoutProductIdentifiers productIdentifiers) {
    this.productIdentifiers = productIdentifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutOrderLine orderLine = (CheckoutOrderLine) o;
    return Objects.equals(this.type, orderLine.type) &&
        Objects.equals(this.reference, orderLine.reference) &&
        Objects.equals(this.name, orderLine.name) &&
        Objects.equals(this.quantity, orderLine.quantity) &&
        Objects.equals(this.quantityUnit, orderLine.quantityUnit) &&
        Objects.equals(this.unitPrice, orderLine.unitPrice) &&
        Objects.equals(this.taxRate, orderLine.taxRate) &&
        Objects.equals(this.totalAmount, orderLine.totalAmount) &&
        Objects.equals(this.totalDiscountAmount, orderLine.totalDiscountAmount) &&
        Objects.equals(this.totalTaxAmount, orderLine.totalTaxAmount) &&
        Objects.equals(this.merchantData, orderLine.merchantData) &&
        Objects.equals(this.productUrl, orderLine.productUrl) &&
        Objects.equals(this.imageUrl, orderLine.imageUrl) &&
        Objects.equals(this.productIdentifiers, orderLine.productIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reference, name, quantity, quantityUnit, unitPrice, taxRate, totalAmount, totalDiscountAmount, totalTaxAmount, merchantData, productUrl, imageUrl, productIdentifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutOrderLine {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUnit: ").append(toIndentedString(quantityUnit)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    productIdentifiers: ").append(toIndentedString(productIdentifiers)).append("\n");
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

