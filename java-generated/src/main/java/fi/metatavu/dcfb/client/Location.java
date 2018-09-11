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
import fi.metatavu.dcfb.client.Address;
import fi.metatavu.dcfb.client.Coordinate;
import fi.metatavu.dcfb.client.LocalizedValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Location
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T17:17:53.564+03:00")
public class Location {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private List<LocalizedValue> name = new ArrayList<LocalizedValue>();

  @JsonProperty("coordinate")
  private Coordinate coordinate = null;

  @JsonProperty("address")
  private Address address = null;

  public Location id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Location id
   * @return id
  **/
  @ApiModelProperty(value = "Location id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Location name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  public Location addNameItem(LocalizedValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * Name of the location, multilingual
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the location, multilingual")
  public List<LocalizedValue> getName() {
    return name;
  }

  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  public Location coordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
    return this;
  }

   /**
   * Get coordinate
   * @return coordinate
  **/
  @ApiModelProperty(value = "")
  public Coordinate getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  public Location address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
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
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.coordinate, location.coordinate) &&
        Objects.equals(this.address, location.address);
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

