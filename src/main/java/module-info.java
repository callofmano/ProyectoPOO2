module com.mycompany.proyecto2parcial {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyecto2parcial to javafx.fxml;
    exports com.mycompany.proyecto2parcial;
}
