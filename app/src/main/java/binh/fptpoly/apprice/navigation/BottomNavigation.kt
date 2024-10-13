import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import binh.fptpoly.apprice.ui.theme.compose.Profile
import binh.fptpoly.apprice.ui.theme.screens.CartScreen
import binh.fptpoly.apprice.ui.theme.screens.History
import binh.fptpoly.apprice.ui.theme.screens.Home

@Composable
fun BottomNavigationBar() {
    // Trạng thái được chọn cho các mục
    var selectedItem by remember { mutableStateOf(0) }
    var scrollState = rememberScrollState()

    // Sử dụng Box để có thể đặt BottomNavigation ở cuối
    Box(modifier = Modifier.fillMaxSize()) {
        // Hiển thị màn hình dựa trên mục được chọn
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            when (selectedItem) {
                0 -> Home()
                1 -> History()
                2 -> CartScreen()
                3 -> Profile()
            }
        }

        // Đặt Bottom Navigation Bar ở dưới cùng
        BottomNavigation(
            modifier = Modifier
                .align(Alignment.BottomCenter) // Đặt ở đáy màn hình
                .fillMaxWidth()
                .border(1.dp, Color.Gray)

            ,
            backgroundColor = Color.White, // Màu nền
            contentColor = Color.Gray, // Màu cho các item không được chọn
        ) {
            BottomNavigationItem(
                selected = selectedItem == 0,
                onClick = { selectedItem = 0 },
                label = { Text("Trang Chủ") },
                icon = { Icon(Icons.Filled.Home, contentDescription = "Trang Chủ") },
                selectedContentColor = Color.Red, // Màu khi được chọn
                unselectedContentColor = Color.Gray // Màu khi không được chọn
            )
            BottomNavigationItem(
                selected = selectedItem == 1,
                onClick = { selectedItem = 1 },
                label = { Text("Lịch Sử") },
                icon = { Icon(Icons.Filled.History, contentDescription = "Lịch Sử") },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Gray
            )
            BottomNavigationItem(
                selected = selectedItem == 2,
                onClick = { selectedItem = 2 },
                label = { Text("Giỏ Hàng") },
                icon = { Icon(Icons.Filled.ShoppingCart, contentDescription = "Giỏ Hàng") },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Gray
            )
            BottomNavigationItem(
                selected = selectedItem == 3,
                onClick = { selectedItem = 3 },
                label = { Text("Hồ Sơ") },
                icon = { Icon(Icons.Filled.Person, contentDescription = "Hồ Sơ") },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Gray
            )
        }
    }
}

@Preview
@Composable
fun PreviewBottomNavigationBar() {
    BottomNavigationBar()
}
