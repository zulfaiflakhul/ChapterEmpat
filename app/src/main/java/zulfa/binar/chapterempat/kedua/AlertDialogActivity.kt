package zulfa.binar.chapterempat.kedua

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import zulfa.binar.chapterempat.R

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        alert_satu.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Title Example")
                .setMessage("Contoh pesan dari Alert Dialog Standar")
                .setIcon(R.drawable.ic_home)
                .show()
        }

        alert_dua.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Hapus File")
                .setMessage("Yakin hapus file anda?")
                .setCancelable(false)
                .setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Data dihapus", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Tidak"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        alert_tiga.setOnClickListener {

            val ad = AlertDialog.Builder(this)
            val ab = ad.create()
            ad.setTitle("Example of Dismis")
            ad.setMessage("Isi Message dari example of dismis")
            ad.setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this, "Data Anda terhapus", Toast.LENGTH_SHORT).show()
            }
            ad.setNeutralButton("Dismis"){ dialogInterface: DialogInterface, i: Int ->
                ab.dismiss()
            }
            ad.show()
        }
    }
}