package binh.fptpoly.apprice.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import binh.fptpoly.apprice.R
import binh.fptpoly.apprice.ui.theme.compose.ButtonBoc

@Composable
fun Sign(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(top = 40.dp, start = 10.dp, end = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Đăng Nhập", fontSize = 36.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            Modifier.size(360.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        ButtonBoc(
            text = "Đăng Nhập",
            icon = Icons.Filled.AccountCircle,
            onClick = { navController.navigate("signIn") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        ButtonBoc(
            text = "Đăng Ký",
            icon = Icons.Filled.AccountBox,
            onClick = { navController.navigate("signUp") }
        )
    }
}
