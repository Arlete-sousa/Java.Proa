package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Saudações humano! Vamos brincar com os números");
        System.out.println("Informe o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        int n3 = sc.nextInt();
        
        if ((n2>n1) && (n1>n3)){
            int total = n1 + n2;
            System.out.println("O total é " + total);
        }
        if ((n2>n3) && (n3>n1)){
            int total = n2 + n3;
            System.out.println("O total é " + total);
        }
        if ((n3>n2) && (n2>n1)){
            int total = n2 + n3;
            System.out.println("O total é " + total);
        }
        if ((n3>n1) && (n1>n2)){
            int total = n1 + n3;
            System.out.println("O total é " + total);
        }
        if ((n1>n3) && (n3>n2)){
            int total = n1 + n3;
            System.out.println("O total é " + total);
        }
    }
}