import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int fatorial = 1;
      int menor = 0;

      if(num > 1) {
        for(int i = 1; i <= num; i++) {
          fatorial *= i;

          if(fatorial < num) {
            menor = fatorial; 
          } else {
            break;
          }
        }
      }

      System.out.println(menor);

    }
}