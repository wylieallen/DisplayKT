package display.displayables.composites

import display.Painter
import display.displayables.AbstractDisplayable
import display.displayables.Displayable

class LinearDisplayable : AbstractDisplayable() {
    private val children = LinkedHashSet<Displayable>()

    fun add(displayable: Displayable) = children.add(displayable)
    fun remove(displayable: Displayable) = children.remove(displayable)

    override fun doDisplay(painter: Painter) = children.forEach{ it.display(painter) }
}