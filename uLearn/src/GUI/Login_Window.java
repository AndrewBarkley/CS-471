package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Window {
    private JPanel Login_Panel;
    private JButton signInButton;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JTextPane usernameLabel;
    private JTextPane passwordLabel;


    public Login_Window() {
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = "Username: " + usernameField.getText() + "\n";
                content += "Password: " + passwordField.getText(); // Can use getPassword() to improve security
                JOptionPane.showMessageDialog(null,content);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("uLearn");
        frame.setContentPane(new Login_Window().Login_Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
