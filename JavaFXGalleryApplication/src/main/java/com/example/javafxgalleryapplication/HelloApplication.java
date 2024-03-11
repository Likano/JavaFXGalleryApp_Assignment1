package com.example.javafxgalleryapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Grid layout for gallery
        GridPane gpane = new GridPane();
        gpane.setHgap(5);
        gpane.setVgap(10);

        // image paths
        FileInputStream imagePath = new FileInputStream("src/main/resources/com/example/javafxgalleryapplication/bike1.jpeg");

        // loading multiple images
        Image image1 = new Image(imagePath);
        Image image2 = new Image(new FileInputStream("src/main/resources/com/example/javafxgalleryapplication/bike2.jpeg"));
        Image image3 = new Image(new FileInputStream("src/main/resources/com/example/javafxgalleryapplication/car1.jpeg"));
        Image image4 = new Image(new FileInputStream("src/main/resources/com/example/javafxgalleryapplication/car2.jpeg"));
        Image image5 = new Image(new FileInputStream("src/main/resources/com/example/javafxgalleryapplication/drone.jpg"));
        Image image6 = new Image(new FileInputStream("src/main/resources/com/example/javafxgalleryapplication/drone2.jpeg"));

        // creating image view
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);
        ImageView imageView5 = new ImageView(image5);
        ImageView imageView6 = new ImageView(image6);

        // setting image view properties
        imageView1.setX(10);
        imageView1.setY(10);
        imageView1.setFitWidth(150);
        imageView1.setFitHeight(150);
        imageView1.setPreserveRatio(true);

        imageView2.setX(10);
        imageView2.setY(10);
        imageView2.setFitWidth(150);
        imageView2.setFitHeight(150);
        imageView2.setPreserveRatio(true);

        imageView3.setX(10);
        imageView3.setY(10);
        imageView3.setFitWidth(150);
        imageView3.setFitHeight(150);
        imageView3.setPreserveRatio(true);

        imageView4.setX(10);
        imageView4.setY(10);
        imageView4.setFitWidth(150);
        imageView4.setFitHeight(150);
        imageView4.setPreserveRatio(true);

        imageView5.setX(10);
        imageView5.setY(10);
        imageView5.setFitWidth(150);
        imageView5.setFitHeight(150);
        imageView5.setPreserveRatio(true);

        imageView6.setX(10);
        imageView6.setY(10);
        imageView6.setFitWidth(150);
        imageView6.setFitHeight(150);
        imageView6.setPreserveRatio(true);

        // Properties of a GridPane
        gpane.alignmentProperty();
        gpane.addRow(0,imageView1,imageView2,imageView3);
        gpane.addRow(1,imageView4,imageView5,imageView6);

        // to make image view respond to mouseclick
        imageView1.setPickOnBounds(true);

        // creating pane
        Pane pane = new Pane();
        Button back = new Button("Back");

        // creating a scene & passing layout as an argument
        Scene scene = new Scene(gpane,500,400);
        stage.setTitle("Gallery!");
        stage.setScene(scene);
        stage.show();
        
        imageView1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(mouseEvent.getSource() == imageView1){
                    imageView1.setId("imagesize");
                    pane.getChildren().addAll(imageView1);
                    back.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            stage.show();
                        }
                    });

                }

            }
        });



    }

    public static void main(String[] args) {
        launch();
    }
}