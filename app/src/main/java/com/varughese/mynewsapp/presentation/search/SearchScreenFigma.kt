package com.varughese.mynewsapp.presentation.search

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.varughese.mynewsapp.R
import com.varughese.mynewsapp.bottomnav4.Bottomnav4

/**
 * Search Screen
 *
 * This composable was generated from the UI Package 'search_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        SearchBar(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 50.0.dp
                )
            )
        )
        Bottomnav4Instance(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 709.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun SearchScreenPreview() {
    MaterialTheme {
        RelayContainer {
            SearchScreen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.search_screen_search_bar),
        modifier = modifier.requiredWidth(306.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Bottomnav4Instance(modifier: Modifier = Modifier) {
    Bottomnav4(modifier = modifier.requiredWidth(375.0.dp).requiredHeight(91.0.dp))
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
