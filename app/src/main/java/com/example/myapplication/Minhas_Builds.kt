package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.myapplication.databinding.ActivityMainBinding

class Minhas_Builds : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_minhas_builds)

        supportActionBar?.hide()
        var botaoCriarBuild = findViewById<ImageView>(R.id.button_criar)

        botaoCriarBuild.setOnClickListener(this)
    }

    override fun onClick(view: View){

        /*Essa condição vai dizer o que vai acontecer dependendo de qual elemento está sendo clicado (Escolha Por ID) */
        if(view.id == R.id.button_criar){
            irCriarBuild()
        }
    }

    private fun irCriarBuild(){
        startActivity(Intent(this, Criar_Build::class.java))
    }
}