package display.displayables.primitives

import display.Painter
import display.displayables.AbstractDisplayable

class SolidRect(private val width: Double, private val height: Double) : AbstractDisplayable() {
    override fun doDisplay(painter: Painter) = painter.fillRect(width, height)
}