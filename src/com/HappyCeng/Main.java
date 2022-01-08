package com.HappyCeng;

import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;
import com.HappyCeng.Manager.ProcessVM;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProcessResult result = new ProcessResult();
        ProcessVM processVM = new ProcessVM();
        Person person = new Person();

        person.setId(1);
        person.setAd("Mustafa");
        person.setSoyad("Mutlu");
        person.setTckn("12313131");

        result = processVM.kisiEkle(person);

        System.out.println(result.getResultMessage());

    }
}
