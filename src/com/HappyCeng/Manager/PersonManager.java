package com.HappyCeng.Manager;

import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;

public class PersonManager {

    public static ProcessResult addPerson(Person person){
        ProcessResult result = new ProcessResult();
        FileProcess fileProcess = new FileProcess();

        String fileFormat = "";//denemekkjkjk

        try {
            fileFormat = fileProcess.PersonFormatGenerator(person);
            result.setSuccess(true);
        } catch (Exception e){
            result.setSuccess(false);
            result.setResultMessage("Error 1002 : " + e);
        }

        return result;
    }
}
