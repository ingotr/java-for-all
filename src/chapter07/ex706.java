package chapter07;

import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex706 {
    public static void main(String[] args) {
        String title = "Улыбнитесь!";
        String path = "././resources/";
        ImageIcon smile = new ImageIcon( path + "smile.jpg");
        ImageIcon sad = new ImageIcon( path + "sad.jpg");

        JLabel label = new JLabel(sad);

        MouseListener handler = new MouseListener() {
            public void mouseEntered(MouseEvent event) {
                label.setIcon(smile);
            }

            public void mouseExited(MouseEvent event) {
                label.setIcon(sad);
            }

            public void mouseClicked(MouseEvent event) {}

            public void mouseReleased(MouseEvent event) {}

            public void mousePressed(MouseEvent event) {}
        };

        label.addMouseListener(handler);
        showMessageDialog(null, label, title, PLAIN_MESSAGE);
    }
}
