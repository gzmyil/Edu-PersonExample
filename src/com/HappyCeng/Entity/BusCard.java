package com.HappyCeng.Entity;

public class BusCard extends Person{

    public String getBusCardName() {
        return BusCardName;
    }

    public void setBusCardName(String busCardName) {
        BusCardName = busCardName;
    }

    public double getBusCardBakiye() {
        return BusCardBakiye;
    }

    public void setBusCardBakiye(double busCardBakiye) {
        BusCardBakiye = busCardBakiye;
    }

    public int getBusCardId() {
        return BusCardId;
    }

    public void setBusCardId(int busCardId) { //Burasına değişim şartı eklenecek.
        BusCardId = busCardId;
    }

    private int BusCardId;
    private String BusCardName;
    private double BusCardBakiye;

}
