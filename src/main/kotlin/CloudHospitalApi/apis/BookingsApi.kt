package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.BookingModel
import CloudHospitalApi.models.BookingStatus
import CloudHospitalApi.models.BookingsModel
import CloudHospitalApi.models.CreateBookingCommand
import CloudHospitalApi.models.SortingOrder
import CloudHospitalApi.models.UpdateBookingCommand

interface BookingsApi {
    /**
     * Get booking.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param bookingId 
     * @param languageCode  (optional)
     * @return [BookingModel]
     */
    @GET("api/v2/bookings/{bookingId}")
    suspend fun apiV2BookingsBookingIdGet(@Path("bookingId") bookingId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<BookingModel>

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
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param dealId  (optional)
     * @param dealName  (optional)
     * @param isOpen  (optional)
     * @param isCompleted  (optional)
     * @param status  (optional)
     * @param dealPackageId  (optional)
     * @param sortRequestDate  (optional)
     * @param sortConfirmedDateStart  (optional)
     * @param isExternal  (optional)
     * @param paymentEnabled  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [BookingsModel]
     */
    @GET("api/v2/bookings")
    suspend fun apiV2BookingsGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("DealId") dealId: java.util.UUID? = null, @Query("DealName") dealName: kotlin.String? = null, @Query("IsOpen") isOpen: kotlin.Boolean? = null, @Query("IsCompleted") isCompleted: kotlin.Boolean? = null, @Query("Status") status: BookingStatus? = null, @Query("DealPackageId") dealPackageId: java.util.UUID? = null, @Query("SortRequestDate") sortRequestDate: SortingOrder? = null, @Query("SortConfirmedDateStart") sortConfirmedDateStart: SortingOrder? = null, @Query("IsExternal") isExternal: kotlin.Boolean? = null, @Query("PaymentEnabled") paymentEnabled: kotlin.Boolean? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<BookingsModel>

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
