package io.solidcrafts.tmdbcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.solidcrafts.tmdbcompose.domain.Movie
import io.solidcrafts.tmdbcompose.ui.composables.MovieCard
import io.solidcrafts.tmdbcompose.ui.theme.TmdbComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TmdbComposeTheme {
                val painter = painterResource(id = R.drawable.ic_launcher_background)

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    content = {
                        items(100) {
                            MovieCard(
                                modifier = Modifier.padding(8.dp),
                                movie = Movie("Movie $it"),
                                painter = painter
                            )
                        }
                    })
            }
        }
    }
}