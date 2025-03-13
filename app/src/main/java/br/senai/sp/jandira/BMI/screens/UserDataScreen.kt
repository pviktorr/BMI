package br.senai.sp.jandira.BMI.screens

import android.service.autofill.OnClickAction
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.BMI.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier) {
    Box(
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
        Column(
            modifier = Modifier

        ) {
            Text(
                text = stringResource(R.string.hi),
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier
                    .padding(32.dp)
                    .weight(1f)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f),
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
                                            Color.White,
                                            Color.Blue
                                        )
                                    )
                                )


                            ) {
                                Image(
                                    painter = painterResource(R.drawable.man),
                                    contentDescription = ""
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                colors = ButtonDefaults
                                    .buttonColors(
                                        containerColor = Color.Blue
                                    )
                            ) {
                                Text(text = stringResource(R.string.male))

                            }
                        }
                        Column(
                            modifier = Modifier
                                .weight(1f),
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
                                            Color.White,
                                            Color.Blue
                                        )
                                    )
                                )


                            ) {
                                Image(
                                    painter = painterResource(R.drawable.woman),
                                    contentDescription = ""
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                colors = ButtonDefaults
                                    .buttonColors(
                                        containerColor = Color.Red
                                    )
                            ) {
                                Text(text = stringResource(R.string.female))

                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        OutlinedTextField(value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth(),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Numbers,
                                    contentDescription = ""

                                )
                            }, label = {
                                Text(text = stringResource(R.string.age))
                            },
                            shape = RoundedCornerShape(
                                16.dp
                            )

                        )
                        OutlinedTextField(value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = ""

                                )
                            }, label = {
                                Text(text = stringResource(R.string.weight))
                            },
                            shape = RoundedCornerShape(
                                16.dp
                            )

                        )
                        OutlinedTextField(value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth(),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = ""

                                )
                            }, label = {
                                Text(text = stringResource(R.string.height))
                            },
                            shape = RoundedCornerShape(
                                16.dp
                            )

                        )

                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Text(text = stringResource(R.string.calculate))
                    }
                }

            }

        }
    }

}

@Preview(showBackground = true)
@Composable
private fun UserDataScreenpreview() {
    UserDataScreen()
}