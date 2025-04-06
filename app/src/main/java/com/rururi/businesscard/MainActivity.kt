package com.rururi.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rururi.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                BusinessCardApp()   //これを追加
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(start = 16.dp, top = 120.dp, end = 16.dp, bottom = 16.dp)
//            .background(color = Color.Magenta)
            .fillMaxSize(),
    ) {
        Text(text = "株式会社")
        Text(
            text = "テックるっこ",
            fontSize = 30.sp,
            modifier=Modifier.padding(start=16.dp),
        )
        Spacer(modifier = Modifier.height(120.dp))  //たっぷりスペースをあける
        Text(
            text = "android team",
            fontFamily = FontFamily.Monospace
        )
        Text(
            text = "涼風　るるりこ",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
        Text(
            text = "suzukaze rururiko",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(120.dp))
        ContactAddress()
    }
}

@Composable
fun ContactAddress(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
//            .background(color = Color.Yellow) //一旦黄色にしておく後で消す
            .fillMaxWidth()                 //横幅いっぱいに広げる
            .padding(16.dp)                 //余白
    ) {
        Row(modifier = Modifier.padding(bottom = 8.dp)) {
            Icon(imageVector = Icons.Filled.Place, contentDescription="住所")
            Text(text = "愛知県名古屋市港区某99999",modifier=Modifier.padding(start=8.dp))
        }

        Row(modifier = Modifier.padding(bottom = 8.dp)) {
            Icon(imageVector = Icons.Filled.Email, contentDescription = "メール")
            Text(text = "teck_rucco@xxxxx.xx.jp",modifier=Modifier.padding(start=8.dp))
        }
        Row(modifier = Modifier.padding(bottom = 8.dp)) {
            Icon(imageVector = Icons.Filled.Call, contentDescription = "電話番号")
            Text(text = "090-9999-9999",modifier=Modifier.padding(start=8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactAddressPreview() {
    BusinessCardTheme {
        ContactAddress()
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}