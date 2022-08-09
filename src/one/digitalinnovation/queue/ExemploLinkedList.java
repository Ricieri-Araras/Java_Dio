package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("Fila no Banco: " + filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println("Cliente a ser atendido (POLL - REMOVE): " + clienteASerAtendido);

        String proximo = filaBanco.peek();

        System.out.println("Próximo cliente (PEEK - NÃO REMOVE): " + proximo);

        System.out.println("Fila no Banco: " + filaBanco);

        System.out.println("Adiciona 'Daniel na Fila");

        filaBanco.add("Daniel");

        System.out.println(filaBanco);

        System.out.print("Verifica se 'Carlos' está na Fila:--> ");

        System.out.println(filaBanco.contains("Carlos"));

        System.out.println("*** Fila com FOR ***");
        for (String cliente: filaBanco){

            System.out.println("-> " + cliente);
        }

        System.out.println("*** Fila com ITERATOR ***");
        Iterator<String> iterator = filaBanco.iterator();

        while(iterator.hasNext()){

            System.out.println("--> " + iterator.next());
        }

        System.out.println("Elementos na Fila com SIZE: " + filaBanco.size());

        System.out.println("Verifica Fila Vazia com 'isEMPTY': " + filaBanco.isEmpty());

        System.out.println("* Esvazia a fila com CLEAR *");

        filaBanco.clear();

        System.out.println("Verifica Fila Vazia com 'isEMPTY': " + filaBanco.isEmpty());

        proximo = filaBanco.peek();

        System.out.println("Próximo cliente com peek: " + proximo + " -  Obs.: 'peek' aponta fila vazia com null.");

        System.out.println(" Obs.: Abaixo 'element' aponta erro 'Exception' de fila vazia.");

        String proximoClienteOuErro = filaBanco.element();



        System.out.println("Próximo Cliente com fila vazia: " + proximoClienteOuErro);

    }
}
