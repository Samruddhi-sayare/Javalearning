class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
        int i = 32;
        System.out.println("Thanks you " + this.getName());
    }
}
public class Exampl
{
    public static void main(String[] args) {
    mythr1 t1 = new mythr1("sam1");
    mythr1 t2 = new mythr1("sam2");
    mythr1 t3 = new mythr1("sam3");
    t1.start();
    t2.start();
    t3.start();
    }
}
