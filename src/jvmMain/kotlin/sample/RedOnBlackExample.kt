package sample

import display.DisplayPanel
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.WindowConstants

fun main() {
    val frame = JFrame()
    val panel = DisplayPanel(redOnBlack(1024.0, 768.0))

    panel.preferredSize = Dimension(1024, 768)

    frame.contentPane.add(panel, BorderLayout.CENTER)
    frame.pack()
    frame.size = Dimension(1024 + 6, 768 + 29)
    frame.validate()
    frame.isVisible = true
    frame.isResizable = false
    frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
}