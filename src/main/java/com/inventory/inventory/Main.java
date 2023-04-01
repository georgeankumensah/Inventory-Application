package com.inventory.inventory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Inventory");
        StackPane layout = new StackPane();

        Scene mainWindow = new Scene(layout ,1300,700);
        button = new Button();
        button.setText("button");
        layout.getChildren().add(button);


        primaryStage.setScene(mainWindow);
        primaryStage.show();




    }
}