module sample.jar_test_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.jar_test_application to javafx.fxml;
    exports sample.jar_test_application;
}