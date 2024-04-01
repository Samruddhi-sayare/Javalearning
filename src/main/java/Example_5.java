class mythr extends Thread {
   public mythr(String name){
       super(name);
   }
   public void run(){
       int i = 23;
//       while(true){
//           System.out.println("I am a thread");
//       }
   }
}
public class Example_5 {
    public static void main(String[] args) {
    mythr t  = new mythr("samruddhi");
    t.start();
    System.out.println("the id of thread t is " + t.getId());
    System.out.println("the id of thread t is " + t.getName());

    }
}
