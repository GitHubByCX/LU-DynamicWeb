package cn.cx.test;

import cn.cx.myclass.SpringDI_City;
import cn.cx.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_SpringAop {

    private ApplicationContext applicationContext = null;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
    }

    //@Test
    public void testGetContext(){
        System.out.println("applicationContext:"+applicationContext);
    }

    @Test
    public void testGetProductService(){
        ProductService productService = applicationContext.getBean("productService", ProductService.class);
        productService.doSomeService();
    }

}
