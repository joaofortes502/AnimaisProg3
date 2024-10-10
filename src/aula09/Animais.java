package aula09;

public class Animais {
    public static void main(String[] args) {

        Animal[] animals = new Animal[30];
        int animalCont = 0;

        animals[0] = new Animal("oi","azul","algo",5,1,4);

        Zoo zoo = new Zoo();

        zoo.getSpecie();
    }

}
