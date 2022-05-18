package com.example.aula14

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private val TAG = "aula14debug"
    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG, "visão criada")
        setContentView(R.layout.activity_main)

        val btlogin = findViewById<Button>(R.id.buttonLogin)

        //Tratar eventos
        btlogin.setOnClickListener{
            var inputLogin = findViewById<EditText>(R.id.inputLogin)
            var inputPassword = findViewById<EditText>(R.id.inputPassword)

            val login = inputLogin.text.toString()
            val password = inputPassword.text.toString()

            if (login == "devmobile" && password == "123456") {
                val intent = Intent(context, BemVindoActivity::class.java)
                val params = Bundle()
                params.putString("nome", "DevMobile")
                intent.putExtras(params)
                startActivity(intent)
            }else {
                toast("Invalid login or password!!")
            }
        }
    }

    private fun toast(mensagem: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, mensagem, length).show()
    }
}