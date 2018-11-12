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
 * CheckoutCheckboxV2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T15:17:45.358Z")
public class CheckoutCheckboxV2 {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("checked")
  private Boolean checked = false;

  @JsonProperty("required")
  private Boolean required = false;

   /**
   * Identifier used when presenting data back to merchant
   * @return id
  **/
  @ApiModelProperty(example = "newsletter_opt_in", required = true, value = "Identifier used when presenting data back to merchant")
  public String getId() {
    return id;
  }

   /**
   * Text that will be displayed to the consumer aside the checkbox. Links and formatting can be added using Markdown. (max 255 characters)
   * @return text
  **/
  @ApiModelProperty(example = "Please add me to the newsletter list, read more here [link](http://www.google.com)", required = true, value = "Text that will be displayed to the consumer aside the checkbox. Links and formatting can be added using Markdown. (max 255 characters)")
  public String getText() {
    return text;
  }

   /**
   * Default state of the additional checkbox. It will use this value when loaded for the first time.
   * @return checked
  **/
  @ApiModelProperty(required = true, value = "Default state of the additional checkbox. It will use this value when loaded for the first time.")
  public Boolean isChecked() {
    return checked;
  }

   /**
   * Whether it is required for the consumer to check the additional checkbox box or not in order to complete the purchase.
   * @return required
  **/
  @ApiModelProperty(required = true, value = "Whether it is required for the consumer to check the additional checkbox box or not in order to complete the purchase.")
  public Boolean isRequired() {
    return required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutCheckboxV2 checkboxV2 = (CheckoutCheckboxV2) o;
    return Objects.equals(this.id, checkboxV2.id) &&
        Objects.equals(this.text, checkboxV2.text) &&
        Objects.equals(this.checked, checkboxV2.checked) &&
        Objects.equals(this.required, checkboxV2.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, checked, required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutCheckboxV2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

