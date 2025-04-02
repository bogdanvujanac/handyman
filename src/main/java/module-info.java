module com.example.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;

    requires java.sql;
    requires mysql.connector.j;

    requires org.controlsfx.controls;
    //requires hibernate.jpa;
    requires org.hibernate.orm.core;
    requires java.persistence;

    opens com.example.jfx to javafx.fxml;
    exports com.example.jfx;
}