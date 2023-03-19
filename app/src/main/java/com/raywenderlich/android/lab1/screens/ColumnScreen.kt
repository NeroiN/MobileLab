import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

val THREE_ELEMENT_LIST2 = listOf(R.string.massage_4, R.string.massage_5, R.string.massage_6)
@Composable
fun ColumnScreen(){
    MyColumn()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyColumn() {
    Column(
         horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    )

    {
        THREE_ELEMENT_LIST2.forEach { textResId ->
            Text(
                text = stringResource(id = textResId),
                fontSize = 18.sp
            )
        }
    }

}

fun Text(text: String, color: Int, fontSize: TextUnit, modidier: Modifier) {

}
