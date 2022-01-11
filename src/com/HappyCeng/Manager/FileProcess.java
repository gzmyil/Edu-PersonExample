package com.HappyCeng.Manager;

import com.HappyCeng.Entity.Bank;
import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;

public class FileProcess {

    public static ProcessResult saveFilePerson(String fileFormat){
        ProcessResult result = new ProcessResult();

        try {
            //dosya ya kaydetme işlemi.
        } catch (Exception e){
            result.setSuccess(false);
            result.setResultMessage("Error 1003 : " + e);
        }

        return result;
    }

    public static String readFilePerson(){ //buraya kişi id si gelecek ve ona göre veri çekilecek.
        String readLine = "1#12313131#Mustafa#Mutlu#null#null#";

        return  readLine;
    }

    public static String PersonFormatGenerator(Person myPerson){
        //1#12313131#Mustafa#Mutlu#null#null#
        String format = "";

        format = myPerson.getId() + "#";
        format = format + myPerson.getTckn() + "#";
        format = format + myPerson.getAd() + "#";
        format = format + myPerson.getSoyad() + "#";
        format = format + myPerson.getAnneAd() + "#";
        format = format + myPerson.getBabaAd() + "#";

        return format;
    }

    public static String BankFormatGenerator(Bank myBank){
        String format = "";

        format = myBank.getId() + "#";
        format = format + myBank.getBankId() + "#";
        format = format + myBank.getHesapAdi() + "#";
        format = format + myBank.getBakiye() + "#";

        return format;
    }

}
