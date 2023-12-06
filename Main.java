package com.example.tresenlinea;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Cargar el archivo CSS
        String cssFile = getClass().getResource("/CSS/colores.css").toExternalForm();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Aplicar el estilo CSS a la escena
        Scene scene = new Scene(root, 700, 600);
        scene.getStylesheets().add(cssFile);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Tres en Raya");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}