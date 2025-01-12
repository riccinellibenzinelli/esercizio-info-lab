module com.example.esercizioinfolab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.esercizioinfolab to javafx.fxml;
    exports com.example.esercizioinfolab;
}