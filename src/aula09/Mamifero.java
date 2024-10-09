package aula09;

public class Mamifero {
    String alimento;
    public Mamifero (String nome, String cor, String alimento,int comprimento, float velocidade, int patas){
        this.alimento = alimento;
    }

    void alteraAlimento(String alimento){
        this.alimento = alimento;
    }

    public String alimento(){
        return alimento;
    }

    void andar(String velocidade){
        
    }
}
