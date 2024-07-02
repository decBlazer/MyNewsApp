package com.varughese.mynewsapp.presentation.news_navigator.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.varughese.mynewsapp.bottomnav4.Bookmark
import com.varughese.mynewsapp.bottomnav4.Bookmark1
import com.varughese.mynewsapp.bottomnav4.Bookmark2
import com.varughese.mynewsapp.bottomnav4.Filter
import com.varughese.mynewsapp.bottomnav4.FilterAlt
import com.varughese.mynewsapp.bottomnav4.FilterAlt1
import com.varughese.mynewsapp.bottomnav4.Home
import com.varughese.mynewsapp.bottomnav4.Home1
import com.varughese.mynewsapp.bottomnav4.Home2
import com.varughese.mynewsapp.bottomnav4.Search
import com.varughese.mynewsapp.bottomnav4.Search1
import com.varughese.mynewsapp.bottomnav4.Search2
import com.varughese.mynewsapp.bottomnav4.Tabbar4
import com.varughese.mynewsapp.bottomnav4.TopLevel
import com.varughese.mynewsapp.bottomnav4.Vector
import com.varughese.mynewsapp.bottomnav4.Vector1
import com.varughese.mynewsapp.bottomnav4.Vector2
import com.varughese.mynewsapp.bottomnav4.Vector3

@Composable
fun Bottomnav4(
    items: List<BottomNavigationItem>,
    selectedItem: Int,
    onItemClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp), // Typical height of bottom navigation bar
        containerColor = MaterialTheme.colorScheme.background,
        tonalElevation = 10.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEachIndexed { index, item ->
                when (item.text) {
                    "Home" -> HomeTab(
                        selected = index == selectedItem,
                        onClick = { onItemClick(index) }
                    )

                    "Search" -> SearchTab(
                        selected = index == selectedItem,
                        onClick = { onItemClick(index) }
                    )

                    "Bookmark" -> BookmarkTab(
                        selected = index == selectedItem,
                        onClick = { onItemClick(index) }
                    )

                    "Filter" -> FilterTab(
                        selected = index == selectedItem,
                        onClick = { onItemClick(index) }
                    )
                }
            }
        }
    }
}


@Composable
fun HomeTab(selected: Boolean, onClick: () -> Unit) {
    Home {
        Home1 {
            Home2(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            ) {
                Vector(
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
            }
        }
        Home(modifier = Modifier.clickable(onClick = onClick))
    }
}

@Composable
fun SearchTab(selected: Boolean, onClick: () -> Unit) {
    Search {
        Search1 {
            Search2(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            ) {
                Vector1(
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
            }
        }
        Search(modifier = Modifier.clickable(onClick = onClick))
    }
}

@Composable
fun BookmarkTab(selected: Boolean, onClick: () -> Unit) {
    Bookmark {
        Bookmark1 {
            Bookmark2(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            ) {
                Vector2(
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
            }
        }
        Bookmark(modifier = Modifier.clickable(onClick = onClick))
    }
}

@Composable
fun FilterTab(selected: Boolean, onClick: () -> Unit) {
    Filter {
        FilterAlt {
            FilterAlt1(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            ) {
                Vector3(
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
            }
        }
        Filter(modifier = Modifier.clickable(onClick = onClick))
    }
}