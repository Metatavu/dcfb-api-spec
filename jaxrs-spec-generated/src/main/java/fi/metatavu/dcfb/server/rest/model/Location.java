package fi.metatavu.dcfb.server.rest.model;

import fi.metatavu.dcfb.server.rest.model.Address;
import fi.metatavu.dcfb.server.rest.model.Coordinate;
import fi.metatavu.dcfb.server.rest.model.LocalizedValue;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Location   {
  
  private @Valid UUID id = null;
  private @Valid List<LocalizedValue> name = new ArrayList<LocalizedValue>();
  private @Valid Coordinate coordinate = null;
  private @Valid Address address = null;

  /**
   * Location id
   **/
  public Location id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Location id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Name of the location, multilingual
   **/
  public Location name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the location, multilingual")
  @NotNull
  public List<LocalizedValue> getName() {
    return name;
  }
  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  /**
   **/
  public Location coordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Coordinate getCoordinate() {
    return coordinate;
  }
  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  /**
   **/
  public Location address(Address address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(id, location.id) &&
        Objects.equals(name, location.name) &&
        Objects.equals(coordinate, location.coordinate) &&
        Objects.equals(address, location.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, coordinate, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

