package zulfa.binar.chapterempat.pertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*
import zulfa.binar.chapterempat.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btn_toast.setOnClickListener {
            val data = "qwerty"
            Toast.makeText(this, "This is example toast $data", Toast.LENGTH_LONG).show()
        }
        
        btn_snackbar.setOnClickListener { 
            Snackbar.make(it, "Ini adalah snackbar", Snackbar.LENGTH_LONG).show()
        }

        btn_snackbardua.setOnClickListener {
            Snackbar.make(it, "Ini adalah snackbar dua", Snackbar.LENGTH_LONG)
                .setAction("Show Toast"){
                    Toast.makeText(this, "ini toast snackbar dua", Toast.LENGTH_LONG)
                        .show()
                }
                .show()
        }

        btn_snackbartiga.setOnClickListener {
            val a = Snackbar.make(it, "Ini adalah snackbar dua", Snackbar.LENGTH_INDEFINITE)
                a.setAction("Dismis"){
                    a.dismiss()
                }
                a.show()
        }
    }
}