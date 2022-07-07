
# ServiceReviewItemModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**serviceId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**serviceName** | **kotlin.String** |  |  [optional]
**patientId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**patientName** | **kotlin.String** |  |  [optional]
**patientGender** | [**Gender**](Gender.md) |  |  [optional]
**patientPhoto** | **kotlin.String** |  |  [optional]
**patientPhotoThumbnail** | **kotlin.String** |  |  [optional]
**patientCreatedDate** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**body** | **kotlin.String** |  |  [optional]
**recommended** | **kotlin.Boolean** |  |  [optional]
**rate** | **kotlin.Int** |  |  [optional]
**reviewType** | [**ReviewType**](ReviewType.md) |  |  [optional]
**confirmed** | **kotlin.Boolean** |  |  [optional]
**medias** | [**kotlin.collections.List&lt;MediaModel&gt;**](MediaModel.md) |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]



