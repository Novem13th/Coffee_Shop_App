module sample.application {
    requires javafx.controls;
    requires javafx.fxml;

    //requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens sample.application to javafx.fxml;
    exports sample.application;
}