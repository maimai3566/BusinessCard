package com.rururi.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rururi.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(
        text = "名前：　涼風　るるりこ",   //名前をこちらに設定
        modifier = modifier
    )
}

@Preview(showBackground = true)     //プレビュー欄に表示するよ！という意味
@Composable                         //アプリに表示するための部品だよ！という意味
fun GreetingPreview() {             //関数の名前
    BusinessCardTheme {             //このアプリ専用のテーマ（今は気にしない）
        Greeting()  //ここに設定した名前は消す
    }
}