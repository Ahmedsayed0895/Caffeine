package com.example.caffeine.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.caffeine.model.coffeeList

@Composable
fun CoffeeSlider() {
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp.dp
    val paddingValue = screenWidth * 0.25f
    val pagerState = rememberPagerState(pageCount = { coffeeList.size })
    HorizontalPager(
        state = pagerState,
        pageSpacing = 8.dp,
        pageSize = PageSize.Fixed(200.dp),
        contentPadding = PaddingValues(horizontal = paddingValue),
    ) { page ->
        val isSelected = pagerState.currentPage == page
        val scale = animateFloatAsState(if (isSelected) 1f else 0.8f)

        Box(
            modifier = Modifier.scale(scale.value),
        ) {
            CoffeeItem(coffeeList[page])
        }

    }
}