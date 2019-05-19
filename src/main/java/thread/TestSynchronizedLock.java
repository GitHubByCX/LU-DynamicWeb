package thread;

public class TestSynchronizedLock {
    static class ClassA{
        public synchronized void SyncA(){
            for(int i = 0;i<5;i++) {
                System.out.println(Thread.currentThread().getName()+"-ClassA-SyncA : "+i);
            }
        }
        public synchronized void SyncB(){
            for(int i = 0;i<5;i++) {
                System.out.println(Thread.currentThread().getName() + "-ClassA-SyncB : "+i);
            }
        }
        public static synchronized void SSyncA(){
            for(int i = 0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"-ClassA-Static SSyncA : "+i);
            }
        }
        public static synchronized void SSyncB(){
            for(int i = 0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"-ClassA-Static SSyncB : "+i);
            }
        }
    }

    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassA b = new ClassA();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.SyncA();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.SyncA();
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
