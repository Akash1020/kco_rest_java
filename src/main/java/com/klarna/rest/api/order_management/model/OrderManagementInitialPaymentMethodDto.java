/*
 * Klarna Order Managment API
 * API to handle order lifecycle
 *
 * OpenAPI spec version: 1.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.order_management.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrderManagementInitialPaymentMethodDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-02T13:50:00.500Z")
public class OrderManagementInitialPaymentMethodDto {
  /**
   * The type of the initial payment method.
   */
  public enum TypeEnum {
    INVOICE("INVOICE"),
    
    FIXED_AMOUNT("FIXED_AMOUNT"),
    
    FIXED_AMOUNT_BY_CARD("FIXED_AMOUNT_BY_CARD"),
    
    ACCOUNT("ACCOUNT"),
    
    DIRECT_DEBIT("DIRECT_DEBIT"),
    
    CARD("CARD"),
    
    BANK_TRANSFER("BANK_TRANSFER"),
    
    PAY_IN_X("PAY_IN_X"),
    
    INVOICE_BUSINESS("INVOICE_BUSINESS"),
    
    DEFERRED_INTEREST("DEFERRED_INTEREST"),
    
    OTHER("OTHER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("description")
  private String description = null;

  public OrderManagementInitialPaymentMethodDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the initial payment method.
   * @return type
  **/
  @ApiModelProperty(example = "INVOICE", value = "The type of the initial payment method.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OrderManagementInitialPaymentMethodDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the initial payment method.
   * @return description
  **/
  @ApiModelProperty(example = "Pay later", value = "The description of the initial payment method.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderManagementInitialPaymentMethodDto initialPaymentMethodDto = (OrderManagementInitialPaymentMethodDto) o;
    return Objects.equals(this.type, initialPaymentMethodDto.type) &&
        Objects.equals(this.description, initialPaymentMethodDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementInitialPaymentMethodDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

