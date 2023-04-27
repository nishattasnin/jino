module com.jino {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jino to javafx.fxml;
    exports com.jino;
}
