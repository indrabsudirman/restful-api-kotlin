package indra.sudirman.restful.api.kotlin.controller

import indra.sudirman.restful.api.kotlin.model.CreateProductRequest
import indra.sudirman.restful.api.kotlin.model.ProductResponse
import indra.sudirman.restful.api.kotlin.model.WebResponse
import indra.sudirman.restful.api.kotlin.service.ProductService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(val productService: ProductService) {

    @PostMapping(
        value = ["/api/products"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createProduct(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse> {

        val productResponse = productService.create(body)

        return WebResponse(
            code = 200,
            status = "OK",
            data = productResponse
        )

    }
}