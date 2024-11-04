module com.example.decafe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;


    opens com.example.decafe to javafx.fxml;
    exports com.example.decafe;
    exports com.example.decafe.gameObjects;
    opens com.example.decafe.gameObjects to javafx.fxml;
    exports com.example.decafe.gameLogic;
    opens com.example.decafe.gameLogic to javafx.fxml;
    exports com.example.decafe.utils;
    opens com.example.decafe.utils to javafx.fxml;
}