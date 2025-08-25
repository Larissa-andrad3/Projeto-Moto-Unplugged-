import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import com.example.perfis.components.CustomToast
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.perfis.components.Icon_Profile


@Composable
fun AddressCards(
    modifier: Modifier = Modifier
) {
    var showToast by remember { mutableStateOf(false) }

    val cards = listOf(
        Pair("Trabalho", 4),
        Pair("Estudo", 6),
        Pair("Conforto", 6)
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {
        cards.forEach { (title, count) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 10.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFEFEFEF)),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(modifier = modifier.padding(16.dp)) {
                    Row (
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(title, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF000000))
                        Icon_Profile()

                    }

                    Spacer(Modifier.height(16.dp))
                    Text("$count Aplicativos Bloqueados", fontSize = 14.sp, color = Color(0xFF7E7E7E))
                    Spacer(Modifier.height(16.dp))

                    Button(
                        onClick = { showToast = true },
                        modifier = modifier
                            .fillMaxWidth(0.9f)
                            .height(40.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        )

                    ) {

                        Text("Ativar Perfil")
                    }
                }
            }
        }

        // Toast sempre abaixo do último card
        if (showToast) {
            Spacer(modifier = Modifier.height(8.dp))
            CustomToast("Perfil Ativado")
            LaunchedEffect(Unit) {
                delay(2000)
                showToast = false
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddressCardsPreview() {
    AddressCards()
}
