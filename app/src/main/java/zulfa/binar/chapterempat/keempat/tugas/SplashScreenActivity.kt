package zulfa.binar.chapterempat.keempat.tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import zulfa.binar.chapterempat.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, TugasSfActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}