import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import binh.fptpoly.apprice.R
import kotlinx.coroutines.delay

@Composable
fun CustomSlideshow() {
    val images = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5
    )

    // Biến trạng thái để theo dõi ảnh hiện tại
    var currentImageIndex by remember { mutableStateOf(0) }

    // Tạo hiệu ứng chuyển ảnh tự động
    LaunchedEffect(currentImageIndex) {
        delay(3000) // Delay 3 giây trước khi chuyển ảnh
        currentImageIndex = (currentImageIndex + 1) % images.size
    }

    Box(modifier = Modifier.fillMaxWidth()) {
        // Hiển thị ảnh hiện tại
        images.forEachIndexed { index, imageResId ->
            AnimatedVisibility(
                visible = index == currentImageIndex, // Hiển thị ảnh hiện tại
                enter = androidx.compose.animation.fadeIn(animationSpec = tween(1000)), // Hiệu ứng fade in
                exit = androidx.compose.animation.fadeOut(animationSpec = tween(1000)) // Hiệu ứng fade out
            ) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = "Slideshow image",
                    modifier = Modifier.fillMaxWidth().height(250.dp),
                    contentScale = ContentScale.Crop, // Cắt ảnh để vừa màn hình
                )
            }
        }
    }
}


