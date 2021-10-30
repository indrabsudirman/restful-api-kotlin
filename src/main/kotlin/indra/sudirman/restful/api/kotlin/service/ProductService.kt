package indra.sudirman.restful.api.kotlin.service

import indra.sudirman.restful.api.kotlin.model.CreateProductRequest
import indra.sudirman.restful.api.kotlin.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse
}