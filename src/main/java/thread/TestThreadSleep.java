package thread;

public class TestThreadSleep {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1;i<=10;i++){
                    System.out.println(Thread.currentThread().getName()+"---"+i);
                }
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    for(int i = 1;i<=10;i++){
                        System.out.println(Thread.currentThread().getName()+"---"+i);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        },"t2");

        t2.start();
        t1.start();
    }
}
