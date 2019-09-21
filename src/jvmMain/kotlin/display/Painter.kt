package display

import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.util.*

actual class Painter(private var g2d: Graphics2D) {
    private val stack = Stack<Graphics2D>()

    actual fun push() {
        stack.push(g2d)
        g2d = g2d.create() as Graphics2D
    }

    actual fun pop() {
        g2d = stack.pop()
    }

    actual fun translate(x: Double, y: Double) = g2d.translate(x, y)
    actual fun rotate(theta: Double) = g2d.rotate(theta)

    actual var color = WHITE
        set(value) {
            field = value
            g2d.color = value.implementation
        }

    actual fun fillRect(width: Double, height: Double) = g2d.fillRect(0, 0, width.toInt(), height.toInt())

    fun drawImage(image: BufferedImage) = g2d.drawImage(image, 0, 0, null)
}