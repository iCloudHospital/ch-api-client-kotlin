
# DoctorModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**userName** | **kotlin.String** |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**middleName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**fullName** | **kotlin.String** |  |  [optional] [readonly]
**slug** | **kotlin.String** |  |  [optional]
**phone** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**photo** | **kotlin.String** |  |  [optional]
**photoThumbnail** | **kotlin.String** |  |  [optional]
**gender** | [**Gender**](Gender.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**timeZone** | **kotlin.String** |  |  [optional]
**communicationUserId** | **kotlin.String** |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]
**userType** | **kotlin.String** |  |  [optional]
**languages** | [**kotlin.collections.List&lt;UserLanguageModel&gt;**](UserLanguageModel.md) |  |  [optional]
**locations** | [**kotlin.collections.List&lt;UserLocationModel&gt;**](UserLocationModel.md) |  |  [optional]
**languageCode** | **kotlin.String** |  |  [optional]
**startPracticeDate** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**overview** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**content** | **kotlin.String** |  |  [optional]
**consultationEnabled** | **kotlin.Boolean** |  |  [optional]
**consultationFee** | **kotlin.Double** |  |  [optional]
**confirmed** | **kotlin.Boolean** |  |  [optional]
**doctorSpecialties** | [**kotlin.collections.List&lt;DoctorSpecialtyItemModel&gt;**](DoctorSpecialtyItemModel.md) |  |  [optional]
**doctorAffiliations** | [**kotlin.collections.List&lt;DoctorAffiliationModel&gt;**](DoctorAffiliationModel.md) |  |  [optional]
**translations** | [**kotlin.collections.List&lt;UserTranslationModel&gt;**](UserTranslationModel.md) |  |  [optional]
**localizedUrls** | [**kotlin.collections.List&lt;LocalizedUrlModel&gt;**](LocalizedUrlModel.md) |  |  [optional]



