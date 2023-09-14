import java.util.Scanner;

class sum implements Runnable{
    int a;
    int b;
    sum(int a,int b){
    this.a = a;
    this.b = b;
    }
 @Override
 public void run() {
    try {
        Thread.sleep(2000);
    } catch (Exception e) {
        System.out.println("something want wrong..");
    }
    System.out.println("priority of sum = "+ Thread.currentThread().getPriority());
     System.out.println("sum = "+ (a+b));
 }
}

class sub implements Runnable{
    int a;
    int b;
    sub(int a,int b){
    this.a = a;
    this.b = b;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("something want wrong..");
        }
        System.out.println("priority of sub = "+ Thread.currentThread().getPriority());
        System.out.println("sub = " + (a-b));
    }
}
class mul implements Runnable{
    int a;
    int b;
    mul(int a,int b){
    this.a = a;
    this.b = b;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("something want wrong..");
        }
        System.out.println("priority of mul = "+ Thread.currentThread().getPriority());
        System.out.println("mul = "+ a*b);
    }
}
class div implements Runnable{
    int a;
    int b;
    div(int a,int b){
    this.a = a;
    this.b = b;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("something want wrong..");
        }
        System.out.println("priority of div = "+ Thread.currentThread().getPriority());
        System.out.println("div = "+ a/b);
    }
}
     
public class new_thread_using_runableInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();
        sc.close();

        sum plus = new sum(a,b);
        sub diffrence = new sub(a,b);
        mul product = new mul(a,b);
        div divide = new div(a,b);

        Thread t = new Thread(plus);
        Thread t1 = new Thread(diffrence);
        Thread t2 = new Thread(product);
        Thread t3 = new Thread(divide);

        t.start();
        t1.start();
        t2.start();
        t3.start();

        

    }
}
