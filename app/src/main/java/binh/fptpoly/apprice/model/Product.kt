package binh.fptpoly.apprice.model


data class Product(
    val _id: String? = null,
    val name: String,
    val price: Double,
    val avatar: String,
    val infor: String,
    val category: String
)