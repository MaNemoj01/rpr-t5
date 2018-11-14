package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;



public class Controller {
    private SimpleStringProperty broj1;
    private SimpleStringProperty broj2;
    private SimpleStringProperty operacija;


    public Controller() {
        broj1 = new SimpleStringProperty("0");
        broj2 = new SimpleStringProperty("");
        operacija = new SimpleStringProperty("=");
    }

    //brojevi
    public void btnBroj1(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set(new String(broj1.get()+"1"));
    }

    public void btnBroj2(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set(new String(broj1.get()+"2"));
    }

    public void btnBroj3(ActionEvent actionEvent) {

        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set(new String(broj1.get()+"3"));
    }

    public void btnOperacijaPlus(ActionEvent actionEvent) {
        broj2.set( broj1.get());
        broj1.set("");
        operacija.set("+");
    }

    public void btnBroj4(ActionEvent actionEvent)
    {   if(broj1.get().equals("0"))
        broj1.set("");
        broj1.set(new String(broj1.get()+"4"));
    }

    public void btnBroj5(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set(new String(broj1.get()+"5"));
    }

    public void btnBroj6(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set(new String(broj1.get()+"6"));
    }

    public void btnBroj7(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set(new String(broj1.get()+"7"));
    }

    public void btnBroj8(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set (new String(broj1.get()+"8"));
    }

    public void btnBroj9(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("");
        broj1.set(new String(broj1.get()+"9"));
    }

    public void btnBroj0(ActionEvent actionEvent) {
        if(broj1.get().equals("0"))
            broj1.set("0");
        else
            broj1.set(new String(broj1.get()+"0"));
    }

    public void btnTacka(ActionEvent actionEvent) {
        broj1.set(new String(broj1.get()+"."));
    }

    // operacije

    public void btnOperacijaPosto(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty( broj1.get());
        broj1.set("");
        operacija.set("%");
    }

    public void btnOperacijaDijeljenje(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty( broj1.get());
        broj1.set("");
        operacija.set("/");
    }

    public void btnOperacijaPuta(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty( broj1.get());
        broj1.set("");
        operacija.set("*");
    }

    public void btnOperacijaMinus(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty(broj1.get());
        broj1.set("");
        operacija.set("-");
    }

    @FXML
    public void btnJednako(ActionEvent actionEvent) {
        String pomocni ="";
        double rezultat=0;
        if(operacija.get().equals("+"))
            rezultat= Double.parseDouble(broj1.get()) + Double.parseDouble(broj2.get());
        if(operacija.get().equals("-"))
            rezultat= Double.parseDouble(broj1.get()) - Double.parseDouble(broj2.get());
        if(operacija.get().equals("="))
            rezultat= Double.parseDouble(broj1.get());
        if(operacija.get().equals("*"))
            rezultat= Double.parseDouble(broj1.get()) * Double.parseDouble(broj2.get());
        if(operacija.get().equals("%"))
            rezultat= Double.parseDouble(broj2.get())*(1/100)* Double.parseDouble(broj1.get());
        if(operacija.get().equals("/"))
            rezultat= Double.parseDouble(broj2.get()) / Double.parseDouble(broj1.get());
        broj1.set(String.valueOf(rezultat));
        broj2.set("0");
        operacija.set("=");
    }
}