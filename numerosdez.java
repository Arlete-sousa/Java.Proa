
import java.util.Scanner;

public class numerosdez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int soma = 0;
        while(contador<=10){
            System.out.println("Saudações humano! Vamos brincar com os números");
            System.out.println("Desafio você a digitar dez números, e no final eu farei a soma deles \n");
            System.out.println("Comece pelo primeiro e depois aperte o enter do seu teclado");

            System.out.println("Digite um número por vez: ");
            soma = sc.nextInt() + soma;
            contador = contador + 1;
        }
        System.out.println("O Total da soma é: "+ soma);
    }
}
