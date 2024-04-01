class mythr2 extends Thread {
    public mythr2(String name) {
        super(name);
    }

    public void run() {
        int i = 32;
        while(true) {
            System.out.println("Thanks you " + this.getName());
        }
    }
}

    public class Example_6 {
        public static void main(String[] args) {
            mythr2 t = new mythr2("samruddhi");
           mythr2 t1 = new mythr2("sejal");
            mythr2 t3 = new mythr2("shivam");
            mythr2 t4 = new mythr2("ashok");
           t.start();
           t1.start();
           t3.start();
           t4.start();
           t.setPriority(Thread.MAX_PRIORITY);
           t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println( "the number is "+ t1.getId());

        }
    }
