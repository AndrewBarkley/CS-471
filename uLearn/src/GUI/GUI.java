package GUI;


import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.*;

public class GUI {
    public JPanel Master_Window;
    public JPanel Login_Panel;
    private JTextPane passwordLabel;
    private JTextPane unameLabel;
    private JTextField unameTextBox;
    private JPasswordField passwordField;
    private JButton signInButton;

    public JPanel Main_Panel;
    private JTabbedPane tabMenu;
    private JEditorPane welcomeBackYourClassesEditorPane;
    private JPanel homeTab;
    private JPanel chatTab;
    private JPanel calenderTab;
    private JPanel storageTab;
    private JPanel settingsTab;
    private JTextPane userSettingsTextPane;
    private JTabbedPane classTab;
    private JScrollPane classOne;
    private JScrollPane classTwo;
    private JScrollPane classThree;
    private JScrollPane classFour;
    private JScrollPane userTypeTab;
    private JList list1;


    public GUI() {
        Master_Window.removeAll();
        Master_Window.repaint();
        Master_Window.revalidate();

        Master_Window.add(Login_Panel);
        Master_Window.repaint();
        Master_Window.revalidate();
        Master_Window.setFont(new Font("Droid Sans", PLAIN, 20));

        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Will eventually use getPassword() to improve security
                Boolean certified = verifyUser(unameTextBox.getText(), passwordField.getText());
                if (certified) {
                    changePanel(Main_Panel);
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
        Master_Window.setFont(new Font("Droid Sans", PLAIN, 20));
        Master_Window.revalidate();
    }

    public Boolean verifyUser(String username, String password) {
        // Method to check validity of username and Password
        // Actual certification will be a part of the backend. For now it assumes true.
        String content = "Username: " + username + "\n";
        content += "Password: " + password;
        JOptionPane.showMessageDialog(null, content);
        return true;
    }

    private void createUIComponents() {

    }

}
