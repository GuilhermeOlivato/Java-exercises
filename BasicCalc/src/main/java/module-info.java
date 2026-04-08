module com.basiccalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.basiccalc to javafx.fxml;
    exports com.basiccalc;
    requires transitive javafx.graphics;
}