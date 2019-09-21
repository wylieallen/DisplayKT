package display.displayables.decorators

import display.Color
import display.Painter
import display.displayables.AbstractDisplayable
import display.displayables.Displayable

class ColorDisplayable(var color: Color, var child: Displayable = Displayable.NULL) : AbstractDisplayable() {
    override fun doDisplay(painter: Painter) {
        painter.color = color
        child.display(painter)
    }
}