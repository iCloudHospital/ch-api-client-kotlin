
# PatientModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**userName** | **kotlin.String** |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**fullName** | **kotlin.String** |  |  [optional] [readonly]
**userType** | **kotlin.String** |  |  [optional]
**photo** | **kotlin.String** |  |  [optional]
**photoThumbnail** | **kotlin.String** |  |  [optional]
**timeZone** | **kotlin.String** |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]
**phone** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**gender** | [**Gender**](Gender.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**communicationUserId** | **kotlin.String** |  |  [optional]
**languages** | [**kotlin.collections.List&lt;UserLanguageModel&gt;**](UserLanguageModel.md) |  |  [optional]
**locations** | [**kotlin.collections.List&lt;UserLocationModel&gt;**](UserLocationModel.md) |  |  [optional]
**membership** | [**MembershipModel**](MembershipModel.md) |  |  [optional]



