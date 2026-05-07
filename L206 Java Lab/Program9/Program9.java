/*9. Write a Java Program to create a window when we press
➢ M or m the window displays Good Morning
➢ A or a the window displays Good After Noon
➢ E or e the window displays Good Evening
➢ N or n the window displays Good Night */

import java.awt.*;
import java.awt.event.*;

public class Program9 extends Frame implements KeyListener {
    Label lbl;

    Program9() {
        addKeyListener(this);
        requestFocus();
        lbl = new Label();
        lbl.setBounds(100, 100, 200, 40);
        lbl.setFont(new Font("Calibri", Font.BOLD, 16));
        add(lbl);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'M' || e.getKeyChar() == 'm')
            lbl.setText("Good morning");
        else if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a')
            lbl.setText("Good afternoon");
        else if (e.getKeyChar() == 'E' || e.getKeyChar() == 'e')
            lbl.setText("Good evening");
        else if (e.getKeyChar() == 'N' || e.getKeyChar() == 'n')
            lbl.setText("Good night");
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new Program9();
    }
}