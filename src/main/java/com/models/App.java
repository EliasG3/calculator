package com.models;

import java.net.URL;

import com.controllers.MainViewController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{

    private ThreeInARow threeInARow;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.threeInARow = new ThreeInARow();
        URL url = getClass().getResource("/fxml/MainView.fxml");
        FXMLLoader loader = new FXMLLoader(url);
        Scene scene = new Scene(loader.load());

        MainViewController controller = loader.getController();
        controller.setMainViewController(threeInARow);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

}