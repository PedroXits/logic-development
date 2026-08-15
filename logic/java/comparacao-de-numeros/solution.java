import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      int numA = input.nextInt();
      int numB = input.nextInt();

      if(numA > numB) {
        System.out.println("A é maior");
      } else if (numA < numB) {
        System.out.println("B é maior");
      } else {
        System.out.println("A e B são iguais");
      }

    }
}