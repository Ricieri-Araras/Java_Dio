package one.digitalinnovation.List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        // adiciona 4 esportes no vetor

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");
        esportes.add("Voleibol");

        System.out.println("Esportes: " + esportes);

        // altera o valor da posição 3 do vetor
        esportes.set(2,"Ping Pong");

        // remove o esporte da posição 3
        esportes.remove(2);

        // remove os esporte Handebol do vetor

        esportes.remove("Handebol");

        // retorna o primeiro item do vetor
        System.out.println("Primeiro item: " + esportes.get(0));

        // navega nos esportes
        int item = 0;
        for (String esporte: esportes) {

            item += 1;
            System.out.println("item " + item + " -- " + esporte);
        }

    }
}
