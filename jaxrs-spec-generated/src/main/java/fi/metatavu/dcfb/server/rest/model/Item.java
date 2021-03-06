package fi.metatavu.dcfb.server.rest.model;

import fi.metatavu.dcfb.server.rest.model.Image;
import fi.metatavu.dcfb.server.rest.model.ItemPaymentMethods;
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

public enum TypeOfBusinessEnum {

    SALE(String.valueOf("SALE")), PURCHASE(String.valueOf("PURCHASE"));


    private String value;

    TypeOfBusinessEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeOfBusinessEnum fromValue(String v) {
        for (TypeOfBusinessEnum b : TypeOfBusinessEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private @Valid TypeOfBusinessEnum typeOfBusiness = null;
  private @Valid List<LocalizedValue> title = new ArrayList<LocalizedValue>();
  private @Valid List<LocalizedValue> description = new ArrayList<LocalizedValue>();
  private @Valid UUID categoryId = null;
  private @Valid UUID locationId = null;
  private @Valid UUID resourceId = null;
  private @Valid String slug = null;
  private @Valid UUID sellerId = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;
  private @Valid OffsetDateTime expiresAt = null;
  private @Valid List<Image> images = new ArrayList<Image>();
  private @Valid List<UUID> visibleToUsers = new ArrayList<UUID>();
  private @Valid Boolean visibilityLimited = null;
  private @Valid Price unitPrice = null;
  private @Valid String unit = null;
  private @Valid Long amount = null;
  private @Valid Long reservedAmount = null;
  private @Valid Long soldAmount = null;
  private @Valid ItemPaymentMethods paymentMethods = null;
  private @Valid Price deliveryPrice = null;
  private @Valid Boolean allowDelivery = null;
  private @Valid Boolean allowPickup = null;
  private @Valid String termsOfDelivery = null;
  private @Valid Integer deliveryTime = null;
  private @Valid String contactEmail = null;
  private @Valid String contactPhone = null;
  private @Valid String businessName = null;
  private @Valid String businessCode = null;
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
   **/
  public Item typeOfBusiness(TypeOfBusinessEnum typeOfBusiness) {
    this.typeOfBusiness = typeOfBusiness;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public TypeOfBusinessEnum getTypeOfBusiness() {
    return typeOfBusiness;
  }
  public void setTypeOfBusiness(TypeOfBusinessEnum typeOfBusiness) {
    this.typeOfBusiness = typeOfBusiness;
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

  
  @ApiModelProperty(required = true, value = "Category id.")
  @NotNull
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
   * Resource id.
   **/
  public Item resourceId(UUID resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  
  @ApiModelProperty(value = "Resource id.")
  public UUID getResourceId() {
    return resourceId;
  }
  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
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
   * Sellers user id
   **/
  public Item sellerId(UUID sellerId) {
    this.sellerId = sellerId;
    return this;
  }

  
  @ApiModelProperty(value = "Sellers user id")
  public UUID getSellerId() {
    return sellerId;
  }
  public void setSellerId(UUID sellerId) {
    this.sellerId = sellerId;
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
  public Item visibleToUsers(List<UUID> visibleToUsers) {
    this.visibleToUsers = visibleToUsers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public List<UUID> getVisibleToUsers() {
    return visibleToUsers;
  }
  public void setVisibleToUsers(List<UUID> visibleToUsers) {
    this.visibleToUsers = visibleToUsers;
  }

  /**
   **/
  public Item visibilityLimited(Boolean visibilityLimited) {
    this.visibilityLimited = visibilityLimited;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Boolean isVisibilityLimited() {
    return visibilityLimited;
  }
  public void setVisibilityLimited(Boolean visibilityLimited) {
    this.visibilityLimited = visibilityLimited;
  }

  /**
   **/
  public Item unitPrice(Price unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

  
  @ApiModelProperty(value = "")
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
   **/
  public Item reservedAmount(Long reservedAmount) {
    this.reservedAmount = reservedAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Long getReservedAmount() {
    return reservedAmount;
  }
  public void setReservedAmount(Long reservedAmount) {
    this.reservedAmount = reservedAmount;
  }

  /**
   **/
  public Item soldAmount(Long soldAmount) {
    this.soldAmount = soldAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Long getSoldAmount() {
    return soldAmount;
  }
  public void setSoldAmount(Long soldAmount) {
    this.soldAmount = soldAmount;
  }

  /**
   **/
  public Item paymentMethods(ItemPaymentMethods paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public ItemPaymentMethods getPaymentMethods() {
    return paymentMethods;
  }
  public void setPaymentMethods(ItemPaymentMethods paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  /**
   **/
  public Item deliveryPrice(Price deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Price getDeliveryPrice() {
    return deliveryPrice;
  }
  public void setDeliveryPrice(Price deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  /**
   **/
  public Item allowDelivery(Boolean allowDelivery) {
    this.allowDelivery = allowDelivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Boolean isAllowDelivery() {
    return allowDelivery;
  }
  public void setAllowDelivery(Boolean allowDelivery) {
    this.allowDelivery = allowDelivery;
  }

  /**
   **/
  public Item allowPickup(Boolean allowPickup) {
    this.allowPickup = allowPickup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Boolean isAllowPickup() {
    return allowPickup;
  }
  public void setAllowPickup(Boolean allowPickup) {
    this.allowPickup = allowPickup;
  }

  /**
   **/
  public Item termsOfDelivery(String termsOfDelivery) {
    this.termsOfDelivery = termsOfDelivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getTermsOfDelivery() {
    return termsOfDelivery;
  }
  public void setTermsOfDelivery(String termsOfDelivery) {
    this.termsOfDelivery = termsOfDelivery;
  }

  /**
   **/
  public Item deliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Integer getDeliveryTime() {
    return deliveryTime;
  }
  public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  /**
   **/
  public Item contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getContactEmail() {
    return contactEmail;
  }
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  /**
   **/
  public Item contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getContactPhone() {
    return contactPhone;
  }
  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  /**
   **/
  public Item businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   **/
  public Item businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getBusinessCode() {
    return businessCode;
  }
  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
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
        Objects.equals(typeOfBusiness, item.typeOfBusiness) &&
        Objects.equals(title, item.title) &&
        Objects.equals(description, item.description) &&
        Objects.equals(categoryId, item.categoryId) &&
        Objects.equals(locationId, item.locationId) &&
        Objects.equals(resourceId, item.resourceId) &&
        Objects.equals(slug, item.slug) &&
        Objects.equals(sellerId, item.sellerId) &&
        Objects.equals(createdAt, item.createdAt) &&
        Objects.equals(modifiedAt, item.modifiedAt) &&
        Objects.equals(expiresAt, item.expiresAt) &&
        Objects.equals(images, item.images) &&
        Objects.equals(visibleToUsers, item.visibleToUsers) &&
        Objects.equals(visibilityLimited, item.visibilityLimited) &&
        Objects.equals(unitPrice, item.unitPrice) &&
        Objects.equals(unit, item.unit) &&
        Objects.equals(amount, item.amount) &&
        Objects.equals(reservedAmount, item.reservedAmount) &&
        Objects.equals(soldAmount, item.soldAmount) &&
        Objects.equals(paymentMethods, item.paymentMethods) &&
        Objects.equals(deliveryPrice, item.deliveryPrice) &&
        Objects.equals(allowDelivery, item.allowDelivery) &&
        Objects.equals(allowPickup, item.allowPickup) &&
        Objects.equals(termsOfDelivery, item.termsOfDelivery) &&
        Objects.equals(deliveryTime, item.deliveryTime) &&
        Objects.equals(contactEmail, item.contactEmail) &&
        Objects.equals(contactPhone, item.contactPhone) &&
        Objects.equals(businessName, item.businessName) &&
        Objects.equals(businessCode, item.businessCode) &&
        Objects.equals(meta, item.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, typeOfBusiness, title, description, categoryId, locationId, resourceId, slug, sellerId, createdAt, modifiedAt, expiresAt, images, visibleToUsers, visibilityLimited, unitPrice, unit, amount, reservedAmount, soldAmount, paymentMethods, deliveryPrice, allowDelivery, allowPickup, termsOfDelivery, deliveryTime, contactEmail, contactPhone, businessName, businessCode, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeOfBusiness: ").append(toIndentedString(typeOfBusiness)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    deliveryPrice: ").append(toIndentedString(deliveryPrice)).append("\n");
    sb.append("    allowDelivery: ").append(toIndentedString(allowDelivery)).append("\n");
    sb.append("    allowPickup: ").append(toIndentedString(allowPickup)).append("\n");
    sb.append("    termsOfDelivery: ").append(toIndentedString(termsOfDelivery)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
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

