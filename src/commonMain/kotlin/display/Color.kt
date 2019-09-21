package display

expect class Color(r: Int, g: Int, b: Int, a: Int = 0xFF) {
    val r: Int
    val g: Int
    val b: Int
    val a: Int
}

val BLACK = Color(0x00, 0x00, 0x00)
val WHITE = Color(0xFF, 0xFF, 0xFF)
val GRAY = Color(0x80, 0x80, 0x80)
val RED = Color(0xFF, 0x00, 0x00)
val GREEN = Color(0x00, 0xFF, 0x00)
val BLUE = Color(0x00, 0x00, 0xFF)
val YELLOW = Color(0xFF, 0xFF, 0x00)
val MAGENTA = Color(0xFF, 0x00, 0xFF)
val CYAN = Color(0x00, 0xFF, 0xFF)
val PINK = Color(0xFF, 0xC0, 0xCB)
val ORANGE = Color(0xFF, 0xA5, 0x00)