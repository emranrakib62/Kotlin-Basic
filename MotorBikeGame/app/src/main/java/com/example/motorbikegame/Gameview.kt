package com.example.motorbikegame



import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.SurfaceHolder
import android.view.SurfaceView

class GameView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : SurfaceView(context, attrs), Runnable {

    private var gameThread: Thread? = null
    private var isPlaying = false
    private var surfaceHolder: SurfaceHolder = holder
    private var paint: Paint = Paint()
    private var motorbike: Motorbike
    private var obstacle: Obstacle

    init {
        motorbike = Motorbike(context, 100, 1600) // Initial position of motorbike
        obstacle = Obstacle(context, 1000, 300) // Initial position of obstacle
    }

    override fun run() {
        while (isPlaying) {
            update()
            draw()
            control()
        }
    }

    private fun update() {
        motorbike.update()
        obstacle.update()

        // Check for collision
        if (Rect.intersects(motorbike.getCollisionShape(), obstacle.getCollisionShape())) {
            isPlaying = false // End the game if collision occurs
        }
    }

    private fun draw() {
        if (surfaceHolder.surface.isValid) {
            val canvas = surfaceHolder.lockCanvas()
            canvas.drawColor(Color.WHITE) // Clear the canvas

            // Draw motorbike and obstacle
            motorbike.draw(canvas, paint)
            obstacle.draw(canvas, paint)

            surfaceHolder.unlockCanvasAndPost(canvas)
        }
    }

    private fun control() {
        try {
            Thread.sleep(17) // Control frame rate (about 60fps)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    fun resume() {
        isPlaying = true
        gameThread = Thread(this)
        gameThread?.start()
    }

    fun pause() {
        try {
            isPlaying = false
            gameThread?.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    fun getMotorbike(): Motorbike {
        return motorbike
    }
}
