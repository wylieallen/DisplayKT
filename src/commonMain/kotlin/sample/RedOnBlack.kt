package sample

import display.BLACK
import display.RED
import display.displayables.Displayable
import display.displayables.composites.LinearDisplayable
import display.displayables.decorators.ColorDisplayable
import display.displayables.decorators.TranslatedDisplayable
import display.displayables.primitives.SolidRect

fun redOnBlack(width: Double, height: Double) : Displayable {
    val root = LinearDisplayable()
    root.add(ColorDisplayable(BLACK, SolidRect(width, height)))
    root.add(TranslatedDisplayable(width / 4, height / 4, ColorDisplayable(RED, SolidRect(width / 2, height / 2))))
    return root
}