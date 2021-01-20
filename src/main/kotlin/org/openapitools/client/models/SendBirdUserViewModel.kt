/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 1
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param phoneNumber 
 * @param hasEverLoggedIn 
 * @param sessionTokens 
 * @param userId 
 * @param accessToken 
 * @param preferredLanguages 
 * @param createdAt 
 * @param isActive 
 * @param locale 
 * @param discoveryKeys 
 * @param isOnline 
 * @param lastSeenAt 
 * @param isShadowBlocked 
 * @param nickname 
 * @param profileUrl 
 */

data class SendBirdUserViewModel (
    @SerializedName("phone_number")
    val phoneNumber: kotlin.String? = null,
    @SerializedName("has_ever_logged_in")
    val hasEverLoggedIn: kotlin.Boolean? = null,
    @SerializedName("session_tokens")
    val sessionTokens: kotlin.collections.List<kotlin.Any>? = null,
    @SerializedName("user_id")
    val userId: kotlin.String? = null,
    @SerializedName("access_token")
    val accessToken: kotlin.String? = null,
    @SerializedName("preferred_languages")
    val preferredLanguages: kotlin.collections.List<kotlin.Any>? = null,
    @SerializedName("created_at")
    val createdAt: kotlin.Long? = null,
    @SerializedName("is_active")
    val isActive: kotlin.Boolean? = null,
    @SerializedName("locale")
    val locale: kotlin.String? = null,
    @SerializedName("discovery_keys")
    val discoveryKeys: kotlin.collections.List<kotlin.Any>? = null,
    @SerializedName("is_online")
    val isOnline: kotlin.Boolean? = null,
    @SerializedName("last_seen_at")
    val lastSeenAt: kotlin.Long? = null,
    @SerializedName("is_shadow_blocked")
    val isShadowBlocked: kotlin.Boolean? = null,
    @SerializedName("nickname")
    val nickname: kotlin.String? = null,
    @SerializedName("profile_url")
    val profileUrl: kotlin.String? = null
)

