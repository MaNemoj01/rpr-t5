package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    private SimpleStringProperty broj1;
    private SimpleStringProperty broj2;
    private SimpleStringProperty operacija;

    public Controller() {
        setBroj1(new SimpleStringProperty("0"));
        setBroj1(new SimpleStringProperty(""));
        setBroj1(new SimpleStringProperty(""));
    }

    



    public SimpleStringProperty getBroj1() {
        return broj1;
    }

    public void setBroj1(SimpleStringProperty broj1) {
        this.broj1 = broj1;
    }

    public SimpleStringProperty getBroj2() {
        return broj2;
    }

    public void setBroj2(SimpleStringProperty broj2) {
        this.broj2 = broj2;
    }

    public SimpleStringProperty getOperacija() {
        return operacija;
    }

    public void setOperacija(SimpleStringProperty operacija) {
        this.operacija = operacija;
    }

    public void btnBroj1(ActionEvent actionEvent) {
    }

    public void btnBroj2(ActionEvent actionEvent) {
    }

    public void btnBroj3(ActionEvent actionEvent) {
    }

    public void btnBroj4(ActionEvent actionEvent) {
    }

    public void btnBroj7(ActionEvent actionEvent) {
    }

    public void btnBroj8(ActionEvent actionEvent) {
    }

    public void btnBroj5(ActionEvent actionEvent) {
    }

    public void btnBroj9(ActionEvent actionEvent) {
    }

    public void btnBroj6(ActionEvent actionEvent) {
    }

    public void btnOperacijaPlus(ActionEvent actionEvent) {
    }

    public void btnOperacijaPosto(ActionEvent actionEvent) {
    }

    public void btnOperacijaDijeljenje(ActionEvent actionEvent) {
    }

    public void btnOperacijaPuta(ActionEvent actionEvent) {
    }

    public void btnOperacijaMinus(ActionEvent actionEvent) {
    }

    public void btnBroj0(ActionEvent actionEvent) {
    }

    public void btnTacka(ActionEvent actionEvent) {
    }

    public void btnJednako(ActionEvent actionEvent) {
    }
}
