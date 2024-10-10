package com.example.motorbikegame



import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class Motorbike(context: Context, var x: Int, var y: Int) {

    private var speed = 0
    private var bitmap: Bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.bike)

    fun update() {
        x += speed

        // Ensure the motorbike stays on screen
        if (x < 0) x = 0
        if (x > 1080 - bitmap.width) x = 1080 - bitmap.width // Replace 1080 with screen width
    }

    fun draw(canvas: Canvas, paint: Paint) {
        canvas.drawBitmap(bitmap, x.toFloat(), y.toFloat(), paint)
    }

    fun setSpeed(speed: Int) {
        this.speed = speed
    }

    fun getCollisionShape(): Rect {
        return Rect(x, y, x + bitmap.width, y + bitmap.height)
    }
}
