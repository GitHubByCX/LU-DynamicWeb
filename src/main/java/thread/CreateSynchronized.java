package thread;
/*
* synchronized同步,当线程t1调用它时其他调用的线程进入阻塞状态
*
* 第一条:当一个线程访问某对象的synchronized方法或者synchronized代码块时，其他线程对该对象的该synchronized方法或者synchronized代码块的访问将被阻塞。
* 第二条:当一个线程访问某对象的synchronized方法或者synchronized代码块时，其他线程仍然可以访问该对象的非同步代码块。
* 第三条:当一个线程访问某对象的synchronized方法或者synchronized代码块时，其他线程对该对象的其他的synchronized方法或者synchronized代码块的访问将被阻塞。
* */
public class CreateSynchronized {

    public static void main(String[] args) {
        //
        class MyRunnable implements Runnable{
            private int num = 0;
            @Override
            public void run() {
                synchronized(this){
                    for(int i = 0;i<10;i++){
                        System.out.println(Thread.currentThread().getName()+" loop "+num++);
                    }
                }
                myMothed();
            }

            public void myMothed(){
                System.out.println(Thread.currentThread().getName()+" my mothed"+this.num);
            }
        }
        //
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable,"t1");
        Thread t2 = new Thread(myRunnable,"t2");
        Thread t3 = new Thread(myRunnable,"t3");

        t1.start();
        t2.start();
        t3.start();
    }

}
