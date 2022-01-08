package com.HappyCeng.Entity;

public class Bank extends Person{

    public int getBankId() {
        return BankId;
    }

    public void setBankId(int bankId) { //sadece oluşturulurken oluşacak.
        BankId = bankId;
    }

    public String getHesapAdi() {
        return HesapAdi;
    }

    public void setHesapAdi(String hesapAdi) {
        HesapAdi = hesapAdi;
    }

    public double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(double bakiye) {
        Bakiye = bakiye;
    }

    private int BankId;
    private String HesapAdi;
    private double Bakiye;

}
