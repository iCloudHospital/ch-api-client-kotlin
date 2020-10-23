
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**patientId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**patient** | [**Patient**](Patient.md) |  |  [optional]
**customerId** | **kotlin.String** |  |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**chargeId** | **kotlin.String** |  |  [optional]
**refundId** | **kotlin.String** |  |  [optional]
**chargeStatus** | [**ChargeStatus**](ChargeStatus.md) |  |  [optional]
**refundStatus** | [**RefundStatus**](RefundStatus.md) |  |  [optional]
**paymentStatus** | [**PaymentStatus**](PaymentStatus.md) |  |  [optional]
**isFullPayment** | **kotlin.Boolean** |  |  [optional]
**currency** | **kotlin.String** |  |  [optional]
**fee** | **kotlin.Double** |  |  [optional]
**applicationFee** | **kotlin.Double** |  |  [optional]
**cardBrand** | **kotlin.String** |  |  [optional]
**cardLast4Digits** | **kotlin.String** |  |  [optional]
**chargeStatusChangeLogs** | [**kotlin.Array&lt;ChangeLog&gt;**](ChangeLog.md) |  |  [optional]
**refundStatusChangeLogs** | [**kotlin.Array&lt;ChangeLog&gt;**](ChangeLog.md) |  |  [optional]
**paymentStatusChangeLogs** | [**kotlin.Array&lt;ChangeLog&gt;**](ChangeLog.md) |  |  [optional]



