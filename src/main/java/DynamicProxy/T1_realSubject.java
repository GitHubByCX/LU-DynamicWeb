package DynamicProxy;

public class T1_realSubject implements T1_subject {
    @Override
    public void rent() {
        System.out.println("i want to rent my house.");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello word.  ---"+str);
    }
}
