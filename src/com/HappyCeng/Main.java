package com.HappyCeng;

import com.HappyCeng.Entity.Bank;
import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;
import com.HappyCeng.Manager.FileProcess;
import com.HappyCeng.Manager.ProcessVM;

import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException {
	// write your code here
        ProcessResult result = new ProcessResult();
        ProcessVM processVM = new ProcessVM();
        Person person = new Person();
        Person person1 = new Person();
        Bank bank = new Bank();

        person.setId(1);
        person.setAd("Mustafa");
        person.setSoyad("Mutlu");
        person.setTckn("12313131");

        result = processVM.kisiEkle(person);

        /*
        Bankayı oluşturmak için bir kişiy ihtiyaç var. Bu yüzden biz kişi objesiyle birlikte bank objesini gönderriyoruz.
        Burada alternatif olarak biz PersonId yi tek bir parametre olarak da gönderebilirdik.

        * */


        bank.setBankId(1);
        bank.setHesapAdi("Deneme Hesabı");
        bank.setBakiye(1000);
        result = processVM.bankaHesapEkle(person, bank);

        person1 = processVM.getPersonInfo();

        System.out.println(result.getResultMessage());



        Person gizem = new Person();
        gizem.setId(1);
        gizem.setAd("Gizem");
        gizem.setSoyad("Yıldırım");
        gizem.setTckn("12313131");
        gizem.setAnneAd("Sengül");
        gizem.setBabaAd("Selahattin");

        FileProcess fileProcess = new FileProcess();
        String formattedGizem = fileProcess.PersonFormatGenerator(gizem);
        fileProcess.saveFilePerson(formattedGizem);

        System.out.println(fileProcess.readFilePerson(1));

    }
}
