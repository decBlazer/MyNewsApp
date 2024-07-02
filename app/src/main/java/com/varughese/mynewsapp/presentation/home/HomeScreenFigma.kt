package com.varughese.mynewsapp.presentation.home

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.varughese.mynewsapp.R

/**
 * home screen
 *
 * This composable was generated from the UI Package 'home_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        SearchBar(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 148.0.dp
                )
            )
        )
        Bottomnav4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 709.0.dp
                )
            )
        ) {
            Tabbar4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                Tabs(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 2.5.dp
                        )
                    )
                ) {
                    Home {
                        Home1 {
                            Home2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Home()
                    }
                    Search {
                        Search1 {
                            Search2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Search()
                    }
                    Bookmark {
                        Bookmark1 {
                            Bookmark2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Bookmark()
                    }
                    Filter {
                        FilterAlt {
                            FilterAlt1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Filter()
                    }
                }
            }
        }
        VarugheseNews(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Brightness4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HomeScreenPreview() {
    MaterialTheme {
        RelayContainer {
            HomeScreen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_search_bar),
        modifier = modifier.requiredWidth(306.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 3.5.dp,
                end = 2.0.dp,
                bottom = 3.500001907348633.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Home2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Home1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Home(modifier: Modifier = Modifier) {
    RelayText(
        content = "Home",
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 74,
            green = 85,
            blue = 104
        ),
        height = 1.4285714721679688.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Home(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.2550048828125.dp,
                top = 3.2550048828125.dp,
                end = 3.254995346069336.dp,
                bottom = 3.254995346069336.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Search2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Search1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Search(modifier: Modifier = Modifier) {
    RelayText(
        content = "Search",
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 74,
            green = 85,
            blue = 104
        ),
        height = 1.4285714721679688.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Search(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.0.dp,
                top = 3.0.dp,
                end = 5.0.dp,
                bottom = 3.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Bookmark2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Bookmark1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Bookmark(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bookmark",
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 74,
            green = 85,
            blue = 104
        ),
        height = 1.4285714721679688.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Bookmark(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.04339599609375.dp,
                top = 4.0.dp,
                end = 4.04339599609375.dp,
                bottom = 4.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FilterAlt1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FilterAlt(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Filter(modifier: Modifier = Modifier) {
    RelayText(
        content = "Filter",
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 74,
            green = 85,
            blue = 104
        ),
        height = 1.4285714721679688.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Filter(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Tabs(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 32.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Tabbar4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).relayDropShadow(
            color = Color(
                alpha = 30,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 0.0.dp,
            offsetX = 0.0.dp,
            offsetY = -1.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun Bottomnav4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 50.0,
        content = content,
        modifier = modifier.requiredWidth(375.0.dp).requiredHeight(91.0.dp)
    )
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
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 55.0.dp,
                top = 109.0.dp,
                end = 40.0.dp,
                bottom = 652.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_vector4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.248748779296875.dp,
                top = 3.076263427734375.dp,
                end = 3.248748779296875.dp,
                bottom = 3.0762481689453125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 123.0.dp,
                top = 2.0.dp,
                end = 124.0.dp,
                bottom = 691.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        radius = 50.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
