package fi.metatavu.dcfb.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ItemPaymentMethods   {
  
  private @Valid Boolean allowCreditCard = null;
  private @Valid Boolean allowContactSeller = null;

  /**
   **/
  public ItemPaymentMethods allowCreditCard(Boolean allowCreditCard) {
    this.allowCreditCard = allowCreditCard;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Boolean isAllowCreditCard() {
    return allowCreditCard;
  }
  public void setAllowCreditCard(Boolean allowCreditCard) {
    this.allowCreditCard = allowCreditCard;
  }

  /**
   **/
  public ItemPaymentMethods allowContactSeller(Boolean allowContactSeller) {
    this.allowContactSeller = allowContactSeller;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(allowCreditCard, itemPaymentMethods.allowCreditCard) &&
        Objects.equals(allowContactSeller, itemPaymentMethods.allowContactSeller);
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

