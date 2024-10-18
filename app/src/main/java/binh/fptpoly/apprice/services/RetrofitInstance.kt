package binh.fptpoly.apprice.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance{
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.1.18:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: ProductAPI by lazy {
        retrofit.create(ProductAPI::class.java)
    }

}