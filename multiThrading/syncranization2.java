
class print implements Runnable{
  static int count1 = 0;

    synchronized public void run(){
       String s = Thread.currentThread().getName();
      
         
          System.out.println(s + " start counting");
          for(int i=0;i<10;i++){
           count1++;
          }
          try{Thread.sleep(5000);} catch(Exception e){ System.out.println("error");}
          System.out.println(s + " ended counting");
         
    }
}

public class syncranization2 {
    
    public static void main(String[] args) throws Exception{

        print c = new print();
        Thread t = new Thread(c);
        Thread t1 = new Thread(c);
        t.setName("thread 1");
        t1.setName("thread 2");
        t.start();
        t1.start();
        Thread.sleep(11000);
        System.out.println("total count  =  " + print.count1);

    }
}
