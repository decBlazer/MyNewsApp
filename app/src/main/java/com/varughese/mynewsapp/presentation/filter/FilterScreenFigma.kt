package com.varughese.mynewsapp.presentation.filter

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
import com.varughese.mynewsapp.R
import com.varughese.mynewsapp.bottomnav4.Bottomnav4

/**
 * This composable was generated from the UI Package 'filter_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun FilterScreen(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Bottomnav4Instance(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 709.0.dp
                )
            )
        )
        DropdownBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 178.0.dp
                )
            )
        ) {
            Header(modifier = Modifier.rowWeight(1.0f)) {
                Category {
                    Category1()
                }
                IconsRegularChevronDownS {
                    Icon1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            ItemsFrame(modifier = Modifier.rowWeight(1.0f)) {
                ItemsList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.BottomStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 416.7153993844986.dp
                        )
                    ).rowWeight(1.0f)
                ) {
                    ItemHover(modifier = Modifier.rowWeight(1.0f)) {
                        Health2 {
                            Health3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                        IconsRegularChevronDownS1 {
                            Icon3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    ItemHover1(modifier = Modifier.rowWeight(1.0f)) {
                        Science4 {
                            Science5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                        IconsRegularChevronDownS2 {
                            Icon5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    ItemHover2(modifier = Modifier.rowWeight(1.0f)) {
                        Technology6 {
                            Technology7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                        IconsRegularChevronDownS3 {
                            Icon7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    ItemHover3(modifier = Modifier.rowWeight(1.0f)) {
                        Sports8 {
                            Sports9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                        IconsRegularChevronDownS4 {
                            Icon9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    ItemHover4(modifier = Modifier.rowWeight(1.0f)) {
                        NoFilter10 {
                            NoFilter11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                        IconsRegularChevronDownS5 {
                            Icon11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
        }
        ChooseACategory(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun FilterScreenPreview() {
    MaterialTheme {
        RelayContainer {
            FilterScreen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Bottomnav4Instance(modifier: Modifier = Modifier) {
    Bottomnav4(modifier = modifier.requiredWidth(375.0.dp).requiredHeight(91.0.dp))
}

@Composable
fun Category1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Category",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 49,
            green = 48,
            blue = 67
        ),
        height = 1.5.em,
        letterSpacing = 0.36.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Category(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 19.115385055541992,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Icon1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.filter_screen_icon),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.964599609375.dp,
                top = 14.3365478515625.dp,
                end = 7.9648895263671875.dp,
                bottom = 11.15063190460205.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsRegularChevronDownS(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(38.230770111083984.dp).requiredHeight(38.230770111083984.dp)
    )
}

@Composable
fun Header(
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
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 34.407691955566406.dp,
            top = 21.02692413330078.dp,
            end = 34.407691955566406.dp,
            bottom = 21.02692413330078.dp
        ),
        clipToParent = false,
        radius = 15.29230785369873,
        strokeWidth = 2.484999895095825,
        borderAlignment = BorderAlignment.Outside,
        strokeColor = Color(
            alpha = 255,
            red = 183,
            green = 186,
            blue = 194
        ),
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun Health3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Health",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 49,
            green = 48,
            blue = 67
        ),
        height = 1.5.em,
        letterSpacing = 0.36.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 6.019233703613281.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Health2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(86.01923370361328.dp).requiredHeight(34.407691955566406.dp)
    )
}

@Composable
fun Icon3(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.964599609375.dp,
                top = 14.336540222167969.dp,
                end = 7.9648895263671875.dp,
                bottom = 11.150639533996582.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsRegularChevronDownS1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(38.230770111083984.dp).requiredHeight(38.230770111083984.dp).alpha(alpha = 0.0f)
    )
}

@Composable
fun ItemHover(
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
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 45.876922607421875.dp,
            top = 21.02692413330078.dp,
            end = 45.876922607421875.dp,
            bottom = 21.02692413330078.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun Science5(modifier: Modifier = Modifier) {
    RelayText(
        content = "Science",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 49,
            green = 48,
            blue = 67
        ),
        height = 1.5.em,
        letterSpacing = 0.36.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Science4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(93.6653823852539.dp).requiredHeight(34.407691955566406.dp)
    )
}

@Composable
fun Icon5(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.964599609375.dp,
                top = 14.336536407470703.dp,
                end = 7.9648895263671875.dp,
                bottom = 11.150643348693848.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsRegularChevronDownS2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(38.230770111083984.dp).requiredHeight(38.230770111083984.dp).alpha(alpha = 0.0f)
    )
}

@Composable
fun ItemHover1(
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
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 45.876922607421875.dp,
            top = 21.02692413330078.dp,
            end = 45.876922607421875.dp,
            bottom = 21.02692413330078.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun Technology7(modifier: Modifier = Modifier) {
    RelayText(
        content = "Technology",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 49,
            green = 48,
            blue = 67
        ),
        height = 1.5.em,
        letterSpacing = 0.36.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Technology6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(93.6653823852539.dp).requiredHeight(34.407691955566406.dp)
    )
}

@Composable
fun Icon7(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.964599609375.dp,
                top = 14.336540222167969.dp,
                end = 7.9648895263671875.dp,
                bottom = 11.150639533996582.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsRegularChevronDownS3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(38.230770111083984.dp).requiredHeight(38.230770111083984.dp).alpha(alpha = 0.0f)
    )
}

@Composable
fun ItemHover2(
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
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 45.876922607421875.dp,
            top = 21.02692413330078.dp,
            end = 45.876922607421875.dp,
            bottom = 21.02692413330078.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun Sports9(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sports",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 49,
            green = 48,
            blue = 67
        ),
        height = 1.5.em,
        letterSpacing = 0.36.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 17.576927185058594.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Sports8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(95.5769271850586.dp).requiredHeight(34.407691955566406.dp)
    )
}

@Composable
fun Icon9(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.964599609375.dp,
                top = 14.336540222167969.dp,
                end = 7.9648895263671875.dp,
                bottom = 11.150639533996582.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsRegularChevronDownS4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(38.230770111083984.dp).requiredHeight(38.230770111083984.dp).alpha(alpha = 0.0f)
    )
}

@Composable
fun ItemHover3(
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
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 45.876922607421875.dp,
            top = 21.02692413330078.dp,
            end = 45.876922607421875.dp,
            bottom = 21.02692413330078.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun NoFilter11(modifier: Modifier = Modifier) {
    RelayText(
        content = "Politics",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 49,
            green = 48,
            blue = 67
        ),
        height = 1.5.em,
        letterSpacing = 0.36.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 6.665382385253906.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun NoFilter10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(93.6653823852539.dp).requiredHeight(34.407691955566406.dp)
    )
}

@Composable
fun Icon11(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.964599609375.dp,
                top = 14.336532592773438.dp,
                end = 7.9648895263671875.dp,
                bottom = 11.150647163391113.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsRegularChevronDownS5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(38.230770111083984.dp).requiredHeight(38.230770111083984.dp).alpha(alpha = 0.0f)
    )
}

@Composable
fun ItemHover4(
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
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 45.876922607421875.dp,
            top = 21.02692413330078.dp,
            end = 45.876922607421875.dp,
            bottom = 21.02692413330078.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun ItemsList(
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
        mainAxisAlignment = MainAxisAlignment.End,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(416.71539306640625.dp)
    )
}

@Composable
fun ItemsFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(1.9115384817123413.dp)
    )
}

@Composable
fun DropdownBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(266.0.dp).requiredHeight(82.19615173339844.dp)
    )
}

@Composable
fun ChooseACategory(modifier: Modifier = Modifier) {
    RelayText(
        content = "Choose a Category",
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
                start = 47.0.dp,
                top = 62.0.dp,
                end = 48.0.dp,
                bottom = 699.0.dp
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
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
