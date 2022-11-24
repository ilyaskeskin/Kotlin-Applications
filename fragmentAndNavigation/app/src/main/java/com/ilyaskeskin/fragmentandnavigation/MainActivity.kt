package com.ilyaskeskin.fragmentandnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //add komutuyla eklediğimiz zaman fragmentlar üst üste gelir.
    //replace yaparak üst üste gelmesini engelliyoruz.Yerine diğerini almasını sağlıyoruz.
    fun firstFrag (view: View) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()
        /*fragmentTransaction.add (R.id.frameLayout,firstFragment).commit()*/
    }

    fun secondFrag (view: View) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()
        /*fragmentTransaction.add (R.id.frameLayout,secondFragment).commit()*/



    }

}