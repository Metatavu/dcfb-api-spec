package fi.metatavu.dcfb.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Price   {
  
  private @Valid String price = null;
  private @Valid String currency = null;

  /**
   * price with two decimal places. e.g. 13.00
   **/
  public Price price(String price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "price with two decimal places. e.g. 13.00")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * Currency code (ISO 4217)
   **/
  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "Currency code (ISO 4217)")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(price, price.price) &&
        Objects.equals(currency, price.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

