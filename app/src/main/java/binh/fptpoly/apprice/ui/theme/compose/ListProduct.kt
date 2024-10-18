package binh.fptpoly.apprice.ui.theme.compose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import binh.fptpoly.apprice.R
import binh.fptpoly.apprice.viewmodel.ProductViewModel
import coil.compose.rememberImagePainter

@Composable
fun ListProduct(productViewModel: ProductViewModel) {
    LaunchedEffect(Unit) {
        productViewModel.fetchProducts()
    }

    val products = productViewModel.products

    LazyColumn(modifier = Modifier.fillMaxWidth().padding(bottom = 60.dp)) {
        items(productViewModel.products) { product ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.dp, androidx.compose.ui.graphics.Color.Gray)
            ) {
                Image(
                    painter = rememberImagePainter(
                        data = product.avatar,
                        builder = {
                            placeholder(R.drawable.baseline_downloading_24) // Ảnh hiển thị trong lúc tải
                            error(R.drawable.baseline_error_outline_24)   // Ảnh hiển thị khi có lỗi
                        }
                    ),                    contentDescription = "avatar",
                    modifier = Modifier.size(100.dp).padding(5.dp),
                    contentScale = ContentScale.Crop
                    )

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Tên: "+product.name)
                    Text(text = "Giá: "+product.price)
                    Text(text = "Mô tả: "+product.infor)
                    Text(text = "Thể loại: "+product.category)
                    Log.d("Image URL", "Avatar URL: ${product.avatar}")

                }
            }
        }
    }
}

@Preview
@Composable
fun ListProductPreview() {
    val productViewModel = ProductViewModel()
    ListProduct(productViewModel = productViewModel)
}