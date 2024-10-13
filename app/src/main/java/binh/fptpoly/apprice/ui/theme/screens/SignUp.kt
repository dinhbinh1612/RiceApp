package binh.fptpoly.apprice.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import binh.fptpoly.apprice.R
import binh.fptpoly.apprice.ui.theme.compose.CustomButton
import binh.fptpoly.apprice.ui.theme.compose.CustomIconButton
import binh.fptpoly.apprice.ui.theme.compose.CustomOutLineTextFile
import binh.fptpoly.apprice.ui.theme.compose.CustomOutLineTextFilePassword

@Composable
fun SignUp(navController: NavController) {
    val name = remember { mutableStateOf("") }
    val username = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val confirmPassword = remember { mutableStateOf("") }
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 10.dp, end = 10.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomIconButton(
                onClick = { navController.popBackStack() },
                icon = Icons.Filled.KeyboardArrowLeft
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                Modifier.size(250.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Đăng ký",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(30.dp))
            CustomOutLineTextFile(value = name, label = "Họ và tên")
            Spacer(modifier = Modifier.height(8.dp))
            CustomOutLineTextFile(value = username, label = "Tên đăng nhập")
            Spacer(modifier = Modifier.height(8.dp))
            CustomOutLineTextFile(value = email, label = "Email")
            Spacer(modifier = Modifier.height(8.dp))
            CustomOutLineTextFilePassword(value = password, label = "Mật khẩu")
            Spacer(modifier = Modifier.height(8.dp))
            CustomOutLineTextFilePassword(value = confirmPassword, label = "Xác nhận mật khẩu")
            Spacer(modifier = Modifier.height(40.dp))

            CustomButton(onClick = { }, text = "Đăng ký")

        }
    }
}

