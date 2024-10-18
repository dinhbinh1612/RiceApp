package binh.fptpoly.apprice.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import binh.fptpoly.apprice.ui.theme.screens.Home
import binh.fptpoly.apprice.ui.theme.screens.Sign
import binh.fptpoly.apprice.ui.theme.screens.SignIn
import binh.fptpoly.apprice.ui.theme.screens.SignUp
import binh.fptpoly.apprice.ui.theme.screens.Welcome

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            Welcome(navController)
        }
        composable("sign") {
            Sign(navController)
        }
        composable("signIn") {
            SignIn(navController)
        }
        composable("signUp") {
            SignUp(navController)
        }
        composable("home"){
            Home()
        }
    }
}