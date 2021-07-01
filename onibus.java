class Onibus {
    int quantidade_acentos;
    int capacidade_pessoas;
    int quantidade_pessoas;
    int quantidade_paradas;
    String local;
       
    public Onibus(int quantidade_acentos, int capacidade_pessoas,int quantidade_pessoas, int quantidade_paradas, String local) {

        this.quantidade_acentos = quantidade_acentos;
        this.capacidade_pessoas = capacidade_pessoas;
        this.quantidade_pessoas = quantidade_pessoas;
        this.quantidade_paradas = quantidade_paradas;
        this.local = local;
    }

    public int returnQuantidade_acentos(){
        return this.quantidade_acentos;
    }
    
    public int returnCapacidade_pessoas(){
        return this.capacidade_pessoas;
    }

    public int returnQuantidade_pessoas(){
        return this.quantidade_pessoas;
    }
    
    public int returnQuantidade_paradas(){
        return this.quantidade_paradas;
    }

    public String returnLocal(){
        return this.local;
    }
} //OBS: Não consegui rodar o programa.
