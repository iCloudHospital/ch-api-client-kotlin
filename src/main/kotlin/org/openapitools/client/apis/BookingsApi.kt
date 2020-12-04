package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.ApproveBookingCommand
import org.openapitools.client.models.BookingStatus
import org.openapitools.client.models.BookingViewModel
import org.openapitools.client.models.BookingsViewModel
import org.openapitools.client.models.CreateBookingCommand
import org.openapitools.client.models.RejectBookingCommand
import org.openapitools.client.models.UpdateBookingCommand

interface BookingsApi {
    /**
     * Approve booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @param approveBookingCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/bookings/{bookingId}/approve")
    fun apiV1BookingsBookingIdApprovePost(@Path("bookingId") bookingId: java.util.UUID, @Body approveBookingCommand: ApproveBookingCommand? = null): Call<kotlin.Boolean>

    /**
     * Cancel booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/bookings/{bookingId}/cancel")
    fun apiV1BookingsBookingIdCancelPost(@Path("bookingId") bookingId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Delete booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/bookings/{bookingId}")
    fun apiV1BookingsBookingIdDelete(@Path("bookingId") bookingId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [Call]<[BookingViewModel]>
     */
    @GET("api/v1/bookings/{bookingId}")
    fun apiV1BookingsBookingIdGet(@Path("bookingId") bookingId: java.util.UUID): Call<BookingViewModel>

    /**
     * Mark as Paid booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/bookings/{bookingId}/paid")
    fun apiV1BookingsBookingIdPaidPost(@Path("bookingId") bookingId: java.util.UUID): Call<java.util.UUID>

    /**
     * Pay booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/bookings/{bookingId}/pay")
    fun apiV1BookingsBookingIdPayPost(@Path("bookingId") bookingId: java.util.UUID): Call<kotlin.String>

    /**
     * Update booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @param updateBookingCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/bookings/{bookingId}")
    fun apiV1BookingsBookingIdPut(@Path("bookingId") bookingId: java.util.UUID, @Body updateBookingCommand: UpdateBookingCommand? = null): Call<kotlin.Boolean>

    /**
     * Reject booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @param rejectBookingCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/bookings/{bookingId}/reject")
    fun apiV1BookingsBookingIdRejectPost(@Path("bookingId") bookingId: java.util.UUID, @Body rejectBookingCommand: RejectBookingCommand? = null): Call<kotlin.Boolean>

    /**
     * Get all bookings.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param searchString  (optional)
     * @param isOpen  (optional)
     * @param isCompleted  (optional)
     * @param status  (optional)
     * @param dealPackageId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[BookingsViewModel]>
     */
    @GET("api/v1/bookings")
    fun apiV1BookingsGet(@Query("SearchString") searchString: kotlin.String? = null, @Query("IsOpen") isOpen: kotlin.Boolean? = null, @Query("IsCompleted") isCompleted: kotlin.Boolean? = null, @Query("Status") status: BookingStatus? = null, @Query("DealPackageId") dealPackageId: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<BookingsViewModel>

    /**
     * Create booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param requestId  
     * @param createBookingCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/bookings/{requestId}")
    fun apiV1BookingsRequestIdPost(@Path("requestId") requestId: java.util.UUID, @Body createBookingCommand: CreateBookingCommand? = null): Call<java.util.UUID>

}
