package com.varughese.mynewsapp.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.varughese.mynewsapp.R
import com.varughese.mynewsapp.bottomnav4.Bottomnav4

/**
 * This composable was generated from the UI Package 'home_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun HomeScreenFigma(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        TopLevel(modifier = modifier) {
            VarugheseNews(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f))
            Brightness4(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f)) {
                Vector(modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f))
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HomeScreenPreview() {
    MaterialTheme {
        RelayContainer {
            HomeScreenFigma(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f))
        }
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_search_bar),
        modifier = modifier
            .requiredWidth(306.0.dp)
            .requiredHeight(50.0.dp)
    )
}

@Composable
fun Bottomnav4Instance(modifier: Modifier = Modifier) {
    Bottomnav4(modifier = modifier
        .requiredWidth(375.0.dp)
        .requiredHeight(91.0.dp))
}

@Composable
fun VarugheseNews(modifier: Modifier = Modifier) {
    RelayText(
        content = "Varughese News",
        fontSize = 24.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(800.0.toInt()),
        maxLines = -1,
        shadow = Shadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            offset = Offset(
                x = 0.0f,
                y = 4.0f
            ),
            blurRadius = 4.0f
        ),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 55.0.dp,
                    top = 120.0.dp,
                    end = 40.0.dp,
                    bottom = 652.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_vector4),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 30.dp,
                    top = 25.dp,
                    end = 3.248748779296875.dp,
                    bottom = 3.0762481689453125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Brightness4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 123.0.dp,
                    top = 2.0.dp,
                    end = 124.0.dp,
                    bottom = 691.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 134,
            green = 104,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}
