
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Saudações humano! Vamos brincar com os números");
        System.out.print("Digite seu número para começar: ");
        float n1 = n.nextFloat();
        
        if (n1 < 0){
            System.out.println("Nosssssaaa que Negativo!\n");
        } else {
            if ((n1 == 0)){
                System.out.println("Zerooooou\n");
        } else {
                    System.out.println("Positividade sempre! Certo?\n");
                }
    }
}
           
        
        
        


    }
    
}
