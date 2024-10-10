package com.example.motorbikegame

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class Obstacle(context: Context, var x: Int, var y: Int) {

    private var speed = 10
    private var bitmap: Bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.obstacle)

    fun update() {
        x -= speed

        // Reset position if the obstacle goes off-screen
        if (x < -bitmap.width) {
            x = 1080 // Replace with screen width
            y = (0..1920 - bitmap.height).random() // Randomize Y position
        }
    }

    fun draw(canvas: Canvas, paint: Paint) {
        canvas.drawBitmap(bitmap, x.toFloat(), y.toFloat(), paint)
    }

    fun getCollisionShape(): Rect {
        return Rect(x, y, x + bitmap.width, y + bitmap.height)
    }
}
