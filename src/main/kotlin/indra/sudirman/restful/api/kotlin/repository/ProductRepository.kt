package indra.sudirman.restful.api.kotlin.repository

import indra.sudirman.restful.api.kotlin.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}