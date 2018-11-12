/*
 * Customer Tokens
 * The Customer Token API is used to charge customers with a tokenized Klarna payment method and can be used for recurring purchases, subscriptions and for storing a customer's payment method. Tokens are created using the [generate a customer token](#payments-api-generate-a-consumer-token) call in the payments API.
 *
 * OpenAPI spec version: 3.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.customer_token.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TokenProductIdentifiers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-02T11:40:30.975Z")
public class TokenProductIdentifiers {
  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("category_path")
  private String categoryPath = null;

  @JsonProperty("global_trade_item_number")
  private String globalTradeItemNumber = null;

  @JsonProperty("manufacturer_part_number")
  private String manufacturerPartNumber = null;

  public TokenProductIdentifiers brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The product&#39;s brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.
   * @return brand
  **/
  @ApiModelProperty(example = "Intel", value = "The product's brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public TokenProductIdentifiers categoryPath(String categoryPath) {
    this.categoryPath = categoryPath;
    return this;
  }

   /**
   * The product&#39;s category path as used in the merchant&#39;s webshop. Include the full and most detailed category and separate the segments with &#39; &gt; &#39;
   * @return categoryPath
  **/
  @ApiModelProperty(example = "Electronics Store > Computers & Tablets > Desktops", value = "The product's category path as used in the merchant's webshop. Include the full and most detailed category and separate the segments with ' > '")
  public String getCategoryPath() {
    return categoryPath;
  }

  public void setCategoryPath(String categoryPath) {
    this.categoryPath = categoryPath;
  }

  public TokenProductIdentifiers globalTradeItemNumber(String globalTradeItemNumber) {
    this.globalTradeItemNumber = globalTradeItemNumber;
    return this;
  }

   /**
   * The product&#39;s Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible
   * @return globalTradeItemNumber
  **/
  @ApiModelProperty(example = "735858293167", value = "The product's Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible")
  public String getGlobalTradeItemNumber() {
    return globalTradeItemNumber;
  }

  public void setGlobalTradeItemNumber(String globalTradeItemNumber) {
    this.globalTradeItemNumber = globalTradeItemNumber;
  }

  public TokenProductIdentifiers manufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
    return this;
  }

   /**
   * The product&#39;s Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible
   * @return manufacturerPartNumber
  **/
  @ApiModelProperty(example = "BOXNUC5CPYH", value = "The product's Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible")
  public String getManufacturerPartNumber() {
    return manufacturerPartNumber;
  }

  public void setManufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenProductIdentifiers productIdentifiers = (TokenProductIdentifiers) o;
    return Objects.equals(this.brand, productIdentifiers.brand) &&
        Objects.equals(this.categoryPath, productIdentifiers.categoryPath) &&
        Objects.equals(this.globalTradeItemNumber, productIdentifiers.globalTradeItemNumber) &&
        Objects.equals(this.manufacturerPartNumber, productIdentifiers.manufacturerPartNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, categoryPath, globalTradeItemNumber, manufacturerPartNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenProductIdentifiers {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
    sb.append("    globalTradeItemNumber: ").append(toIndentedString(globalTradeItemNumber)).append("\n");
    sb.append("    manufacturerPartNumber: ").append(toIndentedString(manufacturerPartNumber)).append("\n");
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

