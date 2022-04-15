package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.animation.ImageMatrixProperty

class Info_camp : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_info_camp)

        supportActionBar?.hide()

        var btnVerBuild = findViewById<ImageView>(R.id.btn_ver_build)
        var btnItens = findViewById<ImageView>(R.id.quadrado_itens)

        btnVerBuild.setOnClickListener(this)
        btnItens.setOnClickListener(this)
    }

    override fun onClick(view: View){

        /*Essa condição vai dizer o que vai acontecer dependendo de qual elemento está sendo clicado (Escolha Por ID) */
        if(view.id == R.id.btn_ver_build){
            irBuild()
        }else if(view.id == R.id.quadrado_itens){
            irItens()
        }
    }

    private fun irBuild(){
        startActivity(Intent(this, Build_Camp::class.java))
    }

    private fun irItens(){
        startActivity(Intent(this, Itens::class.java))
    }
}