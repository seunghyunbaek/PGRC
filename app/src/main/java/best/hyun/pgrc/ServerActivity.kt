package best.hyun.pgrc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_server.*

class ServerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_server)

        btn_ee_server.setOnClickListener { startActivity(Intent(applicationContext, MainActivity::class.java))}
    }
}
