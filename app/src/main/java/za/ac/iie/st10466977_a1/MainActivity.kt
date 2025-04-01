package za.ac.iie.st10466977_a1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_morning: Button = findViewById(R.id.btn_morning)
        val btn_midmorning: Button = findViewById(R.id.btn_midmorning)
        val btn_afternoon: Button = findViewById(R.id.btn_afternoon)
        val btn_midafternoon: Button = findViewById(R.id.btn_midafternoon)
        val btn_dinner: Button = findViewById(R.id.btn_dinner)

        btn_morning.setOnClickListener {
            GoToMorningScreen()
        }
        btn_midmorning.setOnClickListener {
            GoToMidMorningScreen()
        }
        btn_afternoon.setOnClickListener {
            GoToAfternoonScreen()
        }
        btn_midafternoon.setOnClickListener {
            GoToMidAfternoonScreen()
        }
        btn_dinner.setOnClickListener {
            GoToDinnerScreen()
        }
    }

    private fun GoToMorningScreen(){
        val morningScreen = Intent(this, Morning::class.java)
        startActivity(morningScreen)
    }
    private fun GoToMidMorningScreen(){
        val midmorningScreen = Intent(this, MidMorning::class.java)
        startActivity(midmorningScreen)
    }
    private fun GoToAfternoonScreen() {
        val afternoonScreen = Intent(this, Afternoon::class.java)
        startActivity(afternoonScreen)
    }
    private fun GoToMidAfternoonScreen() {
        val midafternoonScreen = Intent(this, MidAfternoon::class.java)
        startActivity(midafternoonScreen)
    }
    private fun GoToDinnerScreen() {
        val dinnerScreen = Intent(this, Dinner::class.java)
        startActivity(dinnerScreen)
    }
}