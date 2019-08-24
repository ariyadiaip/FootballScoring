package id.smkn4.smkcoding.footballscoring

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonOperator.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        buttonUser.setOnClickListener {
            startActivity(Intent(this, UserMatchActivity::class.java))
        }

    }
}
