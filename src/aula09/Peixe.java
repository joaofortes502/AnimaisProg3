package aula09;

public class Peixe extends Animal{

    String caracteristica;

    public Peixe(String nome, String caracteristica, int comprimento, float velocidade) {
        super(nome, "cinza", "mar", comprimento, velocidade, 0);
        this.caracteristica = caracteristica;

    }

    public void nadar(float velocidade){
        System.out.println(velocidade);
    }

}
