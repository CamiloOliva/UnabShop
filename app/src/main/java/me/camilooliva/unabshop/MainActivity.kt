package me.camilooliva.unabshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.camilooliva.unabshop.ui.theme.UnabShopTheme
//tukix3
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val starDestination = "Login"
            NavHost(
                navController = navController,
                startDestination = starDestination,
                modifier = Modifier.fillMaxSize()
            ){
                composable(route = "login") {
                    LoginScreen(navController = navController)

                }
                composable(route = "register") {
                    RegisterScreen()

                }
                composable(route =  "home") {
                    HomeScreen()
                }

            }

        }
    }
}

