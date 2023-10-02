package com.calculadora.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.calculadora.calculadora.R.id.expressao
import com.calculadora.calculadora.R.id.resultado

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

    }

    fun AcrescentarUmaExpressao(string:String,limpar_dados:Boolean){
        if (resultado.TextView){
            expressao.text = ""
        }
    }


}