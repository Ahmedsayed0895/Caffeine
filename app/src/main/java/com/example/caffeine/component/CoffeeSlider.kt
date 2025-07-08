package com.example.caffeine.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.caffeine.model.coffeeList

@Composable
fun CoffeeSlider(
    onSelectionChanged: (String) -> Unit
) {
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp.dp
    val paddingValue = screenWidth * 0.25f
    val pagerState = rememberPagerState(pageCount = { coffeeList.size })
    HorizontalPager(
        state = pagerState,
        pageSize = PageSize.Fixed(250.dp),
        pageSpacing = -16.dp,
        contentPadding = PaddingValues(horizontal = paddingValue),
        reverseLayout = true

    ) { page ->
        val isSelected = pagerState.currentPage == page
        val scale = animateFloatAsState(if (isSelected) 1f else 0.6f)
        if (isSelected) {
            onSelectionChanged(coffeeList[page].title)
        }
        Box(
        ) {
            CoffeeItem(
                modifier = Modifier.align(Alignment.BottomCenter),
                coffee = coffeeList[page],
                imageScale = scale.value
            )
        }

    }
}