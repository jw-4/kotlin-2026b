package com.kotlinbasics

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
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week03Variabes()
    }

    private fun week03Variabes() {
        println("Week 03: Variables")

        val courseName = "Moblie Programming" // java final
        // courseName = "date" // 에러

        var week = 2
        week = 3
        println("Course : $courseName")
        println("Week : $week")

        println("========= Kotlin Variables =========")

        // val(immutable) vs var(mutable)
        val name = "Android"
        var version = 8
        println("Hi $name $version")

        val age: Int = 24
        val height: Double = 177.5
        val isStudent: Boolean = false

        println("age: $age")
        println("height: $height")
        println("isStudent: $isStudent")

        // var nickName:String = null
        var nickName:String? = null
        nickName = "mirae"
        println("NickName: $nickName ${nickName?.length}")

        println("========= Kotlin Function =========")

        fun greet(name: String): String {
            return "Hello $name!"
        }

        fun add(a: Int, b: Int) = a + b


    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}