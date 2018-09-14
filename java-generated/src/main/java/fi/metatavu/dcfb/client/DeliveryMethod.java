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
import fi.metatavu.dcfb.client.LocalizedValue;
import fi.metatavu.dcfb.client.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * DeliveryMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-14T11:23:51.934+03:00")
public class DeliveryMethod {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("title")
  private List<LocalizedValue> title = null;

  @JsonProperty("price")
  private Price price = null;

  public DeliveryMethod id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Delivery method id
   * @return id
  **/
  @ApiModelProperty(value = "Delivery method id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DeliveryMethod title(List<LocalizedValue> title) {
    this.title = title;
    return this;
  }

  public DeliveryMethod addTitleItem(LocalizedValue titleItem) {
    if (this.title == null) {
      this.title = new ArrayList<LocalizedValue>();
    }
    this.title.add(titleItem);
    return this;
  }

   /**
   * Title of the item, multilingual
   * @return title
  **/
  @ApiModelProperty(value = "Title of the item, multilingual")
  public List<LocalizedValue> getTitle() {
    return title;
  }

  public void setTitle(List<LocalizedValue> title) {
    this.title = title;
  }

  public DeliveryMethod price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryMethod deliveryMethod = (DeliveryMethod) o;
    return Objects.equals(this.id, deliveryMethod.id) &&
        Objects.equals(this.title, deliveryMethod.title) &&
        Objects.equals(this.price, deliveryMethod.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMethod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

