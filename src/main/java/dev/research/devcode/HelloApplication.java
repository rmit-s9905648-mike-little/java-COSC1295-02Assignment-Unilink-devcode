package dev.research.devcode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        // this load the "hello-view.fxml" using the path from source root "dev.research.devcode.view" in the "resources" package
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/dev/research/devcode/view/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}