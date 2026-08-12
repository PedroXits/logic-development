import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int maior = 0;
        int menor = 0;
        int soma = 0;

        if(num1 > num2) {
          maior = num1;
          menor = num2;
        } else {
          maior = num2;
          menor = num1;
        }

        for(int i = 0; i < maior; i++) {
          if(i > menor && i < maior) {
            soma += i; 
          }
        }

        System.out.println(soma);

    }
}