public class programaOnibus{
    public static void main(String[] args) {   
        Onibus Onibus1 = new Onibus(28, 30, 22, 8);
        Onibus Onibus2 = new Onibus(28, 30, 24, 8);
        Onibus Onibus3 = new Onibus(28, 30, 26, 8);

        Onibus1.liga();
        System.out.println("Passageiros, sejam muito bem vindos!");
        System.out.println("Podem entrar, e se assentar em suas assentos");
        System.out.println("Espero que gostem de nossa viagem :) ");
        Onibus1.entrarPassageiros();

        Onibus2.liga();
        System.out.println("Passageiros, sejam bem vindos!");
        System.out.println("Podem entrar, e se assentar em suas assentos");
        Onibus2.entrarPassageiros();

        Onibus3.liga();
        System.out.println("Passageiros, sejam muito bem vindos!");
        System.out.println("Vocês são muito especiais para nós");
        System.out.println("Podem entrar, e se assentar em suas assentos");
        System.out.println("Espero que gostem de nossa viagem :) ");
        Onibus3.entrarPassageiros();

        Onibus1.PararPrimeiraParada();
        Onibus1.descerPassageiros();
        System.out.println("aqui desceu 14 pessoas, agora no total temos " + (quantidade_acentos - 14));

        Onibus2.PararPrimeiraParada();
        Onibus2.descerPassageiros();
        System.out.println("aqui desceu 8 pessoas, agora no total temos " + (quantidade_acentos - 8));

        Onibus2.PararPrimeiraParada();
        Onibus1.descerPassageiros();
        System.out.println("aqui desceu 11 pessoas, agora no total temos " + (quantidade_acentos - 11));


}
} //OBS: Não consegui rodar o programa.
