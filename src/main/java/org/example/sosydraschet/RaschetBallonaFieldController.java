package org.example.sosydraschet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RaschetBallonaFieldController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRaschet;

    @FXML
    private TextField dNar;

    @FXML
    private TextField pPab;

    @FXML
    private AnchorPane raschetSp;

    @FXML
    private TextField sRasch;

    @FXML
    void resSrasch() {

        double num=Double.parseDouble(dNar.getText())*Double.parseDouble(pPab.getText());

        sRasch.setText("Sp= "+num);


    }

    @FXML
    void initialize() {
        assert btnRaschet != null : "fx:id=\"btnRaschet\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert dNar != null : "fx:id=\"dNar\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pPab != null : "fx:id=\"pPab\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert raschetSp != null : "fx:id=\"raschetSp\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert sRasch != null : "fx:id=\"sRasch\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}

