package sanez.miguel.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    val CATEGORIA = "categoria"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweets: Button = findViewById(R.id.button_sweets) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button

        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).apply {
                putExtra(CATEGORIA,"cold")
            }
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).apply{
                putExtra(CATEGORIA,"hot")
            }
            startActivity(intent)
        }
        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).apply{
                putExtra(CATEGORIA,"sweets")
            }
            startActivity(intent)
        }
        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).apply{
                putExtra(CATEGORIA,"salties")
            }
            startActivity(intent)
        }
    }
}