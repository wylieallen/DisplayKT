package display.displayables.primitives

import display.Painter
import display.displayables.AbstractDisplayable
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.Image

actual class ImageDisplayable actual constructor(path: String) : AbstractDisplayable() {
    private val image = loadImage(path)

    override fun doDisplay(painter: Painter) {
        painter.drawImage(image)
    }
}

private fun loadImage(path: String) : HTMLImageElement {
    val image = Image()
    image.src = path
    return image
}