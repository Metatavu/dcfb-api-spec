package fi.metatavu.dcfb.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Coordinate   {
  
  private @Valid String crs = null;
  private @Valid String latitude = null;
  private @Valid String longitude = null;

  /**
   **/
  public Coordinate crs(String crs) {
    this.crs = crs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getCrs() {
    return crs;
  }
  public void setCrs(String crs) {
    this.crs = crs;
  }

  /**
   * latitude coordinate.
   **/
  public Coordinate latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(value = "latitude coordinate.")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  /**
   * longitude coordinate.
   **/
  public Coordinate longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(value = "longitude coordinate.")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinate coordinate = (Coordinate) o;
    return Objects.equals(crs, coordinate.crs) &&
        Objects.equals(latitude, coordinate.latitude) &&
        Objects.equals(longitude, coordinate.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crs, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinate {\n");
    
    sb.append("    crs: ").append(toIndentedString(crs)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

