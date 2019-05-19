package thread;
/*
* 证明调用不包含同步锁的方法不受阻塞影响
* */
public class TestSynchronized {

    public static void main(String[] args) {
        //
        class  Example1{
            //
            public void CountSynchronized(){
                synchronized (this){
                    for (int i = 0;i<10;i++){
                        try{
                            Thread.sleep(100);
                            System.out.println(Thread.currentThread().getName()+"---"+i);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }

            public void notSynchronized(){
                try{
                    Thread.sleep(100);
                    for (int i = 0;i<10;i++){
                        System.out.println(Thread.currentThread().getName()+"---"+i);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
        //
        final  Example1 example1 = new Example1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                example1.CountSynchronized();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                example1.notSynchronized();
            }
        },"t2");

        t1.start();
        t2.start();
    }

}
