package components;

import algo.Ceasar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEntcrypt extends JButton {

    public ButtonEntcrypt(String text){
        setText(text);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setBorder(null);
        addActionListener(new ButtonListener());
        setVisible(true);
    }

    private static class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            GuiFrame.tf1.setText(Ceasar.decode(GuiFrame.tf2.getText(),2));
        }
    }


}
