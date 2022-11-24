package com.ilyaskeskin.sharedprefences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    //Değeri sonradan vermek için lateinit kullanıyoruz. Fonksiyon içierisinde de çağrıyoruz//


    var alinanKullaniciAdi: String ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SharedPreferences

        //Yanlışlar yaşanmasın diye paket ismini veriyoruz.//
        sharedPreferences = this.getSharedPreferences("com.ilyaskeskin.sharedprefences",
            Context.MODE_PRIVATE)

        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "") // Bu komut ile hafızadan çağrıyoruz. kullanici anahtar kelime.

        if (alinanKullaniciAdi != null){
            textView.text = "Kaydedilen Kullanıcı Adı: ${alinanKullaniciAdi}"
        }
    }

    fun kaydet (view: View){

            val kullaniciAdi = editText.text.toString()
            if (kullaniciAdi == ""){
                Toast.makeText(this,"Lütfen Bir Değer Giriniz!",Toast.LENGTH_LONG).show()

            }else {
                sharedPreferences.edit().putString("kullanici",kullaniciAdi).apply() //Bu komut ile hafızaya alıyoruz.
                textView.text = "Kaydedilen Kullanıcı Adı: ${kullaniciAdi}"
            }


    }
    fun sil (view: View){
        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "")

        if (alinanKullaniciAdi != null) {
            textView.text = "Kaydedilen Kullanıcı Adı: "
            sharedPreferences.edit().remove("kullanici").apply()

        }


    }


}