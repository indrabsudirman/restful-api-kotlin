package indra.sudirman.restful.api.kotlin.service.impl

import indra.sudirman.restful.api.kotlin.entity.Product
import indra.sudirman.restful.api.kotlin.model.CreateProductRequest
import indra.sudirman.restful.api.kotlin.model.ProductResponse
import indra.sudirman.restful.api.kotlin.repository.ProductRepository
import indra.sudirman.restful.api.kotlin.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository) : ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
            id = createProductRequest.id,
            name = createProductRequest.name,
            price = createProductRequest.price,
            quantity = createProductRequest.quantity,
            createdAt = Date(),
            updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )
    }
}