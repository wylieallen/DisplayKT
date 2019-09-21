package display.displayables

import display.Painter

interface Displayable {
    fun display(painter: Painter)

    companion object {
        val NULL : Displayable = NullDisplayable()
    }
}

private class NullDisplayable : Displayable {
    override fun display(painter: Painter) {}
}