# DcfbApiClient.Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Item id | [optional] 
**typeOfBusiness** | **String** |  | 
**title** | [**[LocalizedValue]**](LocalizedValue.md) | Title of the item, multilingual | [optional] 
**description** | [**[LocalizedValue]**](LocalizedValue.md) | Description of the item, multilingual | [optional] 
**categoryId** | **String** | Category id. | 
**locationId** | **String** | Location id. | [optional] 
**resourceId** | **String** | Resource id. | [optional] 
**slug** | **String** | Item slug | [optional] 
**sellerId** | **String** | Sellers user id | [optional] 
**createdAt** | **Date** |  | [optional] 
**modifiedAt** | **Date** |  | [optional] 
**expiresAt** | **Date** |  | [optional] 
**images** | [**[Image]**](Image.md) |  | [optional] 
**visibleToUsers** | **[String]** |  | [optional] 
**visibilityLimited** | **Boolean** |  | [optional] 
**unitPrice** | [**Price**](Price.md) |  | [optional] 
**unit** | **String** |  | [optional] 
**amount** | **Number** |  | 
**reservedAmount** | **Number** |  | [optional] 
**soldAmount** | **Number** |  | [optional] 
**paymentMethods** | [**ItemPaymentMethods**](ItemPaymentMethods.md) |  | [optional] 
**deliveryPrice** | [**Price**](Price.md) |  | [optional] 
**allowDelivery** | **Boolean** |  | [optional] 
**allowPickup** | **Boolean** |  | [optional] 
**termsOfDelivery** | **String** |  | [optional] 
**deliveryTime** | **Number** |  | [optional] 
**contactEmail** | **String** |  | [optional] 
**contactPhone** | **String** |  | [optional] 
**businessName** | **String** |  | [optional] 
**businessCode** | **String** |  | [optional] 
**meta** | [**[Meta]**](Meta.md) | Item meta | [optional] 


<a name="TypeOfBusinessEnum"></a>
## Enum: TypeOfBusinessEnum


* `SALE` (value: `"SALE"`)

* `PURCHASE` (value: `"PURCHASE"`)




