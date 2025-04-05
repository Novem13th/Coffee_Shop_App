package sample.application;

import java.util.Random;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FinalApplication.class.getResource("customername.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 860, 300);
        stage.setTitle("CUSTOMERNAME");
        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[] args) throws IOException {
        launch();
    }
}