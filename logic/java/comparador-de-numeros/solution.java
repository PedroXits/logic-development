import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int num1 = input.nextInt();
      int num2 = input.nextInt();

      if(num1 > num2) {
        System.out.println("Primeiro maior");
      } else if (num2 > num1) {
        System.out.println("Segundo maior");
      } else {
        System.out.println("Iguais");
      }
        
    }
}