package com.varughese.mynewsapp.presentation.filter

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
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource.selectedCategory

@Composable
fun FilterScreen(
    viewModel: FilterViewModel = hiltViewModel(),
) {
    val selectedCategory by selectedCategory.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        CategoryFilter(viewModel = viewModel)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Selected Category: $selectedCategory")
    }
}

@Composable
fun CategoryFilter(viewModel: FilterViewModel) {
    var expanded by remember { mutableStateOf(false) }

    Column {
        Text(text = "Category")

        Box {
            Button(onClick = { expanded = true }) {
                Text("Select Category")
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(text = { Text(text = "Technology") }, onClick = {
                    viewModel.updateCategory("Technology")
                    expanded = false
                })
                DropdownMenuItem(text = { Text(text = "Health") }, onClick = {
                    viewModel.updateCategory("Health")
                })
                DropdownMenuItem(text = { Text(text = "Science") }, onClick = {
                    viewModel.updateCategory("Science")
                })
                DropdownMenuItem(text = { Text(text = "Sports") }, onClick = {
                    viewModel.updateCategory("Sports")
                })
            }
        }
    }
}