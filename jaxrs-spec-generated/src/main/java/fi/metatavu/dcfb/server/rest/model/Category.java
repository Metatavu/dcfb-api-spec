package fi.metatavu.dcfb.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Category   {
  
  private @Valid UUID id = null;
  private @Valid UUID parentId = null;
  private @Valid String slug = null;

  /**
   * Category id
   **/
  public Category id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Category id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Category parent id.
   **/
  public Category parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Category parent id.")
  public UUID getParentId() {
    return parentId;
  }
  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  /**
   * Category slug
   **/
  public Category slug(String slug) {
    this.slug = slug;
    return this;
  }

  
  @ApiModelProperty(value = "Category slug")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(id, category.id) &&
        Objects.equals(parentId, category.parentId) &&
        Objects.equals(slug, category.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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

