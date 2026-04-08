module com.division {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.division to javafx.fxml;
    exports com.division;
    requires transitive javafx.graphics;
}