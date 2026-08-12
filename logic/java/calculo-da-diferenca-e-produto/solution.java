import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      int num1 = input.nextInt();
      int num2 = input.nextInt();

      int dif = num1 - num2;

      if(num1 < num2) {
        dif = num2 - num1;
      } 

      int prod = num1 * num2;

      System.out.println(dif);
      System.out.println(prod);  

    }
}