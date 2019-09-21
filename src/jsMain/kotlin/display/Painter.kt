package display

import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLImageElement

actual class Painter(private val ctx: CanvasRenderingContext2D) {
    actual fun push() = ctx.save()
    actual fun pop() = ctx.restore()

    actual fun translate(x: Double, y: Double) = ctx.translate(x, y)
    actual fun rotate(theta: Double) = ctx.rotate(theta)

    actual fun fillRect(width: Double, height: Double) = ctx.fillRect(0.0, 0.0, width, height)

    actual var color = WHITE
        set(value) {
            field = value
            ctx.fillStyle = color.implementation
            ctx.strokeStyle = color.implementation
        }

    fun drawImage(image: HTMLImageElement) = ctx.drawImage(image, 0.0, 0.0)
}