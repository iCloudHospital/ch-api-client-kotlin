package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateEquipmentCommand
import org.openapitools.client.models.EquipmentViewModel
import org.openapitools.client.models.EquipmentsViewModel
import org.openapitools.client.models.UpdateEquipmentCommand

interface EquipmentsApi {
    /**
     * Get all equipments.
     * Sample request:        GET /api/v1/hospitals/1/equipments      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;Medical\&quot;      }
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[EquipmentsViewModel]>
     */
    @GET("api/v1/hospitals/equipments")
    fun apiV1HospitalsEquipmentsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<EquipmentsViewModel>

    /**
     * Delete equipment.
     * Sample request:        DELETE /api/v1/hospitals/1/equipments/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param equipmentId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/hospitals/{hospitalId}/equipments/{equipmentId}")
    fun apiV1HospitalsHospitalIdEquipmentsEquipmentIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("equipmentId") equipmentId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get equipment.
     * Sample request:        GET /api/v1/hospitals/1/equipments/1
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param equipmentId  
     * @return [Call]<[EquipmentViewModel]>
     */
    @GET("api/v1/hospitals/{hospitalId}/equipments/{equipmentId}")
    fun apiV1HospitalsHospitalIdEquipmentsEquipmentIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("equipmentId") equipmentId: java.util.UUID): Call<EquipmentViewModel>

    /**
     * Update equipment.
     * Sample request:        PUT /api/v1/hospitals/1/equipments/1      {          \&quot;description\&quot;: \&quot;Upgraded medical equipment\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param equipmentId  
     * @param updateEquipmentCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/hospitals/{hospitalId}/equipments/{equipmentId}")
    fun apiV1HospitalsHospitalIdEquipmentsEquipmentIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("equipmentId") equipmentId: java.util.UUID, @Body updateEquipmentCommand: UpdateEquipmentCommand? = null): Call<kotlin.Boolean>

    /**
     * Create an equipment and add to a hospital.
     * Sample request:        POST /api/v1/hospitals/1/equipments      {          \&quot;name\&quot;: \&quot;Afroasia ltd\&quot;,          \&quot;description\&quot;: \&quot;Medical equipment\&quot;,          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: 0,              \&quot;url\&quot;: \&quot;imageurl\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,                      \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param createEquipmentCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/hospitals/{hospitalId}/equipments")
    fun apiV1HospitalsHospitalIdEquipmentsPost(@Path("hospitalId") hospitalId: java.util.UUID, @Body createEquipmentCommand: CreateEquipmentCommand? = null): Call<java.util.UUID>

}