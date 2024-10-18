package binh.fptpoly.apprice.ui.theme.screens

import CustomSlideshow
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import binh.fptpoly.apprice.R
import binh.fptpoly.apprice.ui.theme.compose.TopNavigationBar

@Composable
fun Home() {
    val selectedCategory = remember { mutableStateOf("Món ăn") }
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column {
            // Logo và Title luôn ở trên cùng
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(color = Color(0xFF74B9FF))
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    Modifier.size(50.dp)
                )
                Text(text = "BK Shop", fontWeight = FontWeight.Bold, fontSize = 30.sp)
            }

            // Kẻ ngang giữa Logo và SlideShow
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .background(color = Color(0xFF666666))
            )

            // Phần cuộn trang sẽ bắt đầu từ đây
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                // SlideShow sẽ cuộn khi scroll
                CustomSlideshow()

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(3.dp)
                        .background(color = Color(0xFF666666))
                )

                // TopNavigationBar sẽ di chuyển cùng SlideShow khi cuộn
                TopNavigationBar()


                // Các nội dung khác có thể thêm vào đây...
            }
        }
    }
}

