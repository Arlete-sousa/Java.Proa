package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saudações humano! Vamos brincar de calculadora");
        System.out.println("Informe o primeiro número: ");
        double n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        double n2 = sc.nextInt();
        
        System.out.println("O que você quer: \n1 = Somar \n2 = Subtrair \n3 = Multiplicar \n4 = Dividir");
        int calculo = sc.nextInt();

            double total = 0;
        switch (calculo) {
            case 1:
                total = n1 + n2;
              System.out.println("tantantantan");
              System.out.println("O resultado é = "+ total);
              break;
            case 2:
                total = n1 - n2;
              System.out.println("tantantantan");
              System.out.println("O resultado é = "+ total);
              break;
            case 3:
                total = n1 * n2;
              System.out.println("tantantantan");
              System.out.println("O resultado é = "+ total);
              break;
            case 4:
                total = n1 / n2;
              System.out.println("tantantantan");
              System.out.println("O resultado é = "+ total);
              break;
        }
    }
}
