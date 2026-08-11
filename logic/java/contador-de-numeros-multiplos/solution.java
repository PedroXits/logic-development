import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      int num = input.nextInt();
      int contador = 0;

      for(int i = 1; i <= num; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
          contador++;
        }
      }

      System.out.println(contador);

    }
}