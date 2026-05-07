/*8. Write a Java applet program, which handles keyboard event. */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Program8.java" width=600 height=200></applet>*/

public class Program8 extends Applet implements KeyListener {
    String msg = "", key;

    public void init() {
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 150, 100);
    }

    public void keyReleased(KeyEvent ke) {
        showStatus(key + " Key Released");
    }

    public void keyPressed(KeyEvent ke) {
        int keycode = ke.getKeyCode();
        key = ke.getKeyText(keycode);
        repaint();
        showStatus(key + " Key Pressed");
    }

    public void keyTyped(KeyEvent ke) {
        char c = ke.getKeyChar();
        msg += c;
        key = String.valueOf(c);
        repaint();
    }
}