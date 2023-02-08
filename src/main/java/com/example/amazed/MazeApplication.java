package com.example.amazed;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MazeApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MazeApplication.class.getResource("/com.example.amazed/maze-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 440);

        primaryStage.setScene(scene);
        primaryStage.setTitle("aMazed");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
