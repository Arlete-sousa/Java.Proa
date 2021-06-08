
package exercicios2;

import java.util.Scanner;

public class Exercicios2 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Saudações humano! Vamos brincar com os números");
        System.out.print("Digite o primeiro número: ");
        float n1 = n.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = n.nextFloat();
        System.out.print("Digite o terceiro número: ");
        float n3 = n.nextFloat();
        
        if ((n1 > n2 && n1>n3)){
            System.out.println("O maior número que você digitou foi o" + n1);
        } else {
            if ((n2 > n1 && n2 > n3)){
                System.out.println("O maior número que você digitou foi o " + n2);
            } else{
                if((n3 > n1 && n3 > n2)){
                    System.out.println("O maior número que você digitou foi o " + n3);
                }
            }
        }
}

    }
    

