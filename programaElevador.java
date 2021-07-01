public class programaOnibus{
    public static void main(String[] args) {   
        Elevador Elevador = new Elevador(22, 1, 8, 6);
             
        Elevador.ligar() {
            if (capacidade_de_pessoas <= this.pessoas_dentro) {
                this.pessoas_dentro = pessoas_dentro - this.pessoas_dentro;
            }
        }
        Elebador.entrarPessoas(){
            if (capacidade_de_pessoas + pessoas_dentro <= this.pessoas_dentro) {
                this.pessoas_dentro = pessoas_dentro + this.pessoas_dentro;
            }
        }
        Elevador.subir() {
            if (andar_atual >= 0 && this.andar_atual <= total_andares) {
    
                this.andar_atual = andar_atual;
            }
        }
        Elevador.descer(){
                if (andar_atual > 0 && this.andar_atual < total_andares) {
    
                    this.andar_atual = andar_atual;
                }
            } //OBS: Não consegui rodar o programa, então não sei se funciona.