package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("My test App");
        primaryStage.setScene(new Scene(root, 300, 275));
        runStage(primaryStage);
//        primaryStage.show();
    }

    public static void runStage(Stage stage) throws IOException{
        primaryStage = stage;
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
