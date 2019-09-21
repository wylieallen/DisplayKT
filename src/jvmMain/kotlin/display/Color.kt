package display

actual class Color actual constructor(actual val r: Int, actual val g: Int, actual val b: Int, actual val a: Int) {
    val implementation = java.awt.Color(r, g, b, a)
}