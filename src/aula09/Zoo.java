package aula09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {

    String[] species = {"Camelo","Tubarão","Urso"};
    private Map<String, Integer> contagemEspecies = new HashMap<>();
    Scanner ler = new Scanner(System.in);
    private static final int LIMIT_BY_SPECIE = 9;

    public Zoo(){
        contagemEspecies.put("Camelo", 0);
        contagemEspecies.put("Tubarão", 0);
        contagemEspecies.put("Urso", 0);
    }

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
                if (contagemEspecies.get(specie) < LIMIT_BY_SPECIE) {
                    contagemEspecies.put(specie, contagemEspecies.get(specie) + 1);
                    return true;
                } else {
                    System.out.println("Limite de animais da espécie " + specie + " atingido.");
                    return false;
                }
            }
        }
        return false;
    }

    public String getCor(){
        System.out.print("Cor: ");
        return ler.nextLine();
    }

    public String getAmbiente(){
        System.out.print("Ambiente: ");
        return ler.nextLine();
    }

    public int getComprimento(){
        System.out.print("Comprimento: ");
        return ler.nextInt();
    }

    public float getVelocidade(){
        System.out.print("Velocidade: ");
        return ler.nextFloat();
    }

    public int getPatas(){
        System.out.print("Patas: ");
        return ler.nextInt();
    }

    public Animal getAnimal(){
        String nome = getSpecie();
        String cor = getCor();
        String ambiente = getAmbiente();
        int comprimento = getComprimento();
        float velocidade = getVelocidade();
        int patas = getPatas();

        Animal animal = new Animal(nome,cor,ambiente,comprimento,velocidade,patas);

        return animal;
    }
}
