package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class T1_DynamicProxy implements InvocationHandler {
    private Object obj;
    public T1_DynamicProxy(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rent house.");
        System.out.println("invoke method is :"+method);
        method.invoke(obj,args);
        System.out.println("after rent house.");
        return null;
    }
}
