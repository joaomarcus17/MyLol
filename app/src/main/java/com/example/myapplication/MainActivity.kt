package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView

import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        /*Aqui eu crio uma variável contendo o elemento que quando clicado irá realizar alguma ação (Escolha Por ID) */
        /*Dentro dos < > precisa colocar de que tipo é o elemento*/
        var botaoPerfil = findViewById<ImageView>(R.id.botao_perfil)
        var imgDaAshe = findViewById<ImageView>(R.id.imgAshe)

        /*Aqui eu defino o evento de OnClick para o elemento*/
        imgDaAshe.setOnClickListener(this)
        botaoPerfil.setOnClickListener(this)
    }

    /*Função que determina o que vai acontecer quando for clicado nos elementos escolhidos*/
   override fun onClick(view: View){

        /*Essa condição vai dizer o que vai acontecer dependendo de qual elemento está sendo clicado (Escolha Por ID) */
        if(view.id == R.id.imgAshe){
            irInfoCamp()
        }else if (view.id == R.id.botao_perfil){
            irMinhasBuilds()
        }
    }

    /*Função que vai para a próxima tela*/
    private fun irInfoCamp(){
        startActivity(Intent(this, Info_camp::class.java))
    }

    private fun irMinhasBuilds(){
        startActivity(Intent(this, Minhas_Builds::class.java))
    }

}