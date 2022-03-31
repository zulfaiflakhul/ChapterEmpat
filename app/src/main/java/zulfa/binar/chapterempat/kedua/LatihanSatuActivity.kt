package zulfa.binar.chapterempat.kedua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_latihan_satu.*
import zulfa.binar.chapterempat.R

class LatihanSatuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_satu)

        btn_latihanAlert.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Hapus Aplikasi?")
                .setIcon(R.drawable.ic_home)
                .setMessage("Hapus Aplikasi?")
                .show()
        }

        btn_goscreendua.setOnClickListener {
            startActivity(Intent(this, LatihanScreenDua::class.java))
        }
    }
}