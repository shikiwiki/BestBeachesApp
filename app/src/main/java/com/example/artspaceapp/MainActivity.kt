package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceAppTheme {
                CustomApp()
            }
        }
    }
}

@Composable
fun CustomApp() {
    var currentImage by remember { mutableIntStateOf(1) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(0.5f))
        NameComponent(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.weight(1f))

        when (currentImage) {
            1 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_1_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach1),
                    stringResource(R.string.place1),
                    modifier = Modifier.weight(2f)
                )
            }

            2 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_2_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach2),
                    stringResource(R.string.place2),
                    modifier = Modifier.weight(2f)
                )
            }

            3 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_3_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach3),
                    stringResource(R.string.place3),
                    modifier = Modifier.weight(2f)
                )
            }

            4 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_4_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach4),
                    stringResource(R.string.place4),
                    modifier = Modifier.weight(2f)
                )
            }

            5 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_5_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach5),
                    stringResource(R.string.place5),
                    modifier = Modifier.weight(2f)
                )
            }

            6 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_6_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach6),
                    stringResource(R.string.place6),
                    modifier = Modifier.weight(2f)
                )
            }

            7 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_7_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach7),
                    stringResource(R.string.place8),
                    modifier = Modifier.weight(2f)
                )
            }

            8 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_8_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach9),
                    stringResource(R.string.place9),
                    modifier = Modifier.weight(2f)
                )
            }

            9 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_9_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach10),
                    stringResource(R.string.place10),
                    modifier = Modifier.weight(2f)
                )
            }

            10 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_10_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach11),
                    stringResource(R.string.place11),
                    modifier = Modifier.weight(2f)
                )
            }

            11 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_11_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach12),
                    stringResource(R.string.place12),
                    modifier = Modifier.weight(2f)
                )
            }

            12 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_12_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach13),
                    stringResource(R.string.place13),
                    modifier = Modifier.weight(2f)
                )
            }

            13 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_13_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach14),
                    stringResource(R.string.place14),
                    modifier = Modifier.weight(2f)
                )
            }

            14 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_14_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach15),
                    stringResource(R.string.place15),
                    modifier = Modifier.weight(2f)
                )
            }

            15 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_15_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach16),
                    stringResource(R.string.place16),
                    modifier = Modifier.weight(2f)
                )
            }

            16 -> {
                ArtworkWall(
                    modifier = Modifier.weight(2f),
                    R.drawable.photo_16_2024_01_16_16_16_08
                )
                ArtworkDescriptor(
                    stringResource(R.string.beach1),
                    stringResource(R.string.place1),
                    modifier = Modifier.weight(2f)
                )
            }

        }

        Spacer(modifier = Modifier.weight(1f))
        DisplayController(
            modifier = Modifier
                .weight(2f)
                .align(Alignment.End),
            previous = {
                if (currentImage == 1) currentImage = 16
                else currentImage--
            }, next = {
                if (currentImage == 16) currentImage = 1
                else currentImage++
            })
    }
}

@Composable
fun NameComponent(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.best_beaches_ever),
            color = Color.White,
            modifier = modifier
                .fillMaxWidth()
                .size(80.dp)
                .align(Alignment.Center)
        )
    }
}

@Composable
fun ArtworkWall(
    modifier: Modifier = Modifier,
    @DrawableRes photo: Int,
    description: String? = null
) {
    Row(modifier = modifier.wrapContentSize()) {
        Image(
            painter = painterResource(id = photo),
            contentDescription = description,
            modifier = modifier.fillMaxWidth()
        )
    }
}

@Composable
fun ArtworkDescriptor(beach: String, place: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = beach,
            modifier = modifier
                .padding(24.dp, 16.dp, 24.dp, 0.dp)
                .weight(1f),
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = place,
            modifier = modifier
                .padding(24.dp, 0.dp, 24.dp, 0.dp)
                .weight(1f),
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
        )
    }
}

@Composable
fun DisplayController(modifier: Modifier = Modifier, previous: () -> Unit, next: () -> Unit) {
    Row(modifier = modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.weight(0.5f))
        Button(onClick = previous, modifier = modifier.weight(2f)) {
            Text(text = stringResource(R.string.previous))
        }
        Spacer(modifier = modifier.weight(2f))
        Button(onClick = next, modifier = modifier.weight(2f)) {
            Text(text = stringResource(R.string.next))
        }
        Spacer(modifier = Modifier.weight(0.5f))
    }
}

@Preview(showBackground = true)
@Composable
fun MyPreview() {
    ArtSpaceAppTheme {
        CustomApp()
    }
}