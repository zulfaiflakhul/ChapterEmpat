package zulfa.binar.chapterempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import zulfa.binar.chapterempat.challenge.satu.FirstChallenge
import zulfa.binar.chapterempat.kedua.AlertDialogActivity
import zulfa.binar.chapterempat.kedua.LatihanSatuActivity
import zulfa.binar.chapterempat.kedua.tugas.TugasActivity
import zulfa.binar.chapterempat.ketiga.DataMahasiswaActivity
import zulfa.binar.chapterempat.ketiga.tugas.TugasRecycleActivity
import zulfa.binar.chapterempat.pertama.FirstActivity
import zulfa.binar.chapterempat.pertama.NavComponentPertama

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_first.setOnClickListener {

            startActivity(Intent(this, FirstActivity::class.java))
        }

        btn_latihan.setOnClickListener {

            startActivity(Intent(this, FirstChallenge::class.java))
        }

        btn_navFragment.setOnClickListener {

            startActivity(Intent(this, NavComponentPertama::class.java))
        }

        btn_alertdialog.setOnClickListener {

            startActivity(Intent(this, AlertDialogActivity::class.java))
        }

        btn_latAlert.setOnClickListener {

            startActivity(Intent(this, LatihanSatuActivity::class.java))
        }

        btn_tugasAlert.setOnClickListener {

            startActivity(Intent(this, TugasActivity::class.java))
        }

        btn_rv.setOnClickListener {

            startActivity(Intent(this, DataMahasiswaActivity::class.java))
        }

        btn_tugasrv.setOnClickListener {

            startActivity(Intent(this, TugasRecycleActivity::class.java))
        }
    }
}