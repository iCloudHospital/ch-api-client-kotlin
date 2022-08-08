
# ServiceReviewModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**languageCode** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional] [readonly]
**slug** | **kotlin.String** |  |  [optional] [readonly]
**description** | **kotlin.String** |  |  [optional] [readonly]
**overview** | **kotlin.String** |  |  [optional] [readonly]
**content** | **kotlin.String** |  |  [optional] [readonly]
**confirmed** | **kotlin.Boolean** |  |  [optional] [readonly]
**serviceId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**serviceName** | **kotlin.String** |  |  [optional] [readonly]
**serviceSlug** | **kotlin.String** |  |  [optional] [readonly]
**hospitalId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**patientId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**patientName** | **kotlin.String** |  |  [optional]
**patientPhoto** | **kotlin.String** |  |  [optional]
**createdDate** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**recommended** | **kotlin.Boolean** |  |  [optional]
**rate** | **kotlin.Int** |  |  [optional]
**reviewType** | [**ReviewType**](ReviewType.md) |  |  [optional]
**medias** | [**kotlin.collections.List&lt;MediaModel&gt;**](MediaModel.md) |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]



