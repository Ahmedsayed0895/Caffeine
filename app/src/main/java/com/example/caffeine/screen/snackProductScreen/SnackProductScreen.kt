package com.example.caffeine.screen.snackProductScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.caffeine.R
import com.example.caffeine.component.ExitHeader
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.navigation.AppDestination
import com.example.caffeine.ui.theme.Sniglet
import com.example.caffeine.ui.theme.Urbanist

@Composable
fun SnackProductScreen(
    navController: NavController
) {
    val args: Int? = navController.currentBackStackEntry?.arguments?.getInt("image")

    Scaffold(
        containerColor = Color.White
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
                .padding(vertical = 16.dp),

            horizontalAlignment = CenterHorizontally,

            ) {
            ExitHeader(
                bottomSpace = 24.dp, modifier = Modifier.padding(horizontal = 16.dp),
                onClick = {
                    navController.popBackStack(
                        route = AppDestination.StartScreen.route,
                        inclusive = false
                    )
                }
            )
            Row(modifier = Modifier.padding(bottom = 24.dp)) {
                Icon(
                    painter = painterResource(R.drawable.coffee_beans2),
                    contentDescription = "Product Image",
                    tint = Color(0xFF7C351B),
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = "More Espresso, Less Depresso",
                    color = Color(0xFF7C351B),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = Sniglet
                )
                Icon(
                    painter = painterResource(R.drawable.coffee_beans2),
                    contentDescription = "Product Image",
                    modifier = Modifier.padding(start = 16.dp),
                    tint = Color(0xFF7C351B),

                    )
            }
            Image(
                painter = painterResource(checkNotNull(args)),
                contentDescription = "Product Image",
                modifier = Modifier.size(300.dp)
                )
            Row(
                modifier = Modifier.padding(top = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Bon appétit",
                    color = Color(0xCC1F1F1F),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Urbanist,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Image(
                    painter = painterResource(R.drawable.magic_wand),
                    contentDescription = "magic wand",

                    )

            }
            Spacer(modifier = Modifier.weight(1f))
            IconTextButton(
                onClick = {
                    navController.popBackStack(
                        route = AppDestination.StartScreen.route,
                        inclusive = false
                    )
                },
                text = "Thank youuu",
                icon = painterResource(R.drawable.arrow_right)
            )
        }

    }
}






