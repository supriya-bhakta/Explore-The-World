package com.example.stylish_dynamic_photoframe

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var  currentImage=0
    var place= arrayOf("Kutch","Delhi","Aagra","Vrundavan","Banaras","Maldives")
    lateinit var  image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val prev= findViewById<ImageButton>(R.id.imgPrev)
        val next= findViewById<ImageButton>(R.id.imgNext)
         val names= findViewById<TextView>(R.id.textView)
        prev.setOnClickListener {

            val idCurrentImageString="img$currentImage"// by defaut into string
            val idCurrentImageInt= this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            //converted into the int
            image=findViewById(idCurrentImageInt) // passed that current id int
            image.alpha=0f
            // yaha stop karete he


            currentImage=(6+currentImage-1)%6
            val idImageToShowString="img$currentImage"
            val idImageToShowInt= this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f

            names.text=place[currentImage] // here names is textview  and place is array and insede it current value

            // yaha view karvate  he

        }
        next.setOnClickListener {

            val idCurrentImageString="img$currentImage"// by defaut into string
            val idCurrentImageInt= this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            //converted into the int
            image=findViewById(idCurrentImageInt) // passed that current id int
            image.alpha=0f

            currentImage=(6+currentImage+1)%6
            val idImageToShowString="img$currentImage"
            val idImageToShowInt= this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            names.text=place[currentImage]

        }

    }
}