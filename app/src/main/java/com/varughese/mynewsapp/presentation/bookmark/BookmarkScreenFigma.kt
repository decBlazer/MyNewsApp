package com.varughese.mynewsapp.presentation.bookmark

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.varughese.mynewsapp.bottomnav4.Bottomnav4

/**
 * This composable was generated from the UI Package 'bookmark_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun BookmarkScreenFigma(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun BookmarkScreenPreview() {
    MaterialTheme {
        RelayContainer {
            BookmarkScreenFigma(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
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
