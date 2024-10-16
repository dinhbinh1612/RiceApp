package binh.fptpoly.apprice.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import binh.fptpoly.apprice.ui.theme.compose.CustomButton
import binh.fptpoly.apprice.ui.theme.compose.CustomSearchBar
import binh.fptpoly.apprice.ui.theme.compose.TieuDe

@Composable
fun History(){
    Box(modifier = Modifier.fillMaxSize()){
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            TieuDe(text = "Lịch sử mua hàng")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            CustomSearchBar()
        }

    }
}