package best.hyun.pgrc

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.google.android.gms.ads.AdView

class App : Application() {

    companion object {
        private lateinit var nameGetter: Context

        fun getString(code:Int): String {
            return nameGetter.getString(code)
        }
    }

    override fun onCreate() {
        super.onCreate()
        nameGetter = applicationContext
    }
}