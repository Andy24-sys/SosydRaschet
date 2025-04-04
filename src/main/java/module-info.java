module org.example.sosydraschet {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.sosydraschet to javafx.fxml;
    exports org.example.sosydraschet;
}