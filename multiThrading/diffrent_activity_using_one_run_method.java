/**
 * diffrent_activity_using_one_run()_method
 * 
 * 
 * 
 */
 /**
  * Innerdiffrent_activity_using_one_run_method
*/
import java.util.Scanner;
 class MyThread  implements Runnable
 {

    int a;
    int b;
    MyThread(int a,int b){
        this.a = a;
        this.b = b;
    }
  
    public void run(){

        String name = Thread.currentThread().getName();
        if(name.equals("add")){
            sum(a, b);
        }
        else{
            sub(a, b);
        }

    }

    public void sum(int a ,int b)
    {
        int sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public void sub(int a,int b)
    {
        int sub = a-b;
        System.out.println(a + " - " + b + " = " + sub);
    }
    
 }
public class diffrent_activity_using_one_run_method {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking  two number input from user.
        System.out.print("enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("enter second number : ");
        int num2 = sc.nextInt();
        sc.close();

     MyThread a = new MyThread(num1,num2);
     MyThread b = new MyThread(num1,num2);
    
     Thread t1 = new Thread(a);
     Thread t2 = new Thread(b);

     t1.setName("add");
     t2.setName("sub");

     t1.start();
     t2.start();
     

    }
}