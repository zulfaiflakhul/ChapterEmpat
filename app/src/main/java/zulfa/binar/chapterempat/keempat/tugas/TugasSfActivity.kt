package zulfa.binar.chapterempat.keempat.tugas

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tugas_sf.*
import zulfa.binar.chapterempat.R
import zulfa.binar.chapterempat.keempat.MainSFDua

class TugasSfActivity : AppCompatActivity() {

    lateinit var sp : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_sf)

        sp = getSharedPreferences("SP", Context.MODE_PRIVATE)
        if (getSharedPreferences("SP", Context.MODE_PRIVATE).contains("nama")){
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        btn_login.setOnClickListener {

            val nama = et_username.text.toString()
            val password = et_password.text.toString()
            val sf = sp.edit()
            sf.putString("nama", nama)
            sf.apply()

            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}