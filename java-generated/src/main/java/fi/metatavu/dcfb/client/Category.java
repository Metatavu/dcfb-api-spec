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
import fi.metatavu.dcfb.client.Meta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Category
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T15:10:38.040+03:00")
public class Category {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("parentId")
  private UUID parentId = null;

  @JsonProperty("title")
  private List<LocalizedValue> title = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("meta")
  private List<Meta> meta = null;

  public Category id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Category id
   * @return id
  **/
  @ApiModelProperty(value = "Category id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Category parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Category parent id.
   * @return parentId
  **/
  @ApiModelProperty(value = "Category parent id.")
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  public Category title(List<LocalizedValue> title) {
    this.title = title;
    return this;
  }

  public Category addTitleItem(LocalizedValue titleItem) {
    if (this.title == null) {
      this.title = new ArrayList<LocalizedValue>();
    }
    this.title.add(titleItem);
    return this;
  }

   /**
   * Title of the category, multilingual
   * @return title
  **/
  @ApiModelProperty(value = "Title of the category, multilingual")
  public List<LocalizedValue> getTitle() {
    return title;
  }

  public void setTitle(List<LocalizedValue> title) {
    this.title = title;
  }

  public Category slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Category slug
   * @return slug
  **/
  @ApiModelProperty(value = "Category slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Category meta(List<Meta> meta) {
    this.meta = meta;
    return this;
  }

  public Category addMetaItem(Meta metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<Meta>();
    }
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Meta parameters
   * @return meta
  **/
  @ApiModelProperty(value = "Meta parameters")
  public List<Meta> getMeta() {
    return meta;
  }

  public void setMeta(List<Meta> meta) {
    this.meta = meta;
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
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.parentId, category.parentId) &&
        Objects.equals(this.title, category.title) &&
        Objects.equals(this.slug, category.slug) &&
        Objects.equals(this.meta, category.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, title, slug, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

