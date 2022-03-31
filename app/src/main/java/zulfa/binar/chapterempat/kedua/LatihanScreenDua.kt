package zulfa.binar.chapterempat.kedua

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_latihan_screen_dua.*
import zulfa.binar.chapterempat.R

class LatihanScreenDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_screen_dua)

        btn_proses.setOnClickListener {

            val x = et_angkasatu.text.toString().toInt()
            val y = et_angkadua.text.toString().toInt()
            val hasil = x * y

            val a = AlertDialog.Builder(this)
            val b = a.create()
                a.setTitle("Hasil Perkalian")
                a.setMessage("Hasil Kali $x * $y = $hasil")
                a.setNeutralButton("Dismis"){ dialogInterface: DialogInterface, i: Int ->
                    b.dismiss()
                }
                a.show()
        }
    }
}