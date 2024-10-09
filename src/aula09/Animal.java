package aula09;

public class Animal {
    String nome;
    int comprimento;
    int patas = 4;
    String cor;
    String ambiente;
    float velocidade;

    void dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade);
    }

    public Animal(String nome, String cor, String ambiente, int comprimento, float  velocidade, int patas){
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
        this.comprimento = comprimento;
        this.patas = patas;
    }

    void alteraNome(String nome){
        this.nome = nome;
    }

    void alteraComprimento(int comprimento){
        this.comprimento = comprimento;
    }

    void alteraPatas(int patas){
        this.patas = patas;
    }

    void alteraCor(String cor){
        this.cor = cor;
    }

    void alteraAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    void alteraVelocidade(float velocidade){
        this.velocidade = velocidade;
    }
}
