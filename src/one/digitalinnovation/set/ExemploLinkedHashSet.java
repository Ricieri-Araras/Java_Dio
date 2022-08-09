package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        System.out.println("Adiciona os números no SET.");
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println("imprime o SET: " + sequenciaNumerica);

        System.out.println("Remove o número 4 do SET.");
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        System.out.print("Retorna a quantidade de itens do SET com 'SIZE' --> ");
        System.out.println(sequenciaNumerica.size());

        System.out.println("Navega em todos os itens com ITERATOR.");

        Iterator<Integer> numerosIterador = sequenciaNumerica.iterator();

        while (numerosIterador.hasNext()){

            System.out.println("--> " + numerosIterador.next());
        }

        System.out.println("Navega em todos os itens com FOREACH.");

        for (int navegaNumero: sequenciaNumerica){

            System.out.println("---> " + navegaNumero);
        }

        System.out.print("Retorna se SET está vazio com 'isEmpty'. --> ");

        System.out.println(sequenciaNumerica.isEmpty());

        System.out.println("Apaga o SET com CLEAR.");

        sequenciaNumerica.clear();

        System.out.print("Retorna se SET está vazio com 'isEmpty'. --> ");

        System.out.println(sequenciaNumerica.isEmpty());


    }
}
