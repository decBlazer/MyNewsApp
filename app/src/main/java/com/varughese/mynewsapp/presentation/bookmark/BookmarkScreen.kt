package com.varughese.mynewsapp.presentation.bookmark

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.RelayContainer
import com.varughese.mynewsapp.R
import com.varughese.mynewsapp.presentation.common.ArticlesList
import com.varughese.mynewsapp.presentation.Dimens.MediumPadding1
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.presentation.navgraph.Route

@Composable
fun BookmarkScreen(
    state: BookmarkState,
    navigateToDetails: (Article) -> Unit
) {
    BookmarkScreenFigma()


        ArticlesList(
            articles = state.articles,
            onClick = navigateToDetails
        )
    }