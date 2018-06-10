package fi.metatavu.dcfb.server.rest.model;

import fi.metatavu.dcfb.server.rest.model.LocalizedValue;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Address   {
  
  private @Valid String streetAddress = null;
  private @Valid String postalCode = null;
  private @Valid String postOffice = null;
  private @Valid String country = null;
  private @Valid List<LocalizedValue> additionalInformations = new ArrayList<LocalizedValue>();

  /**
   * Street address.
   **/
  public Address streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  
  @ApiModelProperty(value = "Street address.")
  public String getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  /**
   * Postal code, for example 00010.
   **/
  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  @ApiModelProperty(value = "Postal code, for example 00010.")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * Post office
   **/
  public Address postOffice(String postOffice) {
    this.postOffice = postOffice;
    return this;
  }

  
  @ApiModelProperty(value = "Post office")
  public String getPostOffice() {
    return postOffice;
  }
  public void setPostOffice(String postOffice) {
    this.postOffice = postOffice;
  }

  /**
   * Country code (ISO 3166-1 alpha-2), for example FI.
   **/
  public Address country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "Country code (ISO 3166-1 alpha-2), for example FI.")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Localized list of additional information about the address.
   **/
  public Address additionalInformations(List<LocalizedValue> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  
  @ApiModelProperty(value = "Localized list of additional information about the address.")
  public List<LocalizedValue> getAdditionalInformations() {
    return additionalInformations;
  }
  public void setAdditionalInformations(List<LocalizedValue> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(streetAddress, address.streetAddress) &&
        Objects.equals(postalCode, address.postalCode) &&
        Objects.equals(postOffice, address.postOffice) &&
        Objects.equals(country, address.country) &&
        Objects.equals(additionalInformations, address.additionalInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, postalCode, postOffice, country, additionalInformations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOffice: ").append(toIndentedString(postOffice)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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

