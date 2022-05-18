package com.example.aula14

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class BemVindoActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Visões
        setContentView(R.layout.activity_bem_vindo)
        val textView = findViewById<TextView>(R.id.textBoasVindas)
        //Args
        val args = intent.extras
        val nome = args?.getString("nome")
        textView.text = "$nome, welcome!!"
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item?.itemId == android.R.id.home){
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
