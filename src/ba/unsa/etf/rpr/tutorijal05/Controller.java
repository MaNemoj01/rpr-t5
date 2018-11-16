package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    private SimpleStringProperty broj;
    private SimpleStringProperty broj2;
    private SimpleStringProperty operacija;


    public Controller() {
        broj = new SimpleStringProperty("0");
        broj2 = new SimpleStringProperty("");
        operacija = new SimpleStringProperty("=");
    }

    public SimpleStringProperty brojProperty(){
        return broj;
    }
    public  String getBroj(){
        return broj.get();
    }

    //brojevi
    public void btnBroj1(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("");
        broj.set(new String(broj.get()+"1"));

        System.out.println(broj + " 1");
    }

    public void btnBroj2(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("");
        broj.set(new String(broj.get()+"2"));
    }

    public void btnBroj3(ActionEvent actionEvent) {

        if(broj.get().equals("0"))
            broj.set("");
        broj.set(new String(broj.get()+"3"));
    }

    public void btnOperacijaPlus(ActionEvent actionEvent) {
        broj2.set( broj.get());
        broj.set("");
        operacija.set("+");
    }

    public void btnBroj4(ActionEvent actionEvent)
    {   if(broj.get().equals("0"))
        broj.set("");
        broj.set(new String(broj.get()+"4"));
    }

    public void btnBroj5(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("");
        broj.set(new String(broj.get()+"5"));
    }

    public void btnBroj6(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("");
        broj.set(new String(broj.get()+"6"));
    }

    public void btnBroj7(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("");
        broj.set(new String(broj.get()+"7"));
    }

    public void btnBroj8(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("");
        broj.set (new String(broj.get()+"8"));
    }

    public void btnBroj9(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("");
        broj.set(new String(broj.get()+"9"));
    }

    public void btnBroj0(ActionEvent actionEvent) {
        if(broj.get().equals("0"))
            broj.set("0");
        else
            broj.set(new String(broj.get()+"0"));
    }

    public void btnTacka(ActionEvent actionEvent) {
        broj.set(new String(broj.get()+"."));
    }

    // operacije

    public void btnOperacijaPosto(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty( broj.get());
        broj.set("");
        operacija.set("%");
    }

    public void btnOperacijaDijeljenje(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty( broj.get());
        broj.set("");
        operacija.set("/");
    }

    public void btnOperacijaPuta(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty( broj.get());
        broj.set("");
        operacija.set("*");
    }

    public void btnOperacijaMinus(ActionEvent actionEvent) {
        broj2 = new SimpleStringProperty(broj.get());
        broj.set("");
        operacija.set("-");
    }

    @FXML
    public void btnJednako(ActionEvent actionEvent) {
        String pomocni ="";
        double rezultat=0;
        if(operacija.get().equals("+"))
            rezultat= Double.parseDouble(broj.get()) + Double.parseDouble(broj2.get());
        else if(operacija.get().equals("-"))
            rezultat= Double.parseDouble(broj.get()) - Double.parseDouble(broj2.get());
        else if(operacija.get().equals("="))
            rezultat= Double.parseDouble(broj.get());
        else if(operacija.get().equals("*"))
            rezultat= Double.parseDouble(broj.get()) * Double.parseDouble(broj2.get());
        else if(operacija.get().equals("%"))
            rezultat= Double.parseDouble(broj2.get())*(1/100)* Double.parseDouble(broj.get());
        else if(operacija.get().equals("/"))
            rezultat= Double.parseDouble(broj2.get()) / Double.parseDouble(broj.get());
        broj.set(String.valueOf(rezultat));
        broj2.set("0");
        operacija.set("=");
    }


}