import java.util.Scanner;

public class TowerOfHanoi {


   public static void main(String[] args) {
       TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
       System.out.print("Enter the Number of Rings: ");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       towerOfHanoi.run(n, "A", "B", "C");
   }
   
   public void run(int n, String a, String b, String c) {
       if (n == 1) {
           System.out.println("Disk " + n + " from " + a + " to " + c);
       } else {
    	   run(n - 1, a, c, b);
           System.out.println("Disk " + n + " from " + a + " to " + c);
           run(n - 1, b, a, c);
       }    
       
   }
}
