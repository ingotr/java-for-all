package chapter06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.*;

public class ex613 {
    public static void main(String[] args) {
        String msg = "Текст синего цвета";
        String txt = "Текст красного цвета";
        JLabel label = new JLabel(msg);

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.blue);
        Font F = new Font("Arial", Font.ITALIC, 18);
        label.setFont(F);
        label.setBorder(BorderFactory.createEtchedBorder());

        MouseAdapter handler = new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                label.setText(txt);
                label.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent event) {
                label.setText(msg);
                label.setForeground(Color.blue);
            }
        };

        label.addMouseListener(handler);
        showMessageDialog(null,
                label,
                "Сообщение",
                PLAIN_MESSAGE);
    }
}
