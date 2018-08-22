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
import fi.metatavu.dcfb.client.Image;
import fi.metatavu.dcfb.client.LocalizedValue;
import fi.metatavu.dcfb.client.Meta;
import fi.metatavu.dcfb.client.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Item
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-22T10:06:06.006+03:00")
public class Item {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("title")
  private List<LocalizedValue> title = null;

  @JsonProperty("description")
  private List<LocalizedValue> description = null;

  @JsonProperty("categoryId")
  private UUID categoryId = null;

  @JsonProperty("locationId")
  private UUID locationId = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("sellerId")
  private UUID sellerId = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("images")
  private List<Image> images = null;

  @JsonProperty("visibleToUsers")
  private List<UUID> visibleToUsers = null;

  @JsonProperty("visibilityLimited")
  private Boolean visibilityLimited = null;

  @JsonProperty("unitPrice")
  private Price unitPrice = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("amount")
  private Long amount = null;

  @JsonProperty("reservedAmount")
  private Long reservedAmount = null;

  @JsonProperty("soldAmount")
  private Long soldAmount = null;

  @JsonProperty("meta")
  private List<Meta> meta = null;

  public Item id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Item id
   * @return id
  **/
  @ApiModelProperty(value = "Item id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Item title(List<LocalizedValue> title) {
    this.title = title;
    return this;
  }

  public Item addTitleItem(LocalizedValue titleItem) {
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

  public Item description(List<LocalizedValue> description) {
    this.description = description;
    return this;
  }

  public Item addDescriptionItem(LocalizedValue descriptionItem) {
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

  public Item categoryId(UUID categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Category id.
   * @return categoryId
  **/
  @ApiModelProperty(required = true, value = "Category id.")
  public UUID getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(UUID categoryId) {
    this.categoryId = categoryId;
  }

  public Item locationId(UUID locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Location id.
   * @return locationId
  **/
  @ApiModelProperty(value = "Location id.")
  public UUID getLocationId() {
    return locationId;
  }

  public void setLocationId(UUID locationId) {
    this.locationId = locationId;
  }

  public Item slug(String slug) {
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

  public Item sellerId(UUID sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * Sellers user id
   * @return sellerId
  **/
  @ApiModelProperty(value = "Sellers user id")
  public UUID getSellerId() {
    return sellerId;
  }

  public void setSellerId(UUID sellerId) {
    this.sellerId = sellerId;
  }

  public Item createdAt(OffsetDateTime createdAt) {
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

  public Item modifiedAt(OffsetDateTime modifiedAt) {
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

  public Item expiresAt(OffsetDateTime expiresAt) {
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

  public Item images(List<Image> images) {
    this.images = images;
    return this;
  }

  public Item addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<Image>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public Item visibleToUsers(List<UUID> visibleToUsers) {
    this.visibleToUsers = visibleToUsers;
    return this;
  }

  public Item addVisibleToUsersItem(UUID visibleToUsersItem) {
    if (this.visibleToUsers == null) {
      this.visibleToUsers = new ArrayList<UUID>();
    }
    this.visibleToUsers.add(visibleToUsersItem);
    return this;
  }

   /**
   * Get visibleToUsers
   * @return visibleToUsers
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getVisibleToUsers() {
    return visibleToUsers;
  }

  public void setVisibleToUsers(List<UUID> visibleToUsers) {
    this.visibleToUsers = visibleToUsers;
  }

  public Item visibilityLimited(Boolean visibilityLimited) {
    this.visibilityLimited = visibilityLimited;
    return this;
  }

   /**
   * Get visibilityLimited
   * @return visibilityLimited
  **/
  @ApiModelProperty(value = "")
  public Boolean isVisibilityLimited() {
    return visibilityLimited;
  }

  public void setVisibilityLimited(Boolean visibilityLimited) {
    this.visibilityLimited = visibilityLimited;
  }

  public Item unitPrice(Price unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "")
  public Price getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Price unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Item unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Item amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Item reservedAmount(Long reservedAmount) {
    this.reservedAmount = reservedAmount;
    return this;
  }

   /**
   * Get reservedAmount
   * @return reservedAmount
  **/
  @ApiModelProperty(value = "")
  public Long getReservedAmount() {
    return reservedAmount;
  }

  public void setReservedAmount(Long reservedAmount) {
    this.reservedAmount = reservedAmount;
  }

  public Item soldAmount(Long soldAmount) {
    this.soldAmount = soldAmount;
    return this;
  }

   /**
   * Get soldAmount
   * @return soldAmount
  **/
  @ApiModelProperty(value = "")
  public Long getSoldAmount() {
    return soldAmount;
  }

  public void setSoldAmount(Long soldAmount) {
    this.soldAmount = soldAmount;
  }

  public Item meta(List<Meta> meta) {
    this.meta = meta;
    return this;
  }

  public Item addMetaItem(Meta metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<Meta>();
    }
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Item meta
   * @return meta
  **/
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
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.title, item.title) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.categoryId, item.categoryId) &&
        Objects.equals(this.locationId, item.locationId) &&
        Objects.equals(this.slug, item.slug) &&
        Objects.equals(this.sellerId, item.sellerId) &&
        Objects.equals(this.createdAt, item.createdAt) &&
        Objects.equals(this.modifiedAt, item.modifiedAt) &&
        Objects.equals(this.expiresAt, item.expiresAt) &&
        Objects.equals(this.images, item.images) &&
        Objects.equals(this.visibleToUsers, item.visibleToUsers) &&
        Objects.equals(this.visibilityLimited, item.visibilityLimited) &&
        Objects.equals(this.unitPrice, item.unitPrice) &&
        Objects.equals(this.unit, item.unit) &&
        Objects.equals(this.amount, item.amount) &&
        Objects.equals(this.reservedAmount, item.reservedAmount) &&
        Objects.equals(this.soldAmount, item.soldAmount) &&
        Objects.equals(this.meta, item.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, categoryId, locationId, slug, sellerId, createdAt, modifiedAt, expiresAt, images, visibleToUsers, visibilityLimited, unitPrice, unit, amount, reservedAmount, soldAmount, meta);
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
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    visibleToUsers: ").append(toIndentedString(visibleToUsers)).append("\n");
    sb.append("    visibilityLimited: ").append(toIndentedString(visibilityLimited)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reservedAmount: ").append(toIndentedString(reservedAmount)).append("\n");
    sb.append("    soldAmount: ").append(toIndentedString(soldAmount)).append("\n");
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

