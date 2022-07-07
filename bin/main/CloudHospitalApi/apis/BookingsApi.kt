package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ApproveBookingCommand
import CloudHospitalApi.models.BookingStatus
import CloudHospitalApi.models.BookingViewModel
import CloudHospitalApi.models.BookingsViewModel
import CloudHospitalApi.models.CreateBookingCommand
import CloudHospitalApi.models.RejectBookingCommand
import CloudHospitalApi.models.UpdateBookingCommand

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
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/bookings/{bookingId}/approve")
    suspend fun apiV1BookingsBookingIdApprovePost(@Path("bookingId") bookingId: java.util.UUID, @Body approveBookingCommand: ApproveBookingCommand? = null): Response<kotlin.Boolean>

    /**
     * Cancel booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/bookings/{bookingId}/cancel")
    suspend fun apiV1BookingsBookingIdCancelPost(@Path("bookingId") bookingId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Delete booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/bookings/{bookingId}")
    suspend fun apiV1BookingsBookingIdDelete(@Path("bookingId") bookingId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [BookingViewModel]
     */
    @GET("api/v1/bookings/{bookingId}")
    suspend fun apiV1BookingsBookingIdGet(@Path("bookingId") bookingId: java.util.UUID): Response<BookingViewModel>

    /**
     * Mark as Paid booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [java.util.UUID]
     */
    @POST("api/v1/bookings/{bookingId}/paid")
    suspend fun apiV1BookingsBookingIdPaidPost(@Path("bookingId") bookingId: java.util.UUID): Response<java.util.UUID>

    /**
     * Pay booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param bookingId  
     * @return [kotlin.String]
     */
    @POST("api/v1/bookings/{bookingId}/pay")
    suspend fun apiV1BookingsBookingIdPayPost(@Path("bookingId") bookingId: java.util.UUID): Response<kotlin.String>

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
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/bookings/{bookingId}")
    suspend fun apiV1BookingsBookingIdPut(@Path("bookingId") bookingId: java.util.UUID, @Body updateBookingCommand: UpdateBookingCommand? = null): Response<kotlin.Boolean>

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
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/bookings/{bookingId}/reject")
    suspend fun apiV1BookingsBookingIdRejectPost(@Path("bookingId") bookingId: java.util.UUID, @Body rejectBookingCommand: RejectBookingCommand? = null): Response<kotlin.Boolean>

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
     * @return [BookingsViewModel]
     */
    @GET("api/v1/bookings")
    suspend fun apiV1BookingsGet(@Query("SearchString") searchString: kotlin.String? = null, @Query("IsOpen") isOpen: kotlin.Boolean? = null, @Query("IsCompleted") isCompleted: kotlin.Boolean? = null, @Query("Status") status: BookingStatus? = null, @Query("DealPackageId") dealPackageId: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<BookingsViewModel>

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
     * @return [java.util.UUID]
     */
    @POST("api/v1/bookings/{requestId}")
    suspend fun apiV1BookingsRequestIdPost(@Path("requestId") requestId: java.util.UUID, @Body createBookingCommand: CreateBookingCommand? = null): Response<java.util.UUID>

}
