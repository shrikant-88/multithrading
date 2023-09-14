import java.util.Scanner;

class add extends Thread{
    public void run(){

        Thread.currentThread().setPriority(MAX_PRIORITY);
        
        Scanner sc = new Scanner(System.in);
            System.out.print("enter first number : ");
            int a = sc.nextInt();
            System.out.print("enter second number : ");
            int b = sc.nextInt();
            int result = a+b;
            System.out.println("a+b = "+ result);
        }
        
    } 


public class new_threat_using_Threat_class {
    

    public static void main(String[] args) {
        
        add sum = new add();
        sum.start();
        try{
            Thread.sleep(5000);
            }
            catch(Exception e){
                System.out.println("somethimg happen wrong. !");
            }    
          
            Scanner sc = new Scanner(System.in);
            System.out.print("enter first number : ");
            int a = sc.nextInt();
            System.out.print("enter second number : ");
            int b = sc.nextInt();
            int result = a*b;
            System.out.println("a*b = "+ result);
        
    }
}
