# ch-api-client-kotlin
 CloudHospital client sdk for Kotlin

Install openapi-generator
npm install @openapitools/openapi-generator-cli@cli-5.0.0-beta2 -g

Generate kotlin api client with serializationLibrary option

openapi-generator generate -g kotlin -i https://api-int.icloudhospital.com/swagger/v1/swagger.json -o ~/src/kotlin-gson --additional-properties=serializationLibrary=gson
