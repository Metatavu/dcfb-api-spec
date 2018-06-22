package fi.metatavu.dcfb.server.rest.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Key-value pair that can be used to add meta data to objects (items, categories, etc)
 **/
import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Key-value pair that can be used to add meta data to objects (items, categories, etc)")

public class Meta   {
  
  private @Valid String key = null;
  private @Valid String value = null;

  /**
   **/
  public Meta key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  public Meta value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(key, meta.key) &&
        Objects.equals(value, meta.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

