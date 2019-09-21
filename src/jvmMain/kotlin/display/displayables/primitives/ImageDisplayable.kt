package display.displayables.primitives

import display.Painter
import display.displayables.AbstractDisplayable
import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO

actual class ImageDisplayable actual constructor(path: String) : AbstractDisplayable() {
    private val image = loadImage(path)

    override fun doDisplay(painter: Painter) { painter.drawImage(image) }
}

private fun loadImage(path: String) : BufferedImage {
    return try {
        ImageIO.read(File(path))
    } catch (e: IOException) {
        e.printStackTrace()
        BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB)
    }
}