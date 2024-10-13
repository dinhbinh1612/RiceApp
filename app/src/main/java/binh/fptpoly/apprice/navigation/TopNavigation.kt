package binh.fptpoly.apprice.ui.theme.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import binh.fptpoly.apprice.R

@Composable
fun TopNavigationBar() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Món ăn", "Đồ ăn thêm", "Topping", "Khác")
    val images = listOf(
        R.drawable.dish1, // Đặt ID hình ảnh tương ứng
        R.drawable.dish2,
        R.drawable.dish3,
        R.drawable.dish4
    )

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            tabs.forEachIndexed { index, tab ->
                Column(
                    modifier = Modifier
                        .clickable { selectedTab = index }
                        .padding(horizontal = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val image: Painter = painterResource(id = images[index])
                    Image(
                        painter = image,
                        contentDescription = tab,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .padding(bottom = 4.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .border(1.dp, Color.Gray, RoundedCornerShape(10.dp))
                    )
                    Text(
                        text = tab,
                        color = if (selectedTab == index) Color(0xFF2c77f2) else Color.Gray,
                        fontSize = 12.sp
                    )
                }
            }
    }

        when (selectedTab) {
            0 -> MonAnList()
            1 -> DoAnThemList()
            2 -> ToppingList()
            3 -> KhacList()
        }
    }
}

@Preview
@Composable
fun PreviewTopNavigationBar() {
    TopNavigationBar()
}