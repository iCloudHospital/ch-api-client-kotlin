package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DoctorCertificateModel
import CloudHospitalApi.models.DoctorCertificatesModel
import CloudHospitalApi.models.DoctorEducationModel
import CloudHospitalApi.models.DoctorEducationsModel
import CloudHospitalApi.models.DoctorLanguageModel
import CloudHospitalApi.models.DoctorLanguagesModel
import CloudHospitalApi.models.DoctorModel
import CloudHospitalApi.models.DoctorPortfolioModel
import CloudHospitalApi.models.DoctorPortfoliosModel
import CloudHospitalApi.models.DoctorSpecialtiesModel
import CloudHospitalApi.models.DoctorSpecialtyModel
import CloudHospitalApi.models.DoctorsModel
import CloudHospitalApi.models.DoctorsSimpleModel
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel

interface DoctorsApi {
    /**
     * Get DoctorCertificate.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param certificateId 
     * @return [DoctorCertificateModel]
     */
    @GET("api/v2/doctors/{doctorId}/certificates/{certificateId}")
    suspend fun apiV2DoctorsDoctorIdCertificatesCertificateIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("certificateId") certificateId: java.util.UUID): Response<DoctorCertificateModel>

    /**
     * Delete DoctorCertificate.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param doctorName  (optional)
     * @param certificateId  (optional)
     * @param certificate  (optional)
     * @param activeFrom  (optional)
     * @param activeTo  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorCertificatesModel]
     */
    @GET("api/v2/doctors/{doctorId}/certificates")
    suspend fun apiV2DoctorsDoctorIdCertificatesGet(@Path("doctorId") doctorId: java.util.UUID, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("CertificateId") certificateId: java.util.UUID? = null, @Query("Certificate") certificate: kotlin.String? = null, @Query("ActiveFrom") activeFrom: java.time.LocalDateTime? = null, @Query("ActiveTo") activeTo: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorCertificatesModel>

    /**
     * Get DoctorEducation.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param educationId 
     * @return [DoctorEducationModel]
     */
    @GET("api/v2/doctors/{doctorId}/educations/{educationId}")
    suspend fun apiV2DoctorsDoctorIdEducationsEducationIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("educationId") educationId: java.util.UUID): Response<DoctorEducationModel>

    /**
     * Get all DoctorEducations.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param doctorName  (optional)
     * @param educationId  (optional)
     * @param institution  (optional)
     * @param qualification  (optional)
     * @param graduationDate  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorEducationsModel]
     */
    @GET("api/v2/doctors/{doctorId}/educations")
    suspend fun apiV2DoctorsDoctorIdEducationsGet(@Path("doctorId") doctorId: java.util.UUID, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("EducationId") educationId: java.util.UUID? = null, @Query("Institution") institution: kotlin.String? = null, @Query("Qualification") qualification: kotlin.String? = null, @Query("GraduationDate") graduationDate: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorEducationsModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [DoctorModel]
     */
    @GET("api/v2/doctors/{doctorId}")
    suspend fun apiV2DoctorsDoctorIdGet(@Path("doctorId") doctorId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<DoctorModel>

    /**
     * Get all DoctorLanguages.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param language  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorLanguagesModel]
     */
    @GET("api/v2/doctors/{doctorId}/languages")
    suspend fun apiV2DoctorsDoctorIdLanguagesGet(@Path("doctorId") doctorId: java.util.UUID, @Query("Language") language: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorLanguagesModel>

    /**
     * Get DoctorLanguage.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param languageId 
     * @return [DoctorLanguageModel]
     */
    @GET("api/v2/doctors/{doctorId}/languages/{languageId}")
    suspend fun apiV2DoctorsDoctorIdLanguagesLanguageIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("languageId") languageId: java.util.UUID): Response<DoctorLanguageModel>

    /**
     * Get all DoctorMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/doctors/{doctorId}/medias")
    suspend fun apiV2DoctorsDoctorIdMediasGet(@Path("doctorId") doctorId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get DoctorMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/doctors/{doctorId}/medias/{mediaId}")
    suspend fun apiV2DoctorsDoctorIdMediasMediaIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Get All DoctorPortfolios
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param doctorName  (optional)
     * @param portfolioId  (optional)
     * @param name  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorPortfoliosModel]
     */
    @GET("api/v2/doctors/{doctorId}/portfolios")
    suspend fun apiV2DoctorsDoctorIdPortfoliosGet(@Path("doctorId") doctorId: java.util.UUID, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("PortfolioId") portfolioId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorPortfoliosModel>

    /**
     * Get DoctorPortfolio.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param portfolioId 
     * @return [DoctorPortfolioModel]
     */
    @GET("api/v2/doctors/{doctorId}/portfolios/{portfolioId}")
    suspend fun apiV2DoctorsDoctorIdPortfoliosPortfolioIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("portfolioId") portfolioId: java.util.UUID): Response<DoctorPortfolioModel>

    /**
     * Get All DoctorSpecialties.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param doctorName  (optional)
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorSpecialtiesModel]
     */
    @GET("api/v2/doctors/{doctorId}/specialties")
    suspend fun apiV2DoctorsDoctorIdSpecialtiesGet(@Path("doctorId") doctorId: java.util.UUID, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorSpecialtiesModel>

    /**
     * Get DoctorSpecialty
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorId 
     * @param specialtyId 
     * @param languageCode  (optional)
     * @return [DoctorSpecialtyModel]
     */
    @GET("api/v2/doctors/{doctorId}/specialties/{specialtyId}")
    suspend fun apiV2DoctorsDoctorIdSpecialtiesSpecialtyIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<DoctorSpecialtyModel>

    /**
     * Get all Doctors.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @param ids  (optional)
     * @param specialtyId  (optional)
     * @param consultationEnabled  (optional)
     * @param id  (optional)
     * @param fullname  (optional)
     * @param email  (optional)
     * @param gender  (optional)
     * @param dateOfBirth  (optional)
     * @param created  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorsModel]
     */
    @GET("api/v2/doctors")
    suspend fun apiV2DoctorsGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("ConsultationEnabled") consultationEnabled: kotlin.Boolean? = null, @Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorsModel>

    /**
     * Get all Doctors.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @param ids  (optional)
     * @param specialtyId  (optional)
     * @param consultationEnabled  (optional)
     * @param id  (optional)
     * @param fullname  (optional)
     * @param email  (optional)
     * @param gender  (optional)
     * @param dateOfBirth  (optional)
     * @param created  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorsSimpleModel]
     */
    @GET("api/v2/doctors/simple")
    suspend fun apiV2DoctorsSimpleGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("ConsultationEnabled") consultationEnabled: kotlin.Boolean? = null, @Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorsSimpleModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [DoctorModel]
     */
    @GET("api/v2/doctors/{slug}")
    suspend fun apiV2DoctorsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<DoctorModel>

}
