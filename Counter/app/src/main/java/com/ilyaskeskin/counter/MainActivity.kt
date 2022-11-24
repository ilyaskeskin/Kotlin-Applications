package com.ilyaskeskin.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Abstract Class

        //15 den geriye doğru saniye de bir// sadece 2 yazmış olsak 2şer 2şer sayacaktır//
        //Milisaniye cinsinden olduğundan 1000 ile çarpıcaz//

        object : CountDownTimer (15000,1000) {

           //Saniye de bir çalıştırılacak fonk.
            override fun onTick(p0: Long) {
               textView.text = "Kalan: ${p0 / 1000}"
            }

            //Sayaç bitince çalıştırılacak fonk.
            override fun onFinish() {
                textView.text = "Kalan: 0"
    }


        }.start() //yazmazsak sayaç başlamaz
    }
}