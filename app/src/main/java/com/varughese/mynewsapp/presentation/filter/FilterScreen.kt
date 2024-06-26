package com.varughese.mynewsapp.presentation.filter

import android.graphics.Paint.Align
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource.selectedCategory

// Figma

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.alpha
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
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.varughese.mynewsapp.R
import com.varughese.mynewsapp.bottomnav4.Bottomnav4

@Composable
fun FilterScreen(
    viewModel: FilterViewModel = hiltViewModel(),
) {
    val selectedCategory by selectedCategory.collectAsState()

    FilterScreenFigma(modifier = Modifier.fillMaxWidth())
    CategoryFilter(viewModel = viewModel)
}

@Composable
fun CategoryFilter(viewModel: FilterViewModel) {
    var expanded by remember { mutableStateOf(false) }
    var categoryText by remember { mutableStateOf("Select Category") }
    Box(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
            .wrapContentSize(Alignment.Center),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = { expanded = true },
                modifier = Modifier.fillMaxWidth().height(56.dp)) {
                Text(categoryText)
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .width(240.dp)
                    .wrapContentHeight()
                    .align(Alignment.CenterHorizontally)
            ) {
                DropdownMenuItem(text = { Text(text = "Technology") }, onClick = {
                    viewModel.updateCategory("Technology")
                    expanded = false
                    categoryText = "Technology"
                })
                DropdownMenuItem(text = { Text(text = "Health") }, onClick = {
                    viewModel.updateCategory("Health")
                    expanded = false
                    categoryText = "Health"
                })
                DropdownMenuItem(text = { Text(text = "Science") }, onClick = {
                    viewModel.updateCategory("Science")
                    expanded = false
                    categoryText = "Science"
                })
                DropdownMenuItem(text = { Text(text = "Sports") }, onClick = {
                    viewModel.updateCategory("Sports")
                    expanded = false
                    categoryText = "Sports"
                })
                DropdownMenuItem(text = { Text(text = "No Filter") }, onClick = {
                    viewModel.updateCategory("No Filter")
                    expanded = false
                    categoryText = "No Filter"
                })
            }
        }
    }
}