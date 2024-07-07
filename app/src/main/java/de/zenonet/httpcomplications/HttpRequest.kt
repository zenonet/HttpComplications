package de.zenonet.httpcomplications

data class HttpRequest(
    var url: String,
    var httpMethod: HttpMethod = HttpMethod.GET
)

enum class HttpMethod {
    GET,
    POST,
    PUT,
    DELETE,
}