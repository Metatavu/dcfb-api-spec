package fi.metatavu.dcfb.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ItemReservation   {
  
  private @Valid UUID id = null;
  private @Valid Long amount = null;

  /**
   * Item id
   **/
  public ItemReservation id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Item id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public ItemReservation amount(Long amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemReservation itemReservation = (ItemReservation) o;
    return Objects.equals(id, itemReservation.id) &&
        Objects.equals(amount, itemReservation.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReservation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

