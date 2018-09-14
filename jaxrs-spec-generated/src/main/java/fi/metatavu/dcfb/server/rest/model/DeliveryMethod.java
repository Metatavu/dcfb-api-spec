package fi.metatavu.dcfb.server.rest.model;

import fi.metatavu.dcfb.server.rest.model.LocalizedValue;
import fi.metatavu.dcfb.server.rest.model.Price;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class DeliveryMethod   {
  
  private @Valid UUID id = null;
  private @Valid List<LocalizedValue> title = new ArrayList<LocalizedValue>();
  private @Valid Price price = null;

  /**
   * Delivery method id
   **/
  public DeliveryMethod id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Delivery method id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Title of the item, multilingual
   **/
  public DeliveryMethod title(List<LocalizedValue> title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Title of the item, multilingual")
  public List<LocalizedValue> getTitle() {
    return title;
  }
  public void setTitle(List<LocalizedValue> title) {
    this.title = title;
  }

  /**
   **/
  public DeliveryMethod price(Price price) {
    this.price = price;
    return this;
  }

  
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
    return Objects.equals(id, deliveryMethod.id) &&
        Objects.equals(title, deliveryMethod.title) &&
        Objects.equals(price, deliveryMethod.price);
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

