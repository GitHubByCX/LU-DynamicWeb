package thread;
/*
* 同一个Runnable创建的Thread会共享其资源
* */
public class CreateMyThread {
    public static void main(String[] args) {
        //
        class MyRunnable implements  Runnable{
            private int apple = 10;
            @Override
            public void run() {
               for(int i = 0;i<20;i++){
                   if(this.apple>0){
                       System.out.println(Thread.currentThread().getName()+"拿取"+this.apple--);
                   }
               }
            }
        }
        //
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);

        t1.start();
        t2.start();
        t3.start();
    }
}
