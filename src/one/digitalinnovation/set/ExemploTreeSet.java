package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();


        System.out.println("Monta a árvore com as Capitais.");
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println("Capitais: " + treeCapitais);

        System.out.print("'First' - Retorna a Primeira Capital no Topo da Árvore: ");
        System.out.println(treeCapitais.first());

        System.out.print("'Last' - Retorna a Última Capital no Final da Árvore: ");
        System.out.println(treeCapitais.last());

        System.out.print("Retorna as primeiras Capitais logo abaixo e logo acima da Capital parametrizada: ");
        System.out.println("Florianópolis");
        System.out.println("A Capital abaixo é: " + treeCapitais.lower("Florianópolis"));
        System.out.println("A Capital acima é: " + treeCapitais.higher("Florianópolis"));

        System.out.println("Retorna a primeira Capital acima e a última Capital no final da Árvore Removendo do SET: ");

        System.out.println("Primeira Capital: " + treeCapitais.pollFirst());
        System.out.println("Última Capital: " + treeCapitais.pollLast());

        System.out.println("Árvore atualizada: " + treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();
        System.out.println("****  USO DO ITERATOR  ****");
        while (iterator.hasNext()){

            System.out.println("--> " + iterator.next());
        }

        System.out.println("****  USO DO FOREACH  ****");

        for (String treeprint: treeCapitais) {

            System.out.println("---> " + treeprint);
        }

        treeCapitais.add("Manaus");
        treeCapitais.add("Brasília");
        treeCapitais.add("Belém");
        treeCapitais.add("Terezina");
        treeCapitais.add("Fortaleza");
        treeCapitais.add("São Luís");

        System.out.println("Árvore atualizada: " + treeCapitais);

        System.out.println("Remove Florianópolis");
        treeCapitais.remove("Florianópolis");

        System.out.println("Remove Porto Alegre");
        treeCapitais.remove("Porto Alegre");

        System.out.println("Árvore atualizada: " + treeCapitais);

    }
}
