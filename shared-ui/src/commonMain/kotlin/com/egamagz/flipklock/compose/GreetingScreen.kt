import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.egamagz.flipklock.Greeting

@Composable
fun GreetingScreen() {
    val greeting = Greeting()

    GreetingContent(greeting.greet())
}

@Composable
fun GreetingContent(text: String) {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Surface(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Text(
                    text = text,
                    style = MaterialTheme.typography.h1,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }
    }
}