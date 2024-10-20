package binh.fptpoly.apprice.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import binh.fptpoly.apprice.model.Product
import binh.fptpoly.apprice.ui.theme.compose.CustomIconButton
import binh.fptpoly.apprice.viewmodel.ProductViewModel
import coil.compose.rememberImagePainter

@Composable
fun DetailScreen(navController: NavController,product: Product) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding()
    ) {
        //head
        item {
            Row(
                Modifier
                    .background(color = Color(0xFF74B9FF))
                    .fillMaxWidth()
                    .height(60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    Modifier
                        .padding(start = 10.dp)
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.Gray.copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    CustomIconButton(onClick = {}, icon = Icons.Filled.ArrowBackIosNew)
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Chi tiết sản phẩm", color = Color(0xFF1B1B1B), modifier = Modifier, fontSize = 27.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    Modifier
                        .padding(end = 10.dp)
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.Gray.copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    CustomIconButton(onClick = {}, icon = Icons.Filled.ShoppingCart)
                }
            }
        }

        item {
            ItemDetail(product)
            }


    }
}

@Composable
fun ItemDetail(product: Product){
    Spacer(modifier = Modifier
        .height(3.dp)
        .background(color = Color(0xFFD5BDFF))
        .fillMaxWidth())
    Image(painter = rememberImagePainter(data = product.avatar), contentDescription = "avatar")

}
