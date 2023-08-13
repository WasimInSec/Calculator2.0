package code.with.cal.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var canAddOperation = false
    private var canAddDecimal = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*fun numberAction(view: View) {
        if(view is Button){
           if(view.text == "."){
               if(canAddDecimal)
                   workingTV.append(view.text)
               canAddDecimal = false
           }
          else
               workingTV.append(view.text)
            canAddDecimal = true
        }
    }
    fun operationAction(view: View) {
        if(view is Button){
            workingTV.append(view.text)
            canAddOperation = false
            canAddDecimal = true
        }
    }
   // fun allClearAction(view: View) {
       // workingTV.text =" "
      //  resultsTV.text =" "
   // }
    fun backSpaceAction(view: View) {
        var length = workingTV.length()
    }
    fun equalAction(view: View) {

    }

*/
}

