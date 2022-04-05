package zulfa.binar.chapterempat.keempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latihan_sf.*
import kotlinx.android.synthetic.main.activity_main_sf.*
import zulfa.binar.chapterempat.R

class MainSF : AppCompatActivity() {

    lateinit var pref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sf)

        if (getSharedPreferences("contoh", Context.MODE_PRIVATE).contains("NAMA")){
            startActivity(Intent(this, MainSFDua::class.java))
            finish()
        }

        pref = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        sharedPrefExample()
    }

    fun sharedPrefExample(){

        btn_simpan.setOnClickListener {

            val datanama = enter_nama.text.toString()
            val sf = pref.edit()
            sf.putString("NAMA", datanama)
            sf.apply()

            startActivity(Intent(this, MainSFDua::class.java))
            finish()
        }
    }
}