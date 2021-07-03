
class Conta {
    String titular_da_conta;
    int agencia;
    double saldo;
    String data_de_abertura;
       
    public Onibus(String titular_da_conta, int agencia, double saldo, String data_de_abertura) {

        this.titular_da_conta = titular_da_conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data_de_abertura = data_de_abertura;
    }

    public String returnTitular_da_conta(){
        return this.titular_da_conta;
    }
    
    public int returnAgencia(){
        return this.agencia;
    }

    public double returnSaldo(){
        return this.saldo;
    }
    
    public int returnData_de_abertura(){
        return this.data_de_abertura;
    }

}
//Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome do titular (String), o número (int), a agência (String), o saldo (double) e uma data de abertura (String). Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver o rendimento mensal dessa conta.Essa atividade deve ser entregue de forma gráfica. Pode utilizar qualquer ferramenta que ache interessante