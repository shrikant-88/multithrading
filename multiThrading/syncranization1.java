class car implements Runnable{

    synchronized public void run(){
     try
     {
        System.out.println( Thread.currentThread().getName() + "  entered in parking lot ");
        Thread.sleep(2000);
        System.out.println( Thread.currentThread().getName() + "  enter in the car");
        Thread.sleep(2000);
        System.out.println( Thread.currentThread().getName() + "  drive the car and come back ");
        Thread.sleep(2000);
        System.out.println( Thread.currentThread().getName() + "  park the car in parking lot ");
     }
     catch(Exception e)
     {
        System.out.println("error..");
     }

    }
}
public class syncranization1 {
    
    public static void main(String[] args) throws Exception {
        
        car c = new car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("Son - 1");
        t2.setName("Son - 2");
        t3.setName("Son - 3");

        t1.start();
       
        t2.start();
       
        t3.start();
        
    }
}
