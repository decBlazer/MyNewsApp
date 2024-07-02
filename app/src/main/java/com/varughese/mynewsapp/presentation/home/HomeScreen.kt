package com.varughese.mynewsapp.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import com.varughese.mynewsapp.R
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.presentation.Dimens
import com.varughese.mynewsapp.presentation.common.ArticlesList
import com.varughese.mynewsapp.presentation.common.SearchBar


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    articles: LazyPagingItems<Article>,
    navigateToSearch: () -> Unit,
    navigateToDetails: (Article) -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {



    val titles by remember(articles) {
        derivedStateOf {
            if (articles.itemCount > 10) {
                articles.itemSnapshotList.items
                    .slice(IntRange(start = 0, endInclusive = 9))
                    .joinToString(separator = " \uD83D\uDFE5 ") { it.title.toString() }
            } else {
                ""
            }
        }
    }

    var sourceToUse by remember(viewModel) { mutableStateOf(emptyList<String>()) }

    LaunchedEffect(viewModel, articles) {
        sourceToUse = viewModel.switchNews()
    }

    HomeScreenFigma()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = Dimens.MediumPadding1)
            .statusBarsPadding()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Dimens.MediumPadding1)
                .padding(top = 0.dp),
            horizontalArrangement = Arrangement.End
        ) {
        }

        Spacer(modifier = Modifier.height(125.dp))

        SearchBar(
            modifier = Modifier
                .padding(horizontal = Dimens.MediumPadding1)
                .fillMaxWidth(),
            text = "",
            readOnly = true,
            onValueChange = {},
            onSearch = {},
            onClick = navigateToSearch
        )

        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))


        Text(
            text = titles, modifier = Modifier
                .fillMaxWidth()
                .padding(start = Dimens.MediumPadding1)
                .basicMarquee(), fontSize = 12.sp,
            color = colorResource(id = R.color.placeholder)
        )

        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

        ArticlesList(
            modifier = Modifier.padding(horizontal = Dimens.MediumPadding1),
            articles = articles,
            onClick = navigateToDetails
        )
    }
}