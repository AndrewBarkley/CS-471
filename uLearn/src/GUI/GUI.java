package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public JPanel Master_Window;
    public JPanel Login_Frame;
    private JTextPane passwordLabel;
    private JTextPane usernameLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInButton;

    public JPanel Main_Frame;
    private JTabbedPane tabMenu;
    private JEditorPane thisIsTheHomeEditorPane;



    public GUI() {
        Master_Window.removeAll();
        Master_Window.repaint();
        Master_Window.revalidate();

        Master_Window.add(Login_Frame);
        Master_Window.repaint();
        Master_Window.revalidate();


        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Will eventually use getPassword() to improve security
                Boolean certified = verifyUser(usernameField.getText(),passwordField.getText());
                if (certified) {
                    changePanel(Main_Frame);
                }
            }
        });
    }

    public void changePanel(JPanel child) {
        Master_Window.removeAll();
        Master_Window.repaint();
        Master_Window.revalidate();

        Master_Window.add(child);
        Master_Window.repaint();
        Master_Window.revalidate();
    }

    public Boolean verifyUser(String username, String password) {
        // Certification will be a part of the backed to ensure that the user has an account.
        String content = "Username: " + username + "\n";
        content += "Password: " + password;
        JOptionPane.showMessageDialog(null,content);
        return true;
    }
}
