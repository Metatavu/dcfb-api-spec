/*
 * DCFB API
 * API spec for DCFB API.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fi.metatavu.dcfb.client;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ItemPaymentMethods
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-13T23:02:20.911+03:00")
public class ItemPaymentMethods {
  @JsonProperty("allowCreditCard")
  private Boolean allowCreditCard = null;

  @JsonProperty("allowContactSeller")
  private Boolean allowContactSeller = null;

  public ItemPaymentMethods allowCreditCard(Boolean allowCreditCard) {
    this.allowCreditCard = allowCreditCard;
    return this;
  }

   /**
   * Get allowCreditCard
   * @return allowCreditCard
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAllowCreditCard() {
    return allowCreditCard;
  }

  public void setAllowCreditCard(Boolean allowCreditCard) {
    this.allowCreditCard = allowCreditCard;
  }

  public ItemPaymentMethods allowContactSeller(Boolean allowContactSeller) {
    this.allowContactSeller = allowContactSeller;
    return this;
  }

   /**
   * Get allowContactSeller
   * @return allowContactSeller
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAllowContactSeller() {
    return allowContactSeller;
  }

  public void setAllowContactSeller(Boolean allowContactSeller) {
    this.allowContactSeller = allowContactSeller;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPaymentMethods itemPaymentMethods = (ItemPaymentMethods) o;
    return Objects.equals(this.allowCreditCard, itemPaymentMethods.allowCreditCard) &&
        Objects.equals(this.allowContactSeller, itemPaymentMethods.allowContactSeller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCreditCard, allowContactSeller);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPaymentMethods {\n");
    
    sb.append("    allowCreditCard: ").append(toIndentedString(allowCreditCard)).append("\n");
    sb.append("    allowContactSeller: ").append(toIndentedString(allowContactSeller)).append("\n");
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

