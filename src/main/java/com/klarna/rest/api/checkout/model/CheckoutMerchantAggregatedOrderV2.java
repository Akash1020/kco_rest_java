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
 * CheckoutMerchantAggregatedOrderV2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T15:17:45.358Z")
public class CheckoutMerchantAggregatedOrderV2 {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("terms_uri")
  private String termsUri = null;

  @JsonProperty("checkout_uri")
  private String checkoutUri = null;

  @JsonProperty("confirmation_uri")
  private String confirmationUri = null;

  @JsonProperty("push_uri")
  private String pushUri = null;

  @JsonProperty("validation_uri")
  private String validationUri = null;

  @JsonProperty("back_to_store_uri")
  private String backToStoreUri = null;

  @JsonProperty("cancellation_terms_uri")
  private String cancellationTermsUri = null;

  public CheckoutMerchantAggregatedOrderV2 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutMerchantAggregatedOrderV2 termsUri(String termsUri) {
    this.termsUri = termsUri;
    return this;
  }

   /**
   * Get termsUri
   * @return termsUri
  **/
  @ApiModelProperty(value = "")
  public String getTermsUri() {
    return termsUri;
  }

  public void setTermsUri(String termsUri) {
    this.termsUri = termsUri;
  }

  public CheckoutMerchantAggregatedOrderV2 checkoutUri(String checkoutUri) {
    this.checkoutUri = checkoutUri;
    return this;
  }

   /**
   * Get checkoutUri
   * @return checkoutUri
  **/
  @ApiModelProperty(value = "")
  public String getCheckoutUri() {
    return checkoutUri;
  }

  public void setCheckoutUri(String checkoutUri) {
    this.checkoutUri = checkoutUri;
  }

  public CheckoutMerchantAggregatedOrderV2 confirmationUri(String confirmationUri) {
    this.confirmationUri = confirmationUri;
    return this;
  }

   /**
   * Get confirmationUri
   * @return confirmationUri
  **/
  @ApiModelProperty(value = "")
  public String getConfirmationUri() {
    return confirmationUri;
  }

  public void setConfirmationUri(String confirmationUri) {
    this.confirmationUri = confirmationUri;
  }

  public CheckoutMerchantAggregatedOrderV2 pushUri(String pushUri) {
    this.pushUri = pushUri;
    return this;
  }

   /**
   * Get pushUri
   * @return pushUri
  **/
  @ApiModelProperty(value = "")
  public String getPushUri() {
    return pushUri;
  }

  public void setPushUri(String pushUri) {
    this.pushUri = pushUri;
  }

  public CheckoutMerchantAggregatedOrderV2 validationUri(String validationUri) {
    this.validationUri = validationUri;
    return this;
  }

   /**
   * Get validationUri
   * @return validationUri
  **/
  @ApiModelProperty(value = "")
  public String getValidationUri() {
    return validationUri;
  }

  public void setValidationUri(String validationUri) {
    this.validationUri = validationUri;
  }

  public CheckoutMerchantAggregatedOrderV2 backToStoreUri(String backToStoreUri) {
    this.backToStoreUri = backToStoreUri;
    return this;
  }

   /**
   * Get backToStoreUri
   * @return backToStoreUri
  **/
  @ApiModelProperty(value = "")
  public String getBackToStoreUri() {
    return backToStoreUri;
  }

  public void setBackToStoreUri(String backToStoreUri) {
    this.backToStoreUri = backToStoreUri;
  }

  public CheckoutMerchantAggregatedOrderV2 cancellationTermsUri(String cancellationTermsUri) {
    this.cancellationTermsUri = cancellationTermsUri;
    return this;
  }

   /**
   * Get cancellationTermsUri
   * @return cancellationTermsUri
  **/
  @ApiModelProperty(value = "")
  public String getCancellationTermsUri() {
    return cancellationTermsUri;
  }

  public void setCancellationTermsUri(String cancellationTermsUri) {
    this.cancellationTermsUri = cancellationTermsUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutMerchantAggregatedOrderV2 merchantAggregatedOrderV2 = (CheckoutMerchantAggregatedOrderV2) o;
    return Objects.equals(this.id, merchantAggregatedOrderV2.id) &&
        Objects.equals(this.termsUri, merchantAggregatedOrderV2.termsUri) &&
        Objects.equals(this.checkoutUri, merchantAggregatedOrderV2.checkoutUri) &&
        Objects.equals(this.confirmationUri, merchantAggregatedOrderV2.confirmationUri) &&
        Objects.equals(this.pushUri, merchantAggregatedOrderV2.pushUri) &&
        Objects.equals(this.validationUri, merchantAggregatedOrderV2.validationUri) &&
        Objects.equals(this.backToStoreUri, merchantAggregatedOrderV2.backToStoreUri) &&
        Objects.equals(this.cancellationTermsUri, merchantAggregatedOrderV2.cancellationTermsUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, termsUri, checkoutUri, confirmationUri, pushUri, validationUri, backToStoreUri, cancellationTermsUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutMerchantAggregatedOrderV2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    termsUri: ").append(toIndentedString(termsUri)).append("\n");
    sb.append("    checkoutUri: ").append(toIndentedString(checkoutUri)).append("\n");
    sb.append("    confirmationUri: ").append(toIndentedString(confirmationUri)).append("\n");
    sb.append("    pushUri: ").append(toIndentedString(pushUri)).append("\n");
    sb.append("    validationUri: ").append(toIndentedString(validationUri)).append("\n");
    sb.append("    backToStoreUri: ").append(toIndentedString(backToStoreUri)).append("\n");
    sb.append("    cancellationTermsUri: ").append(toIndentedString(cancellationTermsUri)).append("\n");
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

