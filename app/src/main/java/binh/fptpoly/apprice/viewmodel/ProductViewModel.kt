package binh.fptpoly.apprice.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import binh.fptpoly.apprice.model.Product
import binh.fptpoly.apprice.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {
    private val repository = ProductRepository()
    var products = mutableStateListOf<Product>()
    var filteredProducts = mutableStateListOf<Product>()
        private set

    fun fetchProducts() {

        viewModelScope.launch {
            try {
                val productList = repository.getProducts()
                products.clear()
                products.addAll(productList)
                Log.d("ProductViewModel", "Fetched products: ${productList.size}")

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun addProduct(product: Product) {
        viewModelScope.launch {
            try {
                repository.addProduct(product)
                products.add(product)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            products.add(product)
        }

        fun updateProduct(product: Product) {
            viewModelScope.launch {
                try {
                    repository.updateProduct(product)
                    fetchProducts() // Cập nhật lại danh sách sản phẩm sau khi sửa
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        fun deleteProduct(product: Product) {
            viewModelScope.launch {
                try {
                    // Kiểm tra xem _id có null không
                    product._id?.let {
                        repository.deleteProduct(it)  // Truyền ID của sản phẩm
                        fetchProducts()  // Cập nhật lại danh sách sau khi xóa
                    } ?: run {
                        Log.e("ProductViewModel", "Product ID is null")
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }


    }
}