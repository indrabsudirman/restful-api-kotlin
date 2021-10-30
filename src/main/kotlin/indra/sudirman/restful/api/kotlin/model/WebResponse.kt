package indra.sudirman.restful.api.kotlin.model

data class WebResponse<T> (

    val code: Int,

    val status: String,

    val data: T
)