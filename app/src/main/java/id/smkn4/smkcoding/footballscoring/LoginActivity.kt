package id.smkn4.smkcoding.footballscoring

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        buttonLogin.setOnClickListener {
            startActivity(Intent(this, MainOperatorActivity::class.java))
            //validate()
        }
    }

    fun validate() {
        if (edtUsername.text.equals("admin") && edtPassword.text.equals("admin")) {
            startActivity(Intent(this, MainOperatorActivity::class.java))
        } else {
            Toast.makeText(applicationContext,"Login Failed", Toast.LENGTH_SHORT).show()
        }
    }
}
