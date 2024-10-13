package binh.fptpoly.apprice.ui.theme.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material.icons.filled.RecentActors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CustomBoxTT(
    iconStart: ImageVector,   // Icon bắt đầu (bên trái)
    iconEnd: ImageVector,     // Icon kết thúc (bên phải)
    title: String,            // Tiêu đề text (dòng trên)
    subtitle: String,         // Nội dung text (dòng dưới)
    onStartIconClick: () -> Unit = {}, // Hàm xử lý khi click icon trái
    onEndIconClick: () -> Unit = {}    // Hàm xử lý khi click icon phải
) {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .height(60.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically // Đảm bảo các thành phần trong Row căn giữa
        ) {
            CustomIconButton(onClick = onStartIconClick, icon = iconStart) // Icon bắt đầu
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f)
            ) {
                Text(text = title, fontWeight = FontWeight.W500, color = Color.Black)   // Text tiêu đề
                Text(text = subtitle) // Text nội dung
            }
            CustomIconButton(onClick = onEndIconClick, icon = iconEnd) // Icon kết thúc
        }
    }
}