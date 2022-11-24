package com.ilyaskeskin.recycelerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Kahramanlari array liste ekliyoruz.
        var superKahramanIsimleri = ArrayList<String> ()
        superKahramanIsimleri.add ("Batman")
        superKahramanIsimleri.add ("Superman")
        superKahramanIsimleri.add ("Ironman")
        superKahramanIsimleri.add ("Aquman")
        superKahramanIsimleri.add ("Spiderman")


        /* //VERIMSIZ YONTEM

        //Gorsellerimizi drawable dan alip bitmap haline donusturuyoruz.

        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aqumanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        //Gorselleri arrayliste aliyoruz.

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add (batmanBitmap)
        superKahramanGorselleri.add (supermanBitmap)
        superKahramanGorselleri.add (ironmanBitmap)
        superKahramanGorselleri.add (aqumanBitmap)
        superKahramanGorselleri.add (spidermanBitmap)

        */

        //VERİMLİ TANIMLAMALAR

        //Batman görselinin Int tipinde bir sayısı vardır. Burda int olarak listeleyip.
        //int olarak veriyi rahatça intent edebileceğiz . Bu şekilde intenti kullanma olanağımız olacak.
        //Çünkü büyük görselleri intent olarak gönderemiyoruz.

        val batmanDrawableID = R.drawable.batman
        val supermanDrawableID = R.drawable.superman
        val ironmanDrawableID = R.drawable.ironman
        val aqumanDrawableID = R.drawable.aquman
        val spidermanDrawableID = R.drawable.spiderman

        var superKahramanDrawableListesi = ArrayList <Int> ()

        superKahramanDrawableListesi.add(batmanDrawableID)
        superKahramanDrawableListesi.add(supermanDrawableID)
        superKahramanDrawableListesi.add(ironmanDrawableID)
        superKahramanDrawableListesi.add(aqumanDrawableID)
        superKahramanDrawableListesi.add(spidermanDrawableID)


        //Adapter
        val layoutManager = LinearLayoutManager (this)
        recyclerView2.layoutManager = layoutManager

        //Recycler Adapter ile haberleştirmek için. kahramListesi değişkenine adapte edildi.
        val adapter = RecyclerAdapter(superKahramanIsimleri,superKahramanDrawableListesi)
        recyclerView2.adapter = adapter

    }





}