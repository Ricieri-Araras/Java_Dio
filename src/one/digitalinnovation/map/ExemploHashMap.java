package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        System.out.println("Adiciona os Campeões Mundiais da Fifa no Mapa");
        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanhã", 4);
        campeoesMundialFifa.put("Itália" , 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println("HashMap: " + campeoesMundialFifa);

        System.out.println("Atualizar o valor da chave (títulos) Brasil");
        campeoesMundialFifa.put("Brasil" , 6);

        System.out.println("Atualizada: " + campeoesMundialFifa);

        System.out.print("Retorna títulos da Argentina: --> ");
        System.out.println(campeoesMundialFifa.get("Argentina"));

        System.out.print("Retorna se existe a campeã: França: --> ");
        if (campeoesMundialFifa.containsKey("França")){
            System.out.println("Sim, a França é uma das seleções Campeãs do Mundo!!!");
        } else {
            System.out.println("Não, a França não está mais na Lista das Campeâs");
        }

        System.out.print("Remove a campeã França: --> ");
        System.out.println(campeoesMundialFifa.remove("França"));

        System.out.print("Retorna se existe a campeã: França: --> ");
        System.out.println(campeoesMundialFifa.containsKey("França"));

        System.out.print("Retorna ou não se existe alguma seleção Hexa-campeã: -> ");
        System.out.println(campeoesMundialFifa.containsValue(6));

        System.out.print("Retorna o Tamanho do MAP: --> ");
        System.out.println(campeoesMundialFifa.size() + " Seleções.");

        System.out.println("Navegar nos Registros do Mapa com For - Map.Entry");
        for (Map.Entry<String , Integer>  entrada : campeoesMundialFifa.entrySet()){

            System.out.println(entrada.getKey() + " -- " + entrada.getValue());
        }
        
        System.out.println("Navegar nos Registros do Mapa com Foreach");
        for (String key: campeoesMundialFifa.keySet()){

            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        System.out.print("Verificando se o Mapa contém a chave 'Estados Unidos': --> ");
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        System.out.print("Verificando se o Mapa contém o valor '5': --> ");
        System.out.println(campeoesMundialFifa.containsValue(5));

        System.out.println("Verificando o Tamanho antes e depois de limpar o Mapa: ");

        System.out.println("Tamanho antes: " + campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println("Tamanho depois: " + campeoesMundialFifa.size());
    }
}
