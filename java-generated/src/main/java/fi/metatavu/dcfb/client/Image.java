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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

/**
 * Image
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-08T15:33:21.752+03:00")
public class Image {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("type")
  private String type = null;

  public Image id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Image id
   * @return id
  **/
  @ApiModelProperty(value = "Image id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Image url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Image URL
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Image URL")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Image type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Image type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Image type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.id, image.id) &&
        Objects.equals(this.url, image.url) &&
        Objects.equals(this.type, image.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

