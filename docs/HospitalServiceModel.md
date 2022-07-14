
# HospitalServiceModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**languageCode** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional] [readonly]
**slug** | **kotlin.String** |  |  [optional] [readonly]
**confirmed** | **kotlin.Boolean** |  |  [optional] [readonly]
**order** | **kotlin.Int** |  |  [optional]
**photo** | **kotlin.String** |  |  [optional]
**photoThumbnail** | **kotlin.String** |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]
**description** | **kotlin.String** |  |  [optional] [readonly]
**overview** | **kotlin.String** |  |  [optional] [readonly]
**content** | **kotlin.String** |  |  [optional] [readonly]
**hospitalId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**hospitalName** | **kotlin.String** |  |  [optional] [readonly]
**hospitalSlug** | **kotlin.String** |  |  [optional] [readonly]
**specialtyName** | **kotlin.String** |  |  [optional] [readonly]
**hospitalSpecialtyName** | **kotlin.String** |  |  [optional]
**hospitalSpecialtySlug** | **kotlin.String** |  |  [optional]
**serviceCategoryId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**serviceCategoryName** | **kotlin.String** |  |  [optional]
**procedure** | [**Procedure**](Procedure.md) |  |  [optional]
**minPrice** | **kotlin.Double** |  |  [optional]
**maxPrice** | **kotlin.Double** |  |  [optional]
**priceReuqest** | **kotlin.Boolean** |  |  [optional]
**customStyle** | **kotlin.String** |  |  [optional]
**localizedUrls** | [**kotlin.collections.List&lt;LocalizedUrlModel&gt;**](LocalizedUrlModel.md) |  |  [optional] [readonly]
**medias** | [**kotlin.collections.List&lt;MediaModel&gt;**](MediaModel.md) |  |  [optional]



