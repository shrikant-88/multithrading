/**
 * threating
 */
public class threating {

    public static void main(String[] args) {
      System.out.println("in main threat : ");
      String name = Thread.currentThread().getName();
      int priority = Thread.currentThread().getPriority();
      System.out.println("name of current threat is " + name + "\n" +"priority of current threat is " + priority);
    }
}