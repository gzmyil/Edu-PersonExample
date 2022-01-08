package com.HappyCeng.Entity;

public class Person {

    private int id;
    private String tckn;
    private String ad;
    private String soyad;
    private String anneAd;
    private String babaAd;

    public int getId() {
        return id;
    }

    public void setId(int id) { //sadece oluşturulurken set edilecek.
        this.id = id;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAnneAd() {
        return anneAd;
    }

    public void setAnneAd(String anneAd) {
        this.anneAd = anneAd;
    }

    public String getBabaAd() {
        return babaAd;
    }

    public void setBabaAd(String babaAd) {
        this.babaAd = babaAd;
    }

}
