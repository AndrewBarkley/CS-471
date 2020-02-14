import GUI.GUI;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

import javax.swing.*;
import javax.swing.text.html.CSS;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;

import static javax.swing.text.html.CSS.Attribute.BACKGROUND_COLOR;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("uLearn");
        frame.setContentPane(new GUI().Master_Window);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.cyan);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(true);


    }


}
