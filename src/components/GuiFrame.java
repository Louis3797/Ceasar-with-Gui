package components;

import algo.Ceasar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiFrame extends JFrame {

    public static  TextField tf1 = new TextField();
    public static  TextField tf2 = new TextField();

    public GuiFrame(){
        super("Ceasar");
        setSize(500,200);
        setPreferredSize(new Dimension(500,150));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,2));
        setVisible(true);

        add(tf1);
        add(tf2);

        ButtonDecrypt decrypt = new ButtonDecrypt("Decrypt");
        add(decrypt);
        ButtonEntcrypt entcrypt = new ButtonEntcrypt("Entcrypt");
        add(entcrypt);
        pack();

    }


}
