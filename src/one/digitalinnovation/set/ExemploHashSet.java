package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        // adiciona as notas no set
        System.out.println("*** Exibindo enquanto insere os dados no SET ***");
        notasAlunos.add(5.8);
        System.out.print(notasAlunos + " ; ");
        notasAlunos.add(9.3);
        System.out.print(notasAlunos + " ; ");
        notasAlunos.add(6.5);
        System.out.print(notasAlunos + " ; ");
        notasAlunos.add(10.0);
        System.out.print(notasAlunos + " ; ");
        notasAlunos.add(5.4);
        System.out.print(notasAlunos + " ; ");
        notasAlunos.add(7.3);
        System.out.print(notasAlunos + " ; ");
        notasAlunos.add(3.8);
        System.out.print(notasAlunos + " ; ");
        notasAlunos.add(4.0);
        System.out.println(notasAlunos + " ; ");

        System.out.println("Set exibe aleatoriamente: " + notasAlunos);

        System.out.println("Remove a nota 3.8 do set");
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        System.out.print("Retorna a quantidade de itens do set com 'SIZE' --> ");
        System.out.println(notasAlunos.size());

        System.out.println("Navega em todos os itens do ITERATOR.");

        Iterator<Double> notasIterator = notasAlunos.iterator();

        while (notasIterator.hasNext()){

            System.out.println("-->" + notasIterator.next());
        }

        System.out.println("SET está vazio?: " + notasAlunos.isEmpty());

        System.out.println("Vamos zerar o SET com CLEAR.");

        notasAlunos.clear();

        System.out.println("SET está vazio?: " + notasAlunos.isEmpty());

    }
}
