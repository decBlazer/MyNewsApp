package com.varughese.mynewsapp.presentation.mainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.varughese.mynewsapp.BuildConfig
import com.varughese.mynewsapp.data.local.Secrets.NEWS_API_KEY
import com.varughese.mynewsapp.presentation.navgraph.NavGraph
import com.varughese.mynewsapp.ui.theme.NewsAppTheme
import dagger.hilt.android.AndroidEntryPoint
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse
import timber.log.Timber
import com.varughese.mynewsapp.homescreen.HomeScreen
import com.varughese.mynewsapp.presentation.splash.SplashScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            NewsAppTheme {
                val isSystemInDarkMode = isSystemInDarkTheme()
                val systemUiColor = rememberSystemUiController()
                SideEffect {
                    systemUiColor.setSystemBarsColor(
                        color = Color.Transparent,
                        darkIcons = !isSystemInDarkMode
                    )
                }
                SplashScreen {

                    setContent {
                        Box(
                            modifier = Modifier
                                .background(MaterialTheme.colorScheme.background)
                                .fillMaxSize()
                        ) {
                            NavGraph(startDestination = viewModel.startDestination.value)
                        }
                    }
                }
            }
        }
    }


    suspend fun main() {
        val client = HttpClient(CIO)
        val response: HttpResponse =
            client.post("https://newsapi.org/v2/everything?q=soccer&apiKey=$NEWS_API_KEY")
        println(response.status)
        client.close()
    }
}