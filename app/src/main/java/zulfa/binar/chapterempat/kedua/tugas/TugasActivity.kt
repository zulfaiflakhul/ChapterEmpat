package zulfa.binar.chapterempat.kedua.tugas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_tugas.*
import kotlinx.android.synthetic.main.activity_tugas.tv_total
import kotlinx.android.synthetic.main.custom_kasir.view.*
import kotlinx.android.synthetic.main.fragment_alert_dialog_tugas.*
import zulfa.binar.chapterempat.R
import zulfa.binar.chapterempat.kedua.AlertDialogFragment

class TugasActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas)

        btn_hitung.setOnClickListener {

            val barang = et_barang.text.toString()
            val jumlah = et_jumlah.text.toString()
            val harga = et_harga.text.toString()
            val total = jumlah.toInt() * harga.toInt()

            val custom = LayoutInflater.from(this).inflate(R.layout.custom_kasir, null, false)
            val aa = AlertDialog.Builder(this)
                .setView(custom)
                .create()

            custom.tv_total.text = total.toString()
            custom.btn_bayar.setOnClickListener {

                val bayar = custom.et_bayar.text.toString().toInt()
                val kembalian = bayar - total
                aa.dismiss()

                tv_barang.text = "Barang : $barang"
                tv_jumlah.text = "Jumlah : $jumlah"
                tv_harga.text = "Harga : $harga"
                tv_total.text = "Total : $total"
                tv_kembalian.text = "Uang Kembalian : $kembalian"
            }
            aa.show()
        }

        btn_hitungFrag.setOnClickListener {

            AlertDialogTugas().show(supportFragmentManager, "abc",)
        }
    }
}