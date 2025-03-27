package br.senai.sp.jandira.BMI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.BMI.screens.BMIResultScreen
import br.senai.sp.jandira.BMI.screens.HomeScreen
import br.senai.sp.jandira.BMI.screens.UserDataScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        val navegacao = rememberNavController()
            NavHost(
                navController = navegacao,
                startDestination = "home"
            ){
                 composable(route = "home"){ HomeScreen(navegacao) }
                 composable(route = "user_data"){ UserDataScreen(navegacao) }
                 composable(route = "bmi_result"){ BMIResultScreen() }
            }
        }
    }
}

