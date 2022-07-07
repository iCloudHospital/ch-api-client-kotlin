
# DoctorItemModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**languageCode** | **kotlin.String** |  |  [optional]
**userName** | **kotlin.String** |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional] [readonly]
**middleName** | **kotlin.String** |  |  [optional] [readonly]
**lastName** | **kotlin.String** |  |  [optional] [readonly]
**fullName** | **kotlin.String** |  |  [optional] [readonly]
**slug** | **kotlin.String** |  |  [optional] [readonly]
**confirmed** | **kotlin.Boolean** |  |  [optional] [readonly]
**userType** | **kotlin.String** |  |  [optional]
**photo** | **kotlin.String** |  |  [optional]
**photoThumbnail** | **kotlin.String** |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]
**consultationEnabled** | **kotlin.Boolean** |  |  [optional]
**consultationFee** | **kotlin.Double** |  |  [optional]
**doctorSpecialties** | [**kotlin.collections.List&lt;DoctorSpecialtyItemModel&gt;**](DoctorSpecialtyItemModel.md) |  |  [optional]
**doctorAffiliations** | [**kotlin.collections.List&lt;DoctorAffiliationItemModel&gt;**](DoctorAffiliationItemModel.md) |  |  [optional]



