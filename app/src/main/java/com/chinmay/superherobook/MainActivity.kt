package com.chinmay.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var heroNames = ArrayList<String>()
        heroNames.add("Superman")
        heroNames.add("Batman")
        heroNames.add("Wonder Woman")
        heroNames.add("Flash")
        heroNames.add("Green Lantern")
        heroNames.add("Birdman")
        heroNames.add("Martian Manhunter")
        heroNames.add("Cyborg")
        heroNames.add("Aquaman")



        val superman = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val batman = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val wonderWoman = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.wonder_woman)
        val flash = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.flash)
        val greenLantern = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.green_lantern)
        val birdman = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.birdman)
        val martian = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.martian)
        val cyborg = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.cyborg)
        val aquaman = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)

        var heroImages = ArrayList<Bitmap>()
        heroImages.add(superman)
        heroImages.add(batman)
        heroImages.add(wonderWoman)
        heroImages.add(flash)
        heroImages.add(greenLantern)
        heroImages.add(birdman)
        heroImages.add(martian)
        heroImages.add(cyborg)
        heroImages.add(aquaman)


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,heroNames)

        simple_list_view.adapter = adapter

        simple_list_view.onItemClickListener = AdapterView.OnItemClickListener { parent, view, i, l ->
            val intent = Intent(applicationContext,DetailActivity::class.java)

            intent.putExtra("name",heroNames[i])

            val bitmap = heroImages[i]
            val chosen = Singleton.Chosen
            chosen.selectedImage = bitmap

            startActivity(intent)
        }



    }
}
