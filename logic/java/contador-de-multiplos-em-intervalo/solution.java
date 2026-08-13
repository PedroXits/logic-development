import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      int limiteInferior = input.nextInt();
      int limiteSuperior = input.nextInt();
      int multiplo = input.nextInt();
      int maior = limiteSuperior;
      int menor = limiteInferior;
      int multiplos = 0;

      if(limiteInferior > limiteSuperior) {
        maior = limiteInferior;
        menor = limiteSuperior;
      }

      for(int i = menor; i <= maior; i++) {
        if(i % multiplo == 0) {
          multiplos += 1;
        }
      }

      System.out.println(multiplos);

    }
}