package zulfa.binar.chapterempat.keempat.latihan

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_latihan_sf.*
import zulfa.binar.chapterempat.R

class LatihanSF : AppCompatActivity() {

    lateinit var pref : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_sf)

        pref = getSharedPreferences("PREF", Context.MODE_PRIVATE)

        btn_save.setOnClickListener {

            val id = et_id.text.toString()
            val nama = et_nama.text.toString()
            val sf = pref.edit()
            sf.putString("ID", id)
            sf.putString("NAMA", nama)
            sf.apply()
            Toast.makeText(this, "Data Disimpan", Toast.LENGTH_LONG).show()
            finish()
        }

        btn_view.setOnClickListener {

            pref = getSharedPreferences("PREF", Context.MODE_PRIVATE)
            val txt_id = pref.getString("ID", "")
            val txt_nama = pref.getString("NAMA", "")

            if (getSharedPreferences("PREF", Context.MODE_PRIVATE).contains("NAMA")){
                tv_id.text = txt_id
                tv_nama.text = txt_nama
            } else{
                Toast.makeText(this, "Data Tidak Ada", Toast.LENGTH_LONG).show()
            }
        }

        btn_clear.setOnClickListener {

            val clear = pref.edit()
            clear.clear()
            clear.apply()

            Toast.makeText(this, "Data Dihapus", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}