package zulfa.binar.chapterempat.keempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_sfdua.*
import zulfa.binar.chapterempat.R

class MainSFDua : AppCompatActivity() {

    lateinit var sf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sfdua)

        sf = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        val getnama = sf.getString("NAMA", "")

        getnama_sf.text = getnama

        logout()
    }

    fun logout(){

        btn_logoutsf.setOnClickListener {

            val logout = sf.edit()
            logout.clear()
            logout.apply()

            startActivity(Intent(this, MainSF::class.java))
            finish()
        }
    }
}