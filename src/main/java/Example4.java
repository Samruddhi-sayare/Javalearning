class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("I am a thread not ");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread not ");
    }
}
public class Example4 {
    public static void main(String[] args) {

    }
      MyThreadRunnable harry = new MyThreadRunnable();
      MyThreadRunnable2 t2 =new MyThreadRunnable2();

}
