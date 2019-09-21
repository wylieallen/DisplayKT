package display

expect class Painter {
    fun push()
    fun pop()

    fun translate(x: Double, y: Double)
    fun rotate(theta: Double)

    fun fillRect(width: Double, height: Double)

    var color: Color
}