package br.senai.sp.jandira.BMI.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.BMI.R

@Composable
fun BMIResultScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFD00DAFF),
                            Color(0xFF0005F1),
                        )
                    )
                )
        ) {
            Text(
                text = stringResource(R.string.result),
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(20.dp)
                    .weight(1f)

            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(7.5f),
                shape = RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp

                )

            ) {
                Column(
                    modifier = Modifier
                        .background(color = Color.White)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Card(
                        modifier = Modifier
                            .size(130.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color.White
                            ),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 4.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color.Blue,
                                    Color.White
                                )
                            )
                        )

                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Text(
                                text = "30,6",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.SemiBold

                            )
                        }


                    }
                    Text(
                        text = stringResource(R.string.obesity),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(top = 16.dp)

                    )
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(300.dp)
                            .background(color = Color.White)


                    ) {
                        Row(
                            modifier = Modifier

                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(top = 15.dp)
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally


                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.age
                                    ),
                                    fontSize = 20.sp
                                )
                                Text(
                                    text = "50",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold,
                                )


                            }
                            VerticalDivider(
                                modifier = Modifier
                                    .width(1.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(15.dp)
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.weight)
                                )
                                Text(
                                    text = "90 Kg",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )

                            }
                            VerticalDivider(
                                modifier = Modifier
                                    .width(1.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(15.dp)
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally

                            ) {
                                Text(
                                    text = stringResource(R.string.height)
                                )
                                Text(
                                    text = "178 cm",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                            }
                        }
        Card (
    modifier = Modifier
){

}
                    }
                }
            }
        }
    }

}

@Preview
@Composable
private fun BMIResultScreenPreview() {
    BMIResultScreen()
}