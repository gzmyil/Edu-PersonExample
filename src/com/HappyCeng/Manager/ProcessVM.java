package com.HappyCeng.Manager;

import com.HappyCeng.Entity.Bank;
import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;

public class ProcessVM {
    /*
    * extends almıştık ancak burası birden fazla classa yönlendirme yaptığımız yer.
    * o yüzden burada extend almaya gerek yok.
    * */

    public static ProcessResult kisiEkle(Person myPerson){
        ProcessResult result = new ProcessResult();

        PersonManager personManager = new PersonManager();

        try{
            result = personManager.addPerson(myPerson);

            if(result.isSuccess()){
                result.setSuccess(true);
                result.setResultMessage("Kişi başarıyla eklendi.");
            }
        } catch (Exception e){
            result.setSuccess(false);
            result.setResultMessage("Error 1001 : " + e);
        }

        return result;
    }

    public static ProcessResult bankaHesapEkle(Person person, Bank bank){
        ProcessResult result = new ProcessResult();

        BankManager bankManager = new BankManager();

        try{
            bank.setId(person.getId());

            bankManager.addBank(bank);

            if(result.isSuccess()){
                result.setSuccess(true);
                result.setResultMessage("Banka hesabı başarıyla oluşturuldu.");
            }
        } catch (Exception e){
            result.setSuccess(false);
            result.setResultMessage("Error 2001 : " + e);
        }

        return result;
    }

    public static Person getPersonInfo(){ //burayıda düzenlersiniz :)
        PersonManager personManager = new PersonManager();
        Person person = new Person();

        person = personManager.getPerson();

        return person;
    }
}
