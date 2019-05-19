package cn.cx.test;

import cn.cx.AnnotationConfig.Annotation_Scan;
import cn.cx.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_PersonAnnotation {

    @Test
    public void testGetPersonService(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Annotation_Scan.class);
        PersonService personService = applicationContext.getBean("personService", PersonService.class);
        personService.personInfo();
    }

}
