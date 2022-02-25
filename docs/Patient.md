
# Patient

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**userName** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**normalizedName** | **kotlin.String** |  |  [optional]
**phone** | **kotlin.String** |  |  [optional]
**photo** | **kotlin.String** |  |  [optional]
**photoThumbnail** | **kotlin.String** |  |  [optional]
**gender** | [**Gender**](Gender.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**timeZone** | **kotlin.String** |  |  [optional]
**communicationUserId** | **kotlin.String** |  |  [optional]
**fullName** | **kotlin.String** |  |  [optional] [readonly]
**devices** | [**kotlin.collections.List&lt;Device&gt;**](Device.md) |  |  [optional]
**articles** | [**kotlin.collections.List&lt;Article&gt;**](Article.md) |  |  [optional]
**questionComments** | [**kotlin.collections.List&lt;QuestionComment&gt;**](QuestionComment.md) |  |  [optional]
**locations** | [**kotlin.collections.List&lt;UserLocation&gt;**](UserLocation.md) |  |  [optional]
**languages** | [**kotlin.collections.List&lt;UserLanguage&gt;**](UserLanguage.md) |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]
**contact** | **kotlin.String** |  |  [optional]
**contactNumber** | **kotlin.String** |  |  [optional]
**nationality** | **kotlin.String** |  |  [optional]
**healthProfile** | [**HealthProfile**](HealthProfile.md) |  |  [optional]
**membershipId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**membership** | [**Membership**](Membership.md) |  |  [optional]
**questions** | [**kotlin.collections.List&lt;Question&gt;**](Question.md) |  |  [optional]
**bookings** | [**kotlin.collections.List&lt;Booking&gt;**](Booking.md) |  |  [optional]
**consultations** | [**kotlin.collections.List&lt;Consultation&gt;**](Consultation.md) |  |  [optional]
**payments** | [**kotlin.collections.List&lt;Payment&gt;**](Payment.md) |  |  [optional]
**customers** | [**kotlin.collections.List&lt;Customer&gt;**](Customer.md) |  |  [optional]
**doctorReviews** | [**kotlin.collections.List&lt;DoctorReview&gt;**](DoctorReview.md) |  |  [optional]
**hospitalReviews** | [**kotlin.collections.List&lt;HospitalReview&gt;**](HospitalReview.md) |  |  [optional]
**serviceReviews** | [**kotlin.collections.List&lt;ServiceReview&gt;**](ServiceReview.md) |  |  [optional]



