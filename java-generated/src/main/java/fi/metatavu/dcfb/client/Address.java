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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-18T11:22:18.477+03:00")
public class Address {
  @JsonProperty("streetAddress")
  private String streetAddress = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("postOffice")
  private String postOffice = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("additionalInformations")
  private List<LocalizedValue> additionalInformations = null;

  public Address streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address.
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street address.")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code, for example 00010.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code, for example 00010.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address postOffice(String postOffice) {
    this.postOffice = postOffice;
    return this;
  }

   /**
   * Post office
   * @return postOffice
  **/
  @ApiModelProperty(value = "Post office")
  public String getPostOffice() {
    return postOffice;
  }

  public void setPostOffice(String postOffice) {
    this.postOffice = postOffice;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country code (ISO 3166-1 alpha-2), for example FI.
   * @return country
  **/
  @ApiModelProperty(value = "Country code (ISO 3166-1 alpha-2), for example FI.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address additionalInformations(List<LocalizedValue> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public Address addAdditionalInformationsItem(LocalizedValue additionalInformationsItem) {
    if (this.additionalInformations == null) {
      this.additionalInformations = new ArrayList<LocalizedValue>();
    }
    this.additionalInformations.add(additionalInformationsItem);
    return this;
  }

   /**
   * Localized list of additional information about the address.
   * @return additionalInformations
  **/
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
    return Objects.equals(this.streetAddress, address.streetAddress) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.postOffice, address.postOffice) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.additionalInformations, address.additionalInformations);
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

