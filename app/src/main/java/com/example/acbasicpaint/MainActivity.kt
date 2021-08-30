package com.example.acbasicpaint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.acbasicpaint.PaintView.Companion.colorList
import com.example.acbasicpaint.PaintView.Companion.currentBrush
import com.example.acbasicpaint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {

        var path = Path()
        var paintBrush = Paint()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.idIBRed)
        val greenBtn = findViewById<ImageButton>(R.id.idIBGreen)
        val darkBlueBtn = findViewById<ImageButton>(R.id.idIBDarkBlue)
        val blackBtn = findViewById<ImageButton>(R.id.idIBBlack)
        val whiteBtn = findViewById<ImageButton>(R.id.idIBWhite)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Selected: Red",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        greenBtn.setOnClickListener {
            Toast.makeText(this,"Selected: Green",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        darkBlueBtn.setOnClickListener {
            Toast.makeText(this,"Selected: Red",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blackBtn.setOnClickListener {
            Toast.makeText(this,"Selected: DarkBlue",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        whiteBtn.setOnClickListener {
            Toast.makeText(this,"Selected: Eraser",Toast.LENGTH_LONG).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }


    }

    private fun currentColor(color : Int) {
        currentBrush = color
        path = Path()
    }

}