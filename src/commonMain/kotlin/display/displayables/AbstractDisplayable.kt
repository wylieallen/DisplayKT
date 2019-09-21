package display.displayables

import display.Painter

abstract class AbstractDisplayable : Displayable {
    override fun display(painter: Painter) {
        painter.push()
        doDisplay(painter)
        painter.pop()
    }

    protected abstract fun doDisplay(painter: Painter)
}