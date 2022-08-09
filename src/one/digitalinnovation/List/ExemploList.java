package one.digitalinnovation.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println("*** Lista com List e ArrayList ***");

        System.out.println("Lista Original: " + nomes);

        nomes.set(2,"Larissa");

        System.out.println("Alteração na Posição 3 com Set: " + nomes);

        Collections.sort(nomes);

        System.out.println("Lista Ordenada com Collection Sort: " + nomes);

        nomes.set(2,"Wesley");

        System.out.println("Alteração na Posição 3 com Set: " + nomes);

        nomes.remove(4);

        System.out.println("Remoção na Posição 5 com Remove Index: " + nomes);

        nomes.remove("Wesley");

        System.out.println("Remoção do Nome 'Wesley' com Remove Object: " + nomes);

        String nome = nomes.get(3);

        System.out.println("Nome na Posição 4 com Get: " + nome);

        int posicao = nomes.indexOf("Carlos");

        System.out.println("Posição de Carlos na Lista com IndexOf: " + posicao + " -- Obs.: Lembrando que a indexação começa por zero. Carlos está na posição 2.");

        posicao = nomes.indexOf("Wesley");

        System.out.println("Posição de Wesley na Lista com IndexOf: " + posicao + " -- Obs.: Posição negativa porque 'Wesley' já não existe na Lista.");

        int tamanho = nomes.size();

        System.out.println("Quantidade de nomes na lista com Size: " + tamanho);

        nomes.remove("Larissa");

        System.out.println("Remoção do Nome 'Larissa' com Remove Object: " + nomes);

        tamanho = nomes.size();

        System.out.println("Quantidade de nomes na lista com Size: " + tamanho);

        Boolean temAnderson =  nomes.contains("Anderson");

        System.out.println("Tem Anderson na Lista com Contains: " + temAnderson);

        Boolean temFernando =  nomes.contains("Fernando");

        System.out.println("Tem Fernando na Lista com Contains: " + temFernando);

        Boolean listaVazia = nomes.isEmpty();

        System.out.println("Verifica Lista Vazia com 'isEmpty': " + listaVazia);

        List<String> novaLista = new ArrayList<>();

        novaLista.add("Juliano");
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");

        System.out.println("Imprime Nova Lista: " + novaLista);

        for (String recebe: novaLista) {

            nomes.add(recebe);
        }
        System.out.println("Lista Antiga somando nomes de Nova Lista - " + nomes );

        System.out.println("*** Imprimindo a Lista com 'FOR' ***"); // escrita fora para evitar repetições

        for (String nomeDoItem: nomes){

            System.out.println("--> " + nomeDoItem);
        }

        System.out.println("*** Imprimindo a Lista com 'ITERATOR E WHILE' ***"); // escrita fora para evitar repetições

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){

            System.out.println("--> " + iterator.next());
        }

        nomes.clear();

        System.out.println("Limpeza com 'Clear' - Lista: " + nomes);

        listaVazia = nomes.isEmpty();

        System.out.println("Verifica Lista Vazia com 'isEmpty': " + listaVazia);

    }
}
