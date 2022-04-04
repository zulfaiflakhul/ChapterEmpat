package zulfa.binar.chapterempat.ketiga.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tugas_recycle.*
import zulfa.binar.chapterempat.R

class TugasRecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_recycle)

        val dataaplikasi = arrayListOf(
            DataAplikasi(
                "Binar App",
                "Binar Academy",
                "Pendidikan",
                "5",
                "30 MB",
                "1jt"),
            DataAplikasi(
                "Zenius App",
                "Zenius Academy",
                "Pendidikan",
                "5",
                "30 MB",
                "500rb"),
            DataAplikasi(
                "Ruang Guru App",
                "Ruabg Guru Academy",
                "Pendidikan",
                "5",
                "30 MB",
                "3jt")
        )

        val adapt = AdapterApp(dataaplikasi)
        val laymanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_dataaplikasi.layoutManager = laymanager
        rv_dataaplikasi.adapter = adapt
    }
}