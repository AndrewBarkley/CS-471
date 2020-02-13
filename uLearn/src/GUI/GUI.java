package GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public JPanel Master_Window;
    public JPanel Login_Panel;
    private JTextPane passwordLabel;
    private JTextPane usernameLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInButton;

    public JPanel Main_Panel;
    private JTabbedPane tabMenu;
    private JPanel homeTab;
    private JPanel chatTab;
    private JPanel calenderTab;
    private JPanel storageTab;
    private JPanel settingsTab;
    private JEditorPane Notifications;
    private JPanel classesTab;
    private JTabbedPane tabbedPane1;
    private JPanel notificationPanel;
    private JEditorPane textAreaForDueEditorPane;
    private JEditorPane textAreaForClassEditorPane;


    public GUI() {
        Master_Window.removeAll();
        Master_Window.repaint();
        Master_Window.revalidate();

        Master_Window.add(Login_Panel);
        Master_Window.repaint();
        Master_Window.revalidate();


        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Will eventually use getPassword() to improve security
                Boolean certified = verifyUser(usernameField.getText(),passwordField.getText());
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
        Master_Window.revalidate();
        Master_Window.setSize(600,600);
    }

    public Boolean verifyUser(String username, String password) {
        // Method to check validity of username and Password
        // Actual certification will be a part of the backend. For now it assumes true.
        String content = "Username: " + username + "\n";
        content += "Password: " + password;
        JOptionPane.showMessageDialog(null,content);
        return true;
    }

    private void createUIComponents() {

    }
}
