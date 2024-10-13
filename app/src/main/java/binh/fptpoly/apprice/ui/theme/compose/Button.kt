package binh.fptpoly.apprice.ui.theme.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBoc(
    text: String,           // Văn bản nút
    icon: ImageVector,      // Icon cho nút
    onClick: () -> Unit     // Sự kiện click
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Black
        ),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.width(180.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(32.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = text,
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
}

@Composable
fun CustomIconButton(onClick: () -> Unit, icon: ImageVector) {
    IconButton(
        onClick = onClick,
        modifier = Modifier.size(40.dp) // Kích thước của button chứa icon
    ) {
        Icon(
            imageVector = icon, // Icon quay lại
            contentDescription = "Back",
            modifier = Modifier.size(32.dp), // Kích thước của icon
            tint = Color.Black // Màu tint cho icon
        )
    }
}

@Composable
fun CustomButton(onClick: () -> Unit,
                 text: String){
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(16.dp) // Khoảng cách xung quanh nút
            , // Chiều rộng đầy đủ
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFE724C), // Màu nền của nút (ví dụ: màu tím)
            contentColor = Color.White // Màu chữ bên trong nút
        ),
        shape = RoundedCornerShape(12.dp), // Bo góc cho nút
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge, // Kiểu chữ cho nút
            fontWeight = FontWeight.Bold, // Định dạng chữ đậm
            fontSize = 20.sp // Kích thước chữ
        )
    }
}

