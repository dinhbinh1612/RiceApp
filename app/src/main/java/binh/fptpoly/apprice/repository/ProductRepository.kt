package binh.fptpoly.apprice.repository

import binh.fptpoly.apprice.model.Product
import binh.fptpoly.apprice.services.RetrofitInstance


class ProductRepository {
    private val api = RetrofitInstance.api

    suspend fun getProducts(): List<Product> {
        return api.getProducts()
    }

    suspend fun addProduct(product: Product) {
        api.addProduct(product)
    }

    suspend fun updateProduct(product: Product) {
        api.updateProduct(product)
    }

    suspend fun deleteProduct(productId: String) {
        api.deleteProduct(productId)
    }
}