package fi.metatavu.dcfb.server.rest.model;

import fi.metatavu.dcfb.server.rest.model.ExtraParam;
import fi.metatavu.dcfb.server.rest.model.LocalizedValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class PurchaseRequest   {
  
  private @Valid UUID id = null;
  private @Valid List<LocalizedValue> title = new ArrayList<LocalizedValue>();
  private @Valid List<LocalizedValue> description = new ArrayList<LocalizedValue>();
  private @Valid UUID categoryId = null;
  private @Valid String slug = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;
  private @Valid OffsetDateTime expiresAt = null;
  private @Valid String unit = null;
  private @Valid BigDecimal amount = null;
  private @Valid List<ExtraParam> extra = new ArrayList<ExtraParam>();

  /**
   * Purchase request id
   **/
  public PurchaseRequest id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Purchase request id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Title of the item, multilingual
   **/
  public PurchaseRequest title(List<LocalizedValue> title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Title of the item, multilingual")
  public List<LocalizedValue> getTitle() {
    return title;
  }
  public void setTitle(List<LocalizedValue> title) {
    this.title = title;
  }

  /**
   * Description of the item, multilingual
   **/
  public PurchaseRequest description(List<LocalizedValue> description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the item, multilingual")
  public List<LocalizedValue> getDescription() {
    return description;
  }
  public void setDescription(List<LocalizedValue> description) {
    this.description = description;
  }

  /**
   * Category id.
   **/
  public PurchaseRequest categoryId(UUID categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Category id.")
  public UUID getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(UUID categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Item slug
   **/
  public PurchaseRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

  
  @ApiModelProperty(value = "Item slug")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   **/
  public PurchaseRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public PurchaseRequest modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  /**
   **/
  public PurchaseRequest expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   **/
  public PurchaseRequest unit(String unit) {
    this.unit = unit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   **/
  public PurchaseRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Extra parameters
   **/
  public PurchaseRequest extra(List<ExtraParam> extra) {
    this.extra = extra;
    return this;
  }

  
  @ApiModelProperty(value = "Extra parameters")
  public List<ExtraParam> getExtra() {
    return extra;
  }
  public void setExtra(List<ExtraParam> extra) {
    this.extra = extra;
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
    return Objects.equals(id, purchaseRequest.id) &&
        Objects.equals(title, purchaseRequest.title) &&
        Objects.equals(description, purchaseRequest.description) &&
        Objects.equals(categoryId, purchaseRequest.categoryId) &&
        Objects.equals(slug, purchaseRequest.slug) &&
        Objects.equals(createdAt, purchaseRequest.createdAt) &&
        Objects.equals(modifiedAt, purchaseRequest.modifiedAt) &&
        Objects.equals(expiresAt, purchaseRequest.expiresAt) &&
        Objects.equals(unit, purchaseRequest.unit) &&
        Objects.equals(amount, purchaseRequest.amount) &&
        Objects.equals(extra, purchaseRequest.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, categoryId, slug, createdAt, modifiedAt, expiresAt, unit, amount, extra);
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
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

