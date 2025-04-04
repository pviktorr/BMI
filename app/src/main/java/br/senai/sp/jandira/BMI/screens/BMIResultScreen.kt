package br.senai.sp.jandira.BMI.screens

import android.content.Context
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.BMI.R

@Composable
fun BMIResultScreen(navegacao: NavHostController?) {
val userFile = LocalContext.current.getSharedPreferences("user_file", Context.MODE_PRIVATE)
val userAge = userFile.getInt("user_age", 0)
    val userWeight = userFile.getFloat("user_weight", 0.0f)
    val userHeight = userFile.getFloat("user_height", 0.0f)
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
                            .padding(top = 20.dp)
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
                            .padding(20.dp)
                            .height(100.dp)
                            .width(300.dp)


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
                                    text = "$userAge",
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
                                    text = "$userWeight",
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
                                    text = "$userHeight",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                            }
                        }


                    }
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                    ) {}
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .height(10.dp)
                    )
                    Button(onClick = {
                        navegacao?.navigate("user_data")
                    },
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .width(300.dp)
                            .height(50.dp),
                        shape = RoundedCornerShape(
                            topStart = 10.dp,
                            topEnd = 10.dp,
                            bottomEnd = 10.dp,
                            bottomStart = 10.dp
                        )

                    )
                    {
                        Text(text = stringResource(R.string.newcalc),
                            color = Color.White,
                            fontSize = 25.sp,
                            modifier = Modifier
                        )


                    }
                }
            }
        }
    }

}

@Preview
@Composable
private fun BMIResultScreenPreview() {
    BMIResultScreen(null)
}