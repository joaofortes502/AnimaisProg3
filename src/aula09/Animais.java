package aula09;

public class Animais {
    public static void main(String[] args) {

        Animal[] animals = new Animal[30];
        int animalCont = 0;

        Zoo zoo = new Zoo();

        while (animalCont<30){
            animals[animalCont] = zoo.getAnimal();
            animalCont++;
        }

    }

}
