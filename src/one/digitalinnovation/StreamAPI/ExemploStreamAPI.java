package one.digitalinnovation.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        // Cria a colecão de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adiciona estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("João");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        estudantes.add("Miguel");
        estudantes.add("Gabriel");
        estudantes.add("Ariel");

        System.out.println(estudantes);

        // Retorna a contagem do elementos do stream;
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com maior número de letras
        System.out.println("Maior nome: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor número de letras
        System.out.println("Menor nome: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos com letra R no nome

        System.out.println("Nomes com letra 'R': " + estudantes.stream().filter((estudante) ->
            estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map( estudante  ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os três primeiros elementos da coleção
        System.out.println("Retorna os três primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: com peek ");
        System.out.println(estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: com forEach ");
        estudantes.stream().forEach(System.out::println);

        // Retorna 'true' se todos os elementos possuem a letra W no nome
        System.out.println("Todos os nomes tem a letra 'W'? :  " + estudantes.stream().allMatch((elemento) ->
                elemento.contains("W")));

        // Retorna 'true' se algum elemento possui a letra 'a' minúscula no nome
        System.out.println("Tem algum elemento com 'a - minúsculo' no nome? : " + estudantes.stream().anyMatch((elemento) ->
                elemento.contains("a")));

        // Retorna 'true' se nenhum elemento possui a letra 'a' minúscula no nome
        System.out.println("Não tem nenhum elemento com 'a - minúsculo' no nome?: " + estudantes.stream().noneMatch((elemento) ->
                elemento.contains("a")));

        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.print("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada: com toList ");
        System.out.println(estudantes.stream()
                //.peek(System.out::println)  *** obs.: comentar evita que se exiba a lista vertical com todos os elementos
                .map(estudante ->
                     estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                //.peek(System.out::println)
                .filter((estudante) ->
                         estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada: com groupingBy ");
        System.out.println(estudantes.stream()
                //.peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                //.peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.groupingBy(estudante ->
                                                estudante.substring(estudante.indexOf("-") + 1 ))));

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada: com joining");
        System.out.println(estudantes.stream()
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                //.peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.joining(", ")));

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada: com toSet");
        System.out.println(estudantes.stream()
                //.peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                //.peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toSet()));


    }
}
