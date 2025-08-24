package com.example.perfis.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AddressCard(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(25.dp)
            .padding(top = 60.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.Gray
        ),
        elevation = CardDefaults.cardElevation(
           defaultElevation =  8.dp),
        content = {
            Column (
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(16.dp)
            ) {
                Row (
                    modifier = modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Trabalho",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                     Icon_Profile()
                }

                Spacer(modifier = Modifier.height(16.dp))

                val countAppBloqueados = 4 // placeholder enquando não há integração com a OASP

                Text(
                    text = "$countAppBloqueados Aplicativos Bloqueados"
                )

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = { /*
                        Ação para ativar o modo foco do perfil
                         */ },
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.width(200.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
                        border = BorderStroke(1.dp, Color.Black),
                        contentPadding = PaddingValues(16.dp),
                        interactionSource = remember { MutableInteractionSource() }
                    ) {
                        Text("Ativar Perfil")
                    }
                }


            }

        }
    )
    Card(
        modifier = modifier
            .padding(25.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Gray
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation =  8.dp),
        content = {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row (
                    modifier = modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Estudo",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Icon_Profile()
                }

                Spacer(modifier = Modifier.height(16.dp))

                val countAppBloqueados = 6 // placeholder enquando não há integração com a OASP

                Text(
                    text = "$countAppBloqueados Aplicativos Bloqueados"
                )
                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = { /*
                        Ação para ativar o modo foco do perfil
                         */ },
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.width(200.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
                        border = BorderStroke(1.dp, Color.Black),
                        contentPadding = PaddingValues(16.dp),
                        interactionSource = remember { MutableInteractionSource() }
                    ) {
                        Text("Ativar Perfil")
                    }
                }


            }

        }
    )
    Card(
        modifier = modifier
            .padding(25.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Gray
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation =  8.dp),
        content = {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row (
                    modifier = modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Conforto",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Icon_Profile()
                }

                Spacer(modifier = Modifier.height(16.dp))

                val countAppBloqueados = 6 // placeholder enquando não há integração com a OASP

                Text(
                    text = "$countAppBloqueados Aplicativos Bloqueados"
                )
                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = { /*
                         Ação para ativar o modo foco do perfil
                         */ },
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.width(200.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
                        border = BorderStroke(1.dp, Color.Black),
                        contentPadding = PaddingValues(16.dp),
                        interactionSource = remember { MutableInteractionSource() }
                    ) {
                        Text("Ativar Perfil")
                    }
                }


            }

        }
    )

}

@Preview(showBackground = true)
@Composable
fun AddressCardPreview() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        AddressCard()

    }


}