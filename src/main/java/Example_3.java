import java.sql.SQLOutput;

class MyThread extends Thread{
    public void run(){
        while(true){
            System.out.println(" My Thread 1 is good");
            System.out.println("I am Happy");
        }
    }
}
class MyThread_2 extends Thread{
    public void run(){
        while (true){
            System.out.println(" Thread 2 is good");
            System.out.println(" I am sad");
        }
    }
}
public class Example_3 {


    public static void main(String[] args) {
        // MultiThreading
        MyThread t1 = new MyThread();
        MyThread_2 t2 = new MyThread_2();
        t1.start();
        t2.start();
    }
}
