class Mynewthr1 extends Thread {

        public void run() {
            while(true) {
                System.out.println(" thanks ");
            }

    }
}
class Mynewthr2 extends Thread {

    public void run() {
        while(true) {
            System.out.println(" Welcome ");
        }

    }
}
public class example_7 {
    public static void main(String[] args) {
        Mynewthr1 t1 = new Mynewthr1();
        Mynewthr2 t2 = new Mynewthr2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
