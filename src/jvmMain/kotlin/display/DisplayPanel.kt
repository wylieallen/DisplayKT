package display

import display.displayables.Displayable
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JPanel

class DisplayPanel(var root: Displayable = Displayable.NULL) : JPanel() {
    override fun paintComponent(g: Graphics?) {
        super.paintComponent(g)
        root.display(Painter(g as Graphics2D))
    }
}