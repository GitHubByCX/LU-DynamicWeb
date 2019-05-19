package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class T1_client {
    public static void main(String[] args) {
        T1_realSubject realSubject = new T1_realSubject();
        InvocationHandler handler = new T1_DynamicProxy(realSubject);
        T1_subject subject = (T1_subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),handler);

        System.out.println("method name:"+subject.getClass().getName());
        subject.rent();
        subject.hello("ben");
    }
}
