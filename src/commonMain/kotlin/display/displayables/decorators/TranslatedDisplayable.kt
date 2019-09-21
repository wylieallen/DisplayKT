package display.displayables.decorators

import display.Painter
import display.displayables.AbstractDisplayable
import display.displayables.Displayable

class TranslatedDisplayable(var x: Double, var y: Double, var child: Displayable = Displayable.NULL) : AbstractDisplayable() {
    override fun doDisplay(painter: Painter) {
        painter.translate(x, y)
        child.display(painter)
    }
}