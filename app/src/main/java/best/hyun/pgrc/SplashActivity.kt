package best.hyun.pgrc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            Intent(applicationContext, ServerActivity::class.java).let{ startActivity(it) }
            finish()
        }, SPLASH_SHORT)
    }
}
