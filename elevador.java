class Onibus {
    int total_andares;
    int andar_atual;
    int capacidade_de_pessoas;
    int pessoas_dentro;

    public Elevador(int total_andares, int andar_atual, int capacidade_de_pessoas, int pessoas_dentro) {

        this.total_andares = total_andares;
        this.andar_atual = andar_atual;
        this.capacidade_de_pessoas = capacidade_de_pessoas;
        this.pessoas_dentro = pessoas_dentro;
    }
     public int returnTotal_andares(){
        return this.total_andares;
    }
    
    public int returnAndar_atual(){
        return this.andar_atual;
    }

    public int returnCapacidade_de_pessoas(){
        return this.capacidade_de_pessoas
    }
    
    public int returnPessoas_dentro(){
        return this.pessoas_dentro
    }
} //OBS: Não consegui rodar o programa, então não sei se funciona.