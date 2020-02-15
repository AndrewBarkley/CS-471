package ulearn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class Controller {
    // for login
    public Button loginBtn = new Button();
    public Label unameLabel = new Label(), pwdLabel = new Label();
    public TextField unameBox = new TextField();
    public PasswordField pwdBox = new PasswordField();


    // for login_popup
    public Text uNameInfo = new Text(), pwdInfo = new Text(), dispUName = new Text(), dispPwd = new Text();
    public Button goHomeBtn = new Button();


    @FXML
    private void loginBtnAction(ActionEvent event) throws IOException {
        event.consume();
        Parent root = FXMLLoader.load(getClass().getResource("login_popup.fxml"));
        Stage stage = (Stage) loginBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 300, 140));
        stage.show();
    }

    @FXML
    private void mainScreen(ActionEvent event) throws IOException {
        event.consume();
        Parent root = FXMLLoader.load(getClass().getResource("main_screen.fxml"));
        Stage stage = (Stage) goHomeBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 300, 140));
        stage.show();
    }

}
