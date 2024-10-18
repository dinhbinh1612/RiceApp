package binh.fptpoly.apprice.services

import binh.fptpoly.apprice.model.Product
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ProductAPI {
    @GET("product/getlistproduct")
    suspend fun getProducts(): List<Product>

    @POST("product/add")
    suspend fun addProduct(@Body product: Product)

    @PUT("product/update")
    suspend fun updateProduct(@Body product: Product)

    @DELETE("product/delete/{id}")
    suspend fun deleteProduct(@Path("_id") productId: String)
}

