package fi.metatavu.dcfb.server.rest.model;

import fi.metatavu.dcfb.server.rest.model.Image;
import fi.metatavu.dcfb.server.rest.model.LocalizedValue;
import fi.metatavu.dcfb.server.rest.model.Meta;
import fi.metatavu.dcfb.server.rest.model.Price;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Item   {
  
  private @Valid UUID id = null;
  private @Valid List<LocalizedValue> title = new ArrayList<LocalizedValue>();
  private @Valid List<LocalizedValue> description = new ArrayList<LocalizedValue>();
  private @Valid UUID categoryId = null;
  private @Valid UUID locationId = null;
  private @Valid String slug = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;
  private @Valid OffsetDateTime expiresAt = null;
  private @Valid List<Image> images = new ArrayList<Image>();
  private @Valid Price unitPrice = null;
  private @Valid String unit = null;
  private @Valid Long amount = null;
  private @Valid List<Meta> meta = new ArrayList<Meta>();

  /**
   * Item id
   **/
  public Item id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Item id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Title of the item, multilingual
   **/
  public Item title(List<LocalizedValue> title) {
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
  public Item description(List<LocalizedValue> description) {
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
  public Item categoryId(UUID categoryId) {
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
   * Location id.
   **/
  public Item locationId(UUID locationId) {
    this.locationId = locationId;
    return this;
  }

  
  @ApiModelProperty(value = "Location id.")
  public UUID getLocationId() {
    return locationId;
  }
  public void setLocationId(UUID locationId) {
    this.locationId = locationId;
  }

  /**
   * Item slug
   **/
  public Item slug(String slug) {
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
  public Item createdAt(OffsetDateTime createdAt) {
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
  public Item modifiedAt(OffsetDateTime modifiedAt) {
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
  public Item expiresAt(OffsetDateTime expiresAt) {
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
  public Item images(List<Image> images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }

  /**
   **/
  public Item unitPrice(Price unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Price getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(Price unitPrice) {
    this.unitPrice = unitPrice;
  }

  /**
   **/
  public Item unit(String unit) {
    this.unit = unit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   **/
  public Item amount(Long amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * Item meta
   **/
  public Item meta(List<Meta> meta) {
    this.meta = meta;
    return this;
  }

  
  @ApiModelProperty(value = "Item meta")
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
    Item item = (Item) o;
    return Objects.equals(id, item.id) &&
        Objects.equals(title, item.title) &&
        Objects.equals(description, item.description) &&
        Objects.equals(categoryId, item.categoryId) &&
        Objects.equals(locationId, item.locationId) &&
        Objects.equals(slug, item.slug) &&
        Objects.equals(createdAt, item.createdAt) &&
        Objects.equals(modifiedAt, item.modifiedAt) &&
        Objects.equals(expiresAt, item.expiresAt) &&
        Objects.equals(images, item.images) &&
        Objects.equals(unitPrice, item.unitPrice) &&
        Objects.equals(unit, item.unit) &&
        Objects.equals(amount, item.amount) &&
        Objects.equals(meta, item.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, categoryId, locationId, slug, createdAt, modifiedAt, expiresAt, images, unitPrice, unit, amount, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

