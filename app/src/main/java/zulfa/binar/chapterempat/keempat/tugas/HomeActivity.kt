package zulfa.binar.chapterempat.keempat.tugas

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_home.*
import zulfa.binar.chapterempat.R

class HomeActivity : AppCompatActivity() {

    lateinit var sp : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        sp = getSharedPreferences("SP", Context.MODE_PRIVATE)

        val nama = sp.getString("nama", "")
        tv_namauser.text = "Hello, $nama"

        btn_logout.setOnClickListener {

            val ad = AlertDialog.Builder(this)
            val ab = ad.create()
            ad.setTitle("Logout")
            ad.setMessage("Yakin Logout ?")
            ad.setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
                val logout = sp.edit()
                logout.clear()
                logout.apply()
                startActivity(Intent(this, TugasSfActivity::class.java))
                finish()
            }
            ad.setNeutralButton("Tidak"){ dialogInterface: DialogInterface, i: Int ->
                ab.dismiss()
            }
            ad.show()
        }
    }
}