package sample.SettingUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

public class ControllerLogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login;

    @FXML
    private Button button_ok;

    @FXML
    private PasswordField password;

    @FXML
    void onActionKeyOK(ActionEvent event) {

    }

    @FXML
    void onInputTextChanged(InputMethodEvent event) {

    }

    @FXML
    void initialize() {
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Untitled'.";
        assert button_ok != null : "fx:id=\"button_ok\" was not injected: check your FXML file 'Untitled'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Untitled'.";

    }
}

