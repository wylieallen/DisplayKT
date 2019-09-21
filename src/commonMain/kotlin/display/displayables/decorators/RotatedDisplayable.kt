package display.displayables.decorators

import display.Painter
import display.displayables.AbstractDisplayable
import display.displayables.Displayable

class RotatedDisplayable(var theta: Double, var child: Displayable = Displayable.NULL) : AbstractDisplayable() {
    override fun doDisplay(painter: Painter) {
        painter.rotate(theta)
        child.display(painter)
    }
}