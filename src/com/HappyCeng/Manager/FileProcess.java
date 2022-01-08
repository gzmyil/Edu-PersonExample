package com.HappyCeng.Manager;

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

    public static String PersonFormatGenerator(Person myPerson){
        String format = "";

        format = myPerson.getId() + "#";
        format = format + myPerson.getTckn() + "#";
        format = format + myPerson.getAd() + "#";
        format = format + myPerson.getSoyad() + "#";
        format = format + myPerson.getAnneAd() + "#";
        format = format + myPerson.getBabaAd() + "#";

        return format;
    }

}
