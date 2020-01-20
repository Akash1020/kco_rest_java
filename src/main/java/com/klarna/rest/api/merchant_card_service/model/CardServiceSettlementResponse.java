/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.merchant_card_service.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.merchant_card_service.model.CardServiceCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CardServiceSettlementResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:07:02.754Z")
public class CardServiceSettlementResponse {
  @JsonProperty("settlement_id")
  private String settlementId = null;

  @JsonProperty("promise_id")
  private String promiseId = null;

  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("cards")
  private List<CardServiceCard> cards = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("expires_at")
  private String expiresAt = null;

  public CardServiceSettlementResponse settlementId(String settlementId) {
    this.settlementId = settlementId;
    return this;
  }

   /**
   * Unique settlement identifier.
   * @return settlementId
  **/
  @ApiModelProperty(example = "b0ec0bbd-534c-4b1c-b28a-628bf33c3324", value = "Unique settlement identifier.")
  public String getSettlementId() {
    return settlementId;
  }

  public void setSettlementId(String settlementId) {
    this.settlementId = settlementId;
  }

  public CardServiceSettlementResponse promiseId(String promiseId) {
    this.promiseId = promiseId;
    return this;
  }

   /**
   * Unique identifier for the promise associated to the settlement.
   * @return promiseId
  **/
  @ApiModelProperty(example = "ee4a8e3a-9dfd-49e0-9ac8-ea2b6c76408c", value = "Unique identifier for the promise associated to the settlement.")
  public String getPromiseId() {
    return promiseId;
  }

  public void setPromiseId(String promiseId) {
    this.promiseId = promiseId;
  }

  public CardServiceSettlementResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Unique identifier for the order associated to the settlement.
   * @return orderId
  **/
  @ApiModelProperty(example = "f3392f8b-6116-4073-ab96-e330819e2c07", value = "Unique identifier for the order associated to the settlement.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public CardServiceSettlementResponse cards(List<CardServiceCard> cards) {
    this.cards = cards;
    return this;
  }

  public CardServiceSettlementResponse addCardsItem(CardServiceCard cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<CardServiceCard>();
    }
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * An array of Card objects.
   * @return cards
  **/
  @ApiModelProperty(value = "An array of Card objects.")
  public List<CardServiceCard> getCards() {
    return cards;
  }

  public void setCards(List<CardServiceCard> cards) {
    this.cards = cards;
  }

  public CardServiceSettlementResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Settlement creation datetime (ISO 8601).
   * @return createdAt
  **/
  @ApiModelProperty(example = "2018-12-03T10:26:06.000Z", value = "Settlement creation datetime (ISO 8601).")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CardServiceSettlementResponse expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Settlement expiration datetime (ISO 8601).
   * @return expiresAt
  **/
  @ApiModelProperty(example = "2018-12-04T10:26:06.000Z", value = "Settlement expiration datetime (ISO 8601).")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardServiceSettlementResponse settlementResponse = (CardServiceSettlementResponse) o;
    return Objects.equals(this.settlementId, settlementResponse.settlementId) &&
        Objects.equals(this.promiseId, settlementResponse.promiseId) &&
        Objects.equals(this.orderId, settlementResponse.orderId) &&
        Objects.equals(this.cards, settlementResponse.cards) &&
        Objects.equals(this.createdAt, settlementResponse.createdAt) &&
        Objects.equals(this.expiresAt, settlementResponse.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementId, promiseId, orderId, cards, createdAt, expiresAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardServiceSettlementResponse {\n");
    
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    promiseId: ").append(toIndentedString(promiseId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

