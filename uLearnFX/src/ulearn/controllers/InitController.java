package ulearn.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class InitController {
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
        Parent root = FXMLLoader.load(getClass().getResource("../layout/login_popup.fxml"));
        Stage stage = (Stage) loginBtn.getScene().getWindow();
        stage.setScene(new Scene(root, 300, 140));
        stage.setResizable(false);
        stage.show();
        resize(stage);
    }

    @FXML
    private void mainScreen(ActionEvent event) throws IOException {
        event.consume();
        Parent root = FXMLLoader.load(getClass().getResource("../layout/main_screen.fxml"));
        Stage stage = (Stage) goHomeBtn.getScene().getWindow();
        Scene scene = new Scene(root, 600, 350);
        scene.setFill(null);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
        resize(stage);
    }

    void resize(Stage stage) {
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 4);
    }


}
