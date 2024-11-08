module org.example.fuelconsumptioncalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fuelconsumptioncalculator to javafx.fxml;
    exports org.example.fuelconsumptioncalculator;
}