package aula09;

import java.util.Scanner;

public class Zoo {

    String[] species = {"Camelo","Tubarão","Urso"};

    Scanner ler = new Scanner(System.in);

    int camel,shark,bear=0;

    public String getSpecie(){
        System.out.print("Escolha uma espécie -> Camelo, Tubarão ou Urso:");
        String specie = ler.nextLine();
        while (!isSpeciesValid(specie,species)){
            System.out.println("Opção inválida, tente novamente");
            specie = ler.nextLine();
        }
        return specie;
    }

    public boolean isSpeciesValid(String specie,String[] options){
        for(String option : options ){
            if (option.equals(specie)){
                return true;
            }
        }
        return false;
    }

}
