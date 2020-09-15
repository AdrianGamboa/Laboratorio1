module org.una.tramitesmunicipales {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.una.tramitesmunicipales to javafx.fxml;
    exports org.una.tramitesmunicipales;
}