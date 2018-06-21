package fi.metatavu.dcfb.server.rest.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Name-value pair that can be used to add extra parameters to objects (items, categories)
 **/
import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Name-value pair that can be used to add extra parameters to objects (items, categories)")

public class ExtraParam   {
  
  private @Valid String name = null;
  private @Valid String value = null;

  /**
   **/
  public ExtraParam name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ExtraParam value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    ExtraParam extraParam = (ExtraParam) o;
    return Objects.equals(name, extraParam.name) &&
        Objects.equals(value, extraParam.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraParam {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

