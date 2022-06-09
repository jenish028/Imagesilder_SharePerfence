package com.example.imagesilder_shareperfence

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.imagesilder_shareperfence.Utills.Shr
import com.example.imagesilder_shareperfence.databinding.ActivityMainBinding
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    lateinit var blinding: ActivityMainBinding

    var list = arrayListOf<CarouselItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        blinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(blinding.root)

        var shr=Shr(this)


        imageSlider()
        shr.getSHR()
        blinding.saveBtn.setOnClickListener {
            shr.creratSHR(blinding.emailEdt.text.toString(), blinding.passwordEdt.text.toString())

        }

    }

    fun imageSlider() {

        list.add(
            CarouselItem(
                imageUrl = "https://imgv3.fotor.com/images/homepage-feature-card/Fotor-AI-photo-enhancement-tool.jpg",
                caption = "Photo Girls"
            )

        )
        list.add(
            CarouselItem(
                imageUrl = "https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg",
                caption = "edit text"
            )
        )
        blinding.carousel.setData(list)
    }


}