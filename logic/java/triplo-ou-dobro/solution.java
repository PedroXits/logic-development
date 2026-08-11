import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      int num = input.nextInt();

      if(num > 0) {
        System.out.println(num * 3);
      } else if(num == 0 || num < 0) {
        System.out.println(num * 2);
      }

    }
}