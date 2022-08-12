package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);



        System.out.println("Remove o estudante no índice 'Pedro'");

        estudantes.remove("Pedro");

        System.out.println(estudantes);

        System.out.print("Recupera idade do estudante no índice 'Mariana': ");
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        System.out.print("Quantidade de estudantes na Table: ");
        System.out.println(estudantes.size());

        System.out.println("Navega nos Registros do Mapa");

        for (Map.Entry<String, Integer>  entrada : estudantes.entrySet()){
            System.out.println(entrada.getKey() + " -- " + entrada.getValue());
        }

        System.out.println("Navega nos Registros da Key");

        for (String chave : estudantes.keySet()){
            System.out.println(chave + " -- " + estudantes.get(chave));
        }

        System.out.println(estudantes);
    }
}
