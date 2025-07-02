package com.example.caffeine.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.caffeine.ui.theme.darkBrown
import com.example.caffeine.R
import com.example.caffeine.ui.theme.darkestBrown
import com.example.caffeine.ui.theme.primaryWhite

@Composable
fun StartScreen(){
    Scaffold(){ contentPadding ->
        Column(
            modifier = Modifier.padding(contentPadding)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp)
            )
            {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(shape = CircleShape)
                        .clickable{}

                ){
                    Image(
                        painter = painterResource(R.drawable.coffe_avatar),
                        contentDescription = "Avatar",
                    )
                }
                Spacer(Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(shape = CircleShape)
                        .clickable{}
                        .background(primaryWhite),
                    contentAlignment = Alignment.Center
                ){
                    Icon(
                        painter = painterResource(R.drawable.add),
                        contentDescription = "add",
                        tint = darkestBrown,
                        modifier = Modifier.size(24.dp)
                    )
                }


            }

        }

    }
}