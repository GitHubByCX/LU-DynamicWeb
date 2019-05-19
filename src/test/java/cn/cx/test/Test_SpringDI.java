package cn.cx.test;

import cn.cx.myclass.SpringDI_City;
import cn.cx.myclass.SpringDI_Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_SpringDI {

    ApplicationContext applicationContext = null;

    @Before
    public void init(){
        try{
            applicationContext = new ClassPathXmlApplicationContext("spring-beans");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //@Test
    public void testGetPerson(){
        SpringDI_Person person = applicationContext.getBean("person", SpringDI_Person.class);
        person.getLanguge().say();
    }

    @Test
    public void testGetCity(){
        SpringDI_City city = applicationContext.getBean("city",SpringDI_City.class);
        city.how();
    }

//    public static void main(String[] args) {
//        System.out.println(Test_SpringDI.class.getResource("/"));
//    }

}
