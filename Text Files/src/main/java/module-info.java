module com.text_files {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.text_files to javafx.fxml;
    exports com.text_files;
}