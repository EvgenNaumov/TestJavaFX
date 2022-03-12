package sample.SettingUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class SettingWindow {

    public SettingWindow()  {

        try{
            StartWindow();}
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void StartWindow() throws IOException {
//
        try {


        Parent root = FXMLLoader.load(getClass().getResource("sample_login.fxml"));

        Stage stage = new Stage();

        stage.setTitle("Авторизация");
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }
        catch (Exception e){
        e.printStackTrace();
    }


    }


}
