package com.example.caffeine.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.caffeine.model.coffeeList

@Composable
fun SnacksSlider(
    onSelectionChanged: (String) -> Unit
) {
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp.dp
    val paddingValue = screenWidth * 0.25f
    val pagerState = rememberPagerState(pageCount = { 10 })
    VerticalPager(
        state = pagerState,
        pageSize = PageSize.Fixed(300.dp),
        pageSpacing = -100.dp


    ) { page ->
        val isSelected = pagerState.currentPage == page
        val scale = animateFloatAsState(if (isSelected) 1f else 0.8f)
        if (isSelected) {
            onSelectionChanged(coffeeList[page].title)
        }
        Box(
            modifier = Modifier.scale(scale.value),
        ) {
            SnackCard(
                image = coffeeList[page].image,
                index = page,
                total = coffeeList.size
            )
        }

    }
}