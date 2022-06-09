module calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;


    exports calculadora.controles;
    opens calculadora.controles to javafx.fxml;
    exports calculadora.main;
    opens calculadora.main to javafx.fxml;
    exports calculadora.display;
    opens calculadora.display to javafx.fxml;
}