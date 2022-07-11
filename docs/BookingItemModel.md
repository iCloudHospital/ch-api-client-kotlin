
# BookingItemModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**languageCode** | **kotlin.String** |  |  [optional]
**patientId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**patientName** | **kotlin.String** |  |  [optional]
**patientPhoto** | **kotlin.String** |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**phone** | **kotlin.String** |  |  [optional]
**dateOfBirth** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**gender** | [**Gender**](Gender.md) |  |  [optional]
**comment** | **kotlin.String** |  |  [optional]
**hospitalId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**hospitalName** | **kotlin.String** |  |  [optional] [readonly]
**hospitalSlug** | **kotlin.String** |  |  [optional] [readonly]
**hospitalTimeZone** | **kotlin.String** |  |  [optional]
**dealId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**dealName** | **kotlin.String** |  |  [optional] [readonly]
**dealSlug** | **kotlin.String** |  |  [optional] [readonly]
**dealPackageId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**refundPolicy** | [**RefundPolicy**](RefundPolicy.md) |  |  [optional]
**quantity** | **kotlin.Int** |  |  [optional]
**approximateDateStart** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**approximateDateEnd** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**confirmedDateStart** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**confirmedDateEnd** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**fee** | **kotlin.Double** |  |  [optional]
**applicationFee** | **kotlin.Double** |  |  [optional]
**timeZone** | **kotlin.String** |  |  [optional]
**requestDate** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**status** | [**BookingStatus**](BookingStatus.md) |  |  [optional]
**rejectReason** | [**RejectReason**](RejectReason.md) |  |  [optional]
**rejectComment** | **kotlin.String** |  |  [optional]
**isOpen** | **kotlin.Boolean** |  |  [optional]
**isExternal** | **kotlin.Boolean** |  |  [optional]



