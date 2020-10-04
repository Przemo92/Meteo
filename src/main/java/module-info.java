module application {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    requires java.net.http;
    requires org.json;


    opens application.controller;
    opens application.view;
    opens application.model;
    opens application;
}