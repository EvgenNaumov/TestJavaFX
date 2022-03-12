package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.SettingUI.SettingWindow;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tab1"
    private Tab tab1; // Value injected by FXMLLoader

    @FXML // fx:id="button1"
    private Button button1; // Value injected by FXMLLoader

    @FXML // fx:id="button2"
    private Button button2; // Value injected by FXMLLoader

    @FXML // fx:id="button3"
    private Button button3; // Value injected by FXMLLoader

    @FXML // fx:id="button4"
    private Button button4; // Value injected by FXMLLoader

    @FXML // fx:id="text_say"
    private TextField text_say; // Value injected by FXMLLoader

    @FXML // fx:id="tab2"
    private Tab tab2; // Value injected by FXMLLoader

    @FXML
    void onActionButtonBy(ActionEvent event) {
        text_say.setText("До новых встреч");
    }

    @FXML
    void onActionButtonHello(ActionEvent event) {


    }

    @FXML
    void onActionButtonHome(ActionEvent event) {

    }

    @FXML
    void onActionButtonHowDo(ActionEvent event)   {

        SettingWindow settingWindow = new SettingWindow();

    }

    @FXML
    void onSelectChanged2(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tab1 != null : "fx:id=\"tab1\" was not injected: check your FXML file 'Untitled'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'Untitled'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'Untitled'.";
        assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'Untitled'.";
        assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'Untitled'.";
        assert text_say != null : "fx:id=\"text_say\" was not injected: check your FXML file 'Untitled'.";
        assert tab2 != null : "fx:id=\"tab2\" was not injected: check your FXML file 'Untitled'.";

    }
}
