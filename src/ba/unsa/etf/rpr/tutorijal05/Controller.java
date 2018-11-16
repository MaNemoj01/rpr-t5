package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    private SimpleStringProperty broj1;
    private SimpleStringProperty broj2;
    private SimpleStringProperty operacija;


    public Controller() {
        setBroj1(new SimpleStringProperty("0"));
        setBroj2(new SimpleStringProperty(""));
        setOperacija(new SimpleStringProperty("="));
    }

    //brojevi
    public void btnBroj1(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"1"));

        System.out.println(getBroj1() + " 1");
    }

    public void btnBroj2(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"2"));
    }

    public void btnBroj3(ActionEvent actionEvent) {

        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"3"));
    }

    public void btnOperacijaPlus(ActionEvent actionEvent) {
        getBroj2().set( getBroj1().get());
        getBroj1().set("");
        getOperacija().set("+");
    }

    public void btnBroj4(ActionEvent actionEvent)
    {   if(getBroj1().get().equals("0"))
        getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"4"));
    }

    public void btnBroj5(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"5"));
    }

    public void btnBroj6(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"6"));
    }

    public void btnBroj7(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"7"));
    }

    public void btnBroj8(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set (new String(getBroj1().get()+"8"));
    }

    public void btnBroj9(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("");
        getBroj1().set(new String(getBroj1().get()+"9"));
    }

    public void btnBroj0(ActionEvent actionEvent) {
        if(getBroj1().get().equals("0"))
            getBroj1().set("0");
        else
            getBroj1().set(new String(getBroj1().get()+"0"));
    }

    public void btnTacka(ActionEvent actionEvent) {
        getBroj1().set(new String(getBroj1().get()+"."));
    }

    // operacije

    public void btnOperacijaPosto(ActionEvent actionEvent) {
        setBroj2(new SimpleStringProperty( getBroj1().get()));
        getBroj1().set("");
        getOperacija().set("%");
    }

    public void btnOperacijaDijeljenje(ActionEvent actionEvent) {
        setBroj2(new SimpleStringProperty( getBroj1().get()));
        getBroj1().set("");
        getOperacija().set("/");
    }

    public void btnOperacijaPuta(ActionEvent actionEvent) {
        setBroj2(new SimpleStringProperty( getBroj1().get()));
        getBroj1().set("");
        getOperacija().set("*");
    }

    public void btnOperacijaMinus(ActionEvent actionEvent) {
        setBroj2(new SimpleStringProperty(getBroj1().get()));
        getBroj1().set("");
        getOperacija().set("-");
    }

    @FXML
    public void btnJednako(ActionEvent actionEvent) {
        String pomocni ="";
        double rezultat=0;
        if(getOperacija().get().equals("+"))
            rezultat= Double.parseDouble(getBroj1().get()) + Double.parseDouble(getBroj2().get());
        else if(getOperacija().get().equals("-"))
            rezultat= Double.parseDouble(getBroj1().get()) - Double.parseDouble(getBroj2().get());
        else if(getOperacija().get().equals("="))
            rezultat= Double.parseDouble(getBroj1().get());
        else if(getOperacija().get().equals("*"))
            rezultat= Double.parseDouble(getBroj1().get()) * Double.parseDouble(getBroj2().get());
        else if(getOperacija().get().equals("%"))
            rezultat= Double.parseDouble(getBroj2().get())*(1/100)* Double.parseDouble(getBroj1().get());
        else if(getOperacija().get().equals("/"))
            rezultat= Double.parseDouble(getBroj2().get()) / Double.parseDouble(getBroj1().get());
        getBroj1().set(String.valueOf(rezultat));
        getBroj2().set("0");
        getOperacija().set("=");
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
}