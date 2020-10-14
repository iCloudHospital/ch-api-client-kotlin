
# Consultation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**consultationType** | [**ConsultationType**](ConsultationType.md) |  |  [optional]
**patientId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**patient** | [**Patient**](Patient.md) |  |  [optional]
**hospitalId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**hospital** | [**Hospital**](Hospital.md) |  |  [optional]
**specialtyId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**specialty** | [**Specialty**](Specialty.md) |  |  [optional]
**doctorId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**doctor** | [**Doctor**](Doctor.md) |  |  [optional]
**dealId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**deal** | [**Deal**](Deal.md) |  |  [optional]
**language** | **kotlin.String** |  |  [optional]
**isAccountHolder** | **kotlin.Boolean** |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**phone** | **kotlin.String** |  |  [optional]
**dateOfBirth** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**gender** | [**Gender**](Gender.md) |  |  [optional]
**comment** | **kotlin.String** |  |  [optional]
**approximateDateStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**approximateDateEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**confirmedDateStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**confirmedDateEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**caller** | [**User**](User.md) |  |  [optional]
**callerId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**fee** | **kotlin.Double** |  |  [optional]
**applicationFee** | **kotlin.Double** |  |  [optional]
**status** | [**ConsultationStatus**](ConsultationStatus.md) |  |  [optional]
**rejectReason** | [**RejectReason**](RejectReason.md) |  |  [optional]
**rejectComment** | **kotlin.String** |  |  [optional]
**isOpen** | **kotlin.Boolean** |  |  [optional]
**paymentId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**payment** | [**Payment**](Payment.md) |  |  [optional]
**timeZone** | **kotlin.String** |  |  [optional]
**statusChangeLogs** | [**kotlin.collections.List&lt;ChangeLog&gt;**](ChangeLog.md) |  |  [optional]
**medias** | [**kotlin.collections.List&lt;Media&gt;**](Media.md) |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]



