
# Booking

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**patientId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**patient** | [**Patient**](Patient.md) |  |  [optional]
**hospitalId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**hospital** | [**Hospital**](Hospital.md) |  |  [optional]
**dealPackageId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**dealPackage** | [**DealPackage**](DealPackage.md) |  |  [optional]
**quantity** | **kotlin.Int** |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**phone** | **kotlin.String** |  |  [optional]
**dateOfBirth** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**gender** | [**Gender**](Gender.md) |  |  [optional]
**comment** | **kotlin.String** |  |  [optional]
**approximateDateStart** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**approximateDateEnd** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**confirmedDateStart** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**confirmedDateEnd** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**fee** | **kotlin.Double** |  |  [optional]
**applicationFee** | **kotlin.Double** |  |  [optional]
**status** | [**BookingStatus**](BookingStatus.md) |  |  [optional]
**rejectReason** | [**RejectReason**](RejectReason.md) |  |  [optional]
**rejectComment** | **kotlin.String** |  |  [optional]
**isOpen** | **kotlin.Boolean** |  |  [optional]
**paymentId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**payment** | [**Payment**](Payment.md) |  |  [optional]
**timeZone** | **kotlin.String** |  |  [optional]
**statusChangeLogs** | [**kotlin.Array&lt;ChangeLog&gt;**](ChangeLog.md) |  |  [optional]
**medias** | [**kotlin.Array&lt;Media&gt;**](Media.md) |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]



