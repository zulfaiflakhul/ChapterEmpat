package zulfa.binar.chapterempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import zulfa.binar.chapterempat.challenge.satu.FirstChallenge
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
    }
}