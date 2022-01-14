package com.HappyCeng.Manager;

import com.HappyCeng.Entity.Bank;
import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;

import java.io.*;

public class FileProcess {

    public static ProcessResult saveFilePerson(String fileFormat){
        ProcessResult result = new ProcessResult();
        try {
            File file = new File("persons.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            writer.println(fileFormat);
            writer.close();


        } catch (Exception e){
            result.setSuccess(false);
            result.setResultMessage("Error 1003 : " + e);
        }

        return result;
    }

    public static String readFilePerson(int id) throws IOException { //buraya kişi id si gelecek ve ona göre veri çekilecek.
        //String readLine = "1#12313131#Mustafa#Mutlu#null#null#";

        FileReader fileReader=new FileReader("persons.txt");
        String line;
        BufferedReader br=new BufferedReader(fileReader);
        while((line=br.readLine())!=null){
            String lineId = String.valueOf(line.charAt(0));
            if (lineId.equals(String.valueOf(id))){
                return line;
            }

        }
        br.close();

        return "Person could't find";
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
