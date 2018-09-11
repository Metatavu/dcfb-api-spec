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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * PurchaseRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T15:10:38.040+03:00")
public class PurchaseRequest {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("title")
  private List<LocalizedValue> title = null;

  @JsonProperty("description")
  private List<LocalizedValue> description = null;

  @JsonProperty("categoryId")
  private UUID categoryId = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("meta")
  private List<Meta> meta = null;

  public PurchaseRequest id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Purchase request id
   * @return id
  **/
  @ApiModelProperty(value = "Purchase request id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PurchaseRequest title(List<LocalizedValue> title) {
    this.title = title;
    return this;
  }

  public PurchaseRequest addTitleItem(LocalizedValue titleItem) {
    if (this.title == null) {
      this.title = new ArrayList<LocalizedValue>();
    }
    this.title.add(titleItem);
    return this;
  }

   /**
   * Title of the item, multilingual
   * @return title
  **/
  @ApiModelProperty(value = "Title of the item, multilingual")
  public List<LocalizedValue> getTitle() {
    return title;
  }

  public void setTitle(List<LocalizedValue> title) {
    this.title = title;
  }

  public PurchaseRequest description(List<LocalizedValue> description) {
    this.description = description;
    return this;
  }

  public PurchaseRequest addDescriptionItem(LocalizedValue descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<LocalizedValue>();
    }
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * Description of the item, multilingual
   * @return description
  **/
  @ApiModelProperty(value = "Description of the item, multilingual")
  public List<LocalizedValue> getDescription() {
    return description;
  }

  public void setDescription(List<LocalizedValue> description) {
    this.description = description;
  }

  public PurchaseRequest categoryId(UUID categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Category id.
   * @return categoryId
  **/
  @ApiModelProperty(value = "Category id.")
  public UUID getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(UUID categoryId) {
    this.categoryId = categoryId;
  }

  public PurchaseRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Item slug
   * @return slug
  **/
  @ApiModelProperty(value = "Item slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public PurchaseRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PurchaseRequest modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public PurchaseRequest expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public PurchaseRequest unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public PurchaseRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PurchaseRequest meta(List<Meta> meta) {
    this.meta = meta;
    return this;
  }

  public PurchaseRequest addMetaItem(Meta metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<Meta>();
    }
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Request meta
   * @return meta
  **/
  @ApiModelProperty(value = "Request meta")
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
    PurchaseRequest purchaseRequest = (PurchaseRequest) o;
    return Objects.equals(this.id, purchaseRequest.id) &&
        Objects.equals(this.title, purchaseRequest.title) &&
        Objects.equals(this.description, purchaseRequest.description) &&
        Objects.equals(this.categoryId, purchaseRequest.categoryId) &&
        Objects.equals(this.slug, purchaseRequest.slug) &&
        Objects.equals(this.createdAt, purchaseRequest.createdAt) &&
        Objects.equals(this.modifiedAt, purchaseRequest.modifiedAt) &&
        Objects.equals(this.expiresAt, purchaseRequest.expiresAt) &&
        Objects.equals(this.unit, purchaseRequest.unit) &&
        Objects.equals(this.amount, purchaseRequest.amount) &&
        Objects.equals(this.meta, purchaseRequest.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, categoryId, slug, createdAt, modifiedAt, expiresAt, unit, amount, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

