package fi.metatavu.dcfb.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Image   {
  
  private @Valid UUID id = null;
  private @Valid String url = null;
  private @Valid String type = null;

  /**
   * Image id
   **/
  public Image id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Image id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Image URL
   **/
  public Image url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Image URL")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Image type
   **/
  public Image type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Image type")
  @NotNull
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
    return Objects.equals(id, image.id) &&
        Objects.equals(url, image.url) &&
        Objects.equals(type, image.type);
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

