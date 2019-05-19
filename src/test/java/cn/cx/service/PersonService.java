package cn.cx.service;

import cn.cx.myclass.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    @Autowired
    private Person person;

    public void personInfo(){
        System.out.println("person name is "+person.getName()+",age is "+person.getAge());
    }

}
