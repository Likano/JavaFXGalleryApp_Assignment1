module com.example.javafxgalleryapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxgalleryapplication to javafx.fxml;
    exports com.example.javafxgalleryapplication;
}