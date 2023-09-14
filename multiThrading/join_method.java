class demo extends Thread {
    public void run(){
        System.out.println("other thread is actvated");
       for(int i = 0;i<3;i++){
         System.out.println(" hello.. . ");
         try
         {
            Thread.sleep(2000);
         } catch (Exception e) {
           System.out.println("error!");
         }
         
       }
       System.out.println("other thread is ended ");
    }
}

public class join_method {
    public static void main(String[] args)throws Exception {
        System.out.println("main thread is activated ");
        demo t = new demo();
        t.start();
       // t.join();
        System.out.println("main thread is ended");

        
    }
}
