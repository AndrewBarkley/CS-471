package ulearn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    // for login
    public Button loginBtn;
    public Label unameLabel, pwdLabel;
    public TextField unameBox;
    public PasswordField pwdBox;


    // for login_popup
    public Text uNameInfo, pwdInfo, dispUName, dispPwd;
    public Button goHomeBtn;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("layout/login.fxml"));
        primaryStage.setTitle("uLearn");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
