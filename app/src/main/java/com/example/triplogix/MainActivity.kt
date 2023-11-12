package com.example.triplogix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripLogixApp()
        }
    }
}
val buttonModifier = Modifier
    .height(55.dp)
    .fillMaxWidth()
    .padding(vertical = 8.dp)

@Composable
fun StyledButton(onClick: () -> Unit, text: String) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .height(96.dp) // Adjust the height if needed
            .width(160.dp)
            .padding(horizontal = 15.dp, vertical = 15.dp), // Add horizontal padding if needed
        shape = RoundedCornerShape(6.dp), // Set the corner radius
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2699FB), // Set the background color
            contentColor = Color.White // Set the text color
        )
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Clip
            // You can add other text modifiers if needed
        )
    }
}


@Composable
fun TripLogixApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF1B1D2D) // Set your preferred background color here
    ) {
        val buttonSpacing = 16.dp

        Column {
            // Banner Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF3A3D52))
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "TripLogix",
                    style = MaterialTheme.typography.headlineMedium.copy(color = Color.White)
                )
                IconButton(onClick = { /* TODO: Open menu */ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
            }

            Row(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(30.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top
                ) {
                    // Define the style for the buttons


                    // Trip Start/End Buttons
                    StyledButton(
                        onClick = { /* TODO: Handle start trip */ },
                        text = "Start Trip"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))

                    StyledButton(
                        onClick = { /* TODO: Handle red light start */ },
                        text = "Red Light Start"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))

                    StyledButton(
                        onClick = { /* TODO: Handle red light start */ },
                        text = "Gas Station Start"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))

                    StyledButton(
                        onClick = { /* TODO: Handle red light start */ },
                        text = "Food Stop Start"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))
                }


                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(30.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top
                ) {
                    // Red Light Buttons
                    StyledButton(
                        onClick = { /* TODO: Handle end trip */ },
                        text = "End Trip"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))

                    StyledButton(
                        onClick = { /* TODO: Handle red light end */ },
                        text = "Red Light End"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))

                    StyledButton(
                        onClick = { /* TODO: Handle red light start */ },
                        text = "Gas Station End"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))

                    StyledButton(
                        onClick = { /* TODO: Handle red light start */ },
                        text = "Food Stop End"
                    )

                    Spacer(modifier = Modifier.height(buttonSpacing))

                }
            }
        }

           Column(
               modifier = Modifier
                   .fillMaxHeight()
                   .padding(30.dp),
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Bottom

           ){
               Button(onClick = { /* TODO: Handle red light start */ },
                   modifier = buttonModifier
               ) {
                   Text("Reset Trip")
               }


           }



            }
        }




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TripLogixApp()
}
