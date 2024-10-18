package binh.fptpoly.apprice.ui.theme.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.EditLocationAlt
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.RecentActors
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Transgender
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import binh.fptpoly.apprice.R

@Composable
fun Profile() {
    val scrollState = rememberScrollState()
    Box(modifier = Modifier.fillMaxSize().padding(bottom = 100.dp)) {
        Column(
            modifier = Modifier
                .background(color = Color(0xFF74B9FF))
                .padding(top = 20.dp, start = 10.dp,)
                .height(200.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Thông tin tài khoản",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(300.dp) // Kích thước của hình ảnh
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 20.dp)
            ) {
                // Hình ảnh đại diện
                Image(
                    painter = painterResource(id = R.drawable.dish2),
                    contentDescription = "Profile Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(250.dp)
                        .clip(CircleShape) // Bo tròn ảnh thành hình tròn
                )

                // Icon edit nằm ở góc phải trên của hình ảnh
                IconButton(
                    onClick = { /* Xử lý nút chỉnh sửa */ },
                    modifier = Modifier
                        .align(Alignment.BottomEnd) // Đặt ở góc trên phải
                        .padding(
                            bottom = 50.dp,
                            end = 65.dp
                        ) // Thêm khoảng trống giữa icon và cạnh của hình ảnh
                        .clip(CircleShape) // Bo tròn ảnh thành hình tròn
                        .border(1.dp, Color.Gray, CircleShape) // Thêm viền cho ảnh
                        .background(Color(0xFF919191)) // Màu nền của icon
                ) {
                    Icon(
                        imageVector = Icons.Filled.Edit,
                        contentDescription = "Edit Profile",
                        tint = Color.White, // Màu sắc của icon
                        modifier = Modifier
                            .size(40.dp)
                            .padding(5.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFf6f5fb))
                    .fillMaxWidth()
                    .padding(bottom = 50.dp).verticalScroll(scrollState),
                    horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // thông tin nf
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.AccountBox, iconEnd = Icons.Filled.NavigateNext, title = "Họ & Tên", subtitle = "fdb", onEndIconClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.AccountCircle, iconEnd = Icons.Filled.NavigateNext, title = "Nickname", subtitle = "", onEndIconClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.CalendarMonth, iconEnd = Icons.Filled.NavigateNext, title = "Ngày sinh", subtitle = "", onEndIconClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.Transgender, iconEnd = Icons.Filled.NavigateNext, title = "Giới tính", subtitle = "", onEndIconClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.LocationOn, iconEnd = Icons.Filled.NavigateNext, title = "Địa chỉ", subtitle = "", onEndIconClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.Phone, iconEnd = Icons.Filled.NavigateNext, title = "Số điện thoại", subtitle = "", onEndIconClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.Email, iconEnd = Icons.Filled.NavigateNext, title = "Email", subtitle = "", onEndIconClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                CustomBoxTT(iconStart = Icons.Filled.Lock, iconEnd = Icons.Filled.NavigateNext, title = "Đổi mật khẩu", subtitle = "", onEndIconClick = {})

                CustomButton(onClick = { /*TODO*/ }, text = "Đăng Xuất")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUserProfileScreen() {
    Profile()
}
