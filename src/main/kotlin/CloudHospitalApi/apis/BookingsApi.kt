package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.BookingModel
import CloudHospitalApi.models.BookingStatus
import CloudHospitalApi.models.BookingsModel
import CloudHospitalApi.models.CreateBookingCommand
import CloudHospitalApi.models.ProblemDetails
import CloudHospitalApi.models.UpdateBookingCommand

interface BookingsApi {
    /**
     * Get booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param bookingId  
     * @return [BookingModel]
     */
    @GET("api/v2/bookings/{bookingId}")
    suspend fun apiV2BookingsBookingIdGet(@Path("bookingId") bookingId: java.util.UUID): Response<BookingModel>

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
    @POST("api/v2/bookings/{bookingId}/pay")
    suspend fun apiV2BookingsBookingIdPayPost(@Path("bookingId") bookingId: java.util.UUID): Response<kotlin.String>

    /**
     * Update booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param bookingId  
     * @param updateBookingCommand  (optional)
     * @return [BookingModel]
     */
    @PUT("api/v2/bookings/{bookingId}")
    suspend fun apiV2BookingsBookingIdPut(@Path("bookingId") bookingId: java.util.UUID, @Body updateBookingCommand: UpdateBookingCommand? = null): Response<BookingModel>

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
     * @param hospitalId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [BookingsModel]
     */
    @GET("api/v2/bookings")
    suspend fun apiV2BookingsGet(@Query("SearchString") searchString: kotlin.String? = null, @Query("IsOpen") isOpen: kotlin.Boolean? = null, @Query("IsCompleted") isCompleted: kotlin.Boolean? = null, @Query("Status") status: BookingStatus? = null, @Query("DealPackageId") dealPackageId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<BookingsModel>

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
     * @return [BookingModel]
     */
    @POST("api/v2/bookings/{requestId}")
    suspend fun apiV2BookingsRequestIdPost(@Path("requestId") requestId: java.util.UUID, @Body createBookingCommand: CreateBookingCommand? = null): Response<BookingModel>

}
