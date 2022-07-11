
# ArticleContributorModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**articleId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**contributorId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**languageCode** | **kotlin.String** |  |  [optional]
**contributorName** | **kotlin.String** |  |  [optional] [readonly]
**contributorSlug** | **kotlin.String** |  |  [optional] [readonly]
**contributorConfirmed** | **kotlin.Boolean** |  |  [optional] [readonly]
**contributorEmail** | **kotlin.String** |  |  [optional]
**contributorPhoto** | **kotlin.String** |  |  [optional]
**contributorPhotoThumbnail** | **kotlin.String** |  |  [optional]
**type** | [**ContributionType**](ContributionType.md) |  |  [optional]
**filter** | **kotlin.String** |  |  [optional]
**order** | **kotlin.Int** |  |  [optional]
**auditableEntity** | [**AuditableEntity**](AuditableEntity.md) |  |  [optional]
**contributorDescription** | **kotlin.String** |  |  [optional] [readonly]
**contributorOverview** | **kotlin.String** |  |  [optional] [readonly]
**contributorContent** | **kotlin.String** |  |  [optional] [readonly]
**contributorSnsHandles** | [**kotlin.collections.List&lt;SnsHandle&gt;**](SnsHandle.md) |  |  [optional]
**localizedUrls** | [**kotlin.collections.List&lt;LocalizedUrlModel&gt;**](LocalizedUrlModel.md) |  |  [optional] [readonly]



