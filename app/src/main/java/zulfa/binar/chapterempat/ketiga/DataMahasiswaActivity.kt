package zulfa.binar.chapterempat.ketiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*
import zulfa.binar.chapterempat.R

class DataMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val datamahasiswa = arrayListOf(
            DataMhs("Ani", "23"),
            DataMhs("Budi", "21"),
            DataMhs("Tono", "12"),
            DataMhs("Joko", "14"),
            DataMhs("Ade", "25"),
            DataMhs("Ujik", "23"),
            DataMhs("Ardes", "32")
        )

        val adapt = AdapterMahasiswa(datamahasiswa)
        val laymanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_datamahasiswa.layoutManager = laymanager
        rv_datamahasiswa.adapter = adapt
    }
}