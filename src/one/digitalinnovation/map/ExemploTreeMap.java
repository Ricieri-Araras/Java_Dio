package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        System.out.println("Montando a árvore com as capitais");
        System.out.println("Entrou com RS - Porto Alegre");
        treeCapitais.put("RS", "Porto Alegre");
        System.out.println("árvore -> "+ treeCapitais);
        System.out.println("Entrou com SC - Florianópolis");
        treeCapitais.put("SC", "Florianópolis");
        System.out.println("árvore -> "+ treeCapitais);
        System.out.println("Entrou com PR - Curitiba");
        treeCapitais.put("PR", "Curitiba");
        System.out.println("árvore -> "+ treeCapitais);
        System.out.println("Entrou com SP - São Paulo");
        treeCapitais.put("SP", "São Paulo");
        System.out.println("árvore -> "+ treeCapitais);
        System.out.println("Entrou com RJ - Rio de Janeiro");
        treeCapitais.put("RJ", "Rio de Janeiro");
        System.out.println("árvore -> "+ treeCapitais);
        System.out.println("Entrou com MG- Belo Horizonte");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println("árvore -> "+ treeCapitais);

        System.out.print("Retorna a primeira Capital à esquerda ('abaixo') na Árvore com firstKey: ");
        System.out.println(treeCapitais.firstKey());

        System.out.print("Retorna a última Capital à direita ('acima') na Árvore com lastKey: ");
        System.out.println(treeCapitais.lastKey());

        System.out.print("Retorna a primeira Capital à esquerda ('abaixo') na Árvore com firstEntry + get: ");
        System.out.println(treeCapitais.firstEntry().getKey()+ " - "+ treeCapitais.firstEntry().getValue());

        System.out.print("Retorna a última Capital à direita ('acima') na Árvore com lastEntry + get: ");
        System.out.println(treeCapitais.lastEntry().getKey()+" - "+treeCapitais.lastEntry().getValue());

        System.out.println("*** Parametrização ***");
        System.out.println("árvore: " + treeCapitais);

        System.out.print("Retorna a primeira acima com higherKey (parâmetro: 'SC'): ");
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.print("Retorna a primeira abaixo com lowerKey (parâmetro: 'SC'): ");
        System.out.println(treeCapitais.lowerKey("SC"));

        System.out.print("Retorna a primeira acima com higherEntry + get (parâmetro: 'SC'): ");
        System.out.println(treeCapitais.higherEntry("SC").getKey()+" - "+treeCapitais.higherEntry("SC").getValue());

        System.out.print("Retorna a primeira abaixo com lowerEntry + get (parâmetro: 'SC'): ");
        System.out.println(treeCapitais.lowerEntry("SC").getKey()+" - "+treeCapitais.lowerEntry("SC").getValue());

        System.out.print("Remove a primeira entrada com pollFirstEntry + get: ");
        System.out.println(treeCapitais.firstEntry().getKey()+" - "+treeCapitais.pollFirstEntry().getValue());

        System.out.print("Remove a última entrada com pollLastEntry + get: ");
        System.out.println(treeCapitais.lastEntry().getKey()+" - "+treeCapitais.pollLastEntry().getValue());

        System.out.println("Árvore atualizada: "+ treeCapitais);

        System.out.println("*** Exibe Cada Capital e UF com Iterator ***");

        Iterator<String> navegador = treeCapitais.keySet().iterator();

        while (navegador.hasNext()) {

            String chave = navegador.next();
            System.out.println(treeCapitais.get(chave) + " (" + chave + ")");
        }
        System.out.println();

        Map.Entry<String, String> galhoCapital = treeCapitais.floorEntry("RT");

        System.out.println("Exibe um item da árvore salvo na variável 'galhoCapital <='RT'(parâmetro): "+ galhoCapital);

        System.out.println(treeCapitais);

        galhoCapital = treeCapitais.ceilingEntry("RT");
        System.out.println("Exibe um item da árvore salvo na variável 'galhoCapital' >= 'RT'(parâmetro): "+galhoCapital);

        System.out.println(treeCapitais);

        System.out.println("*** Navegando na árvore através do Iterator + while ***");

        while (navegador.hasNext()){

            String chave = navegador.next();
            System.out.println(chave + " - " + treeCapitais.get(chave));
        }
        System.out.print("Exibindo String da árvore com get + parâmetro 'SC': ");
        System.out.println(treeCapitais.get("SC"));

        System.out.print("Exibindo String da árvore com get + parâmetro 'ST':  \" ");
        System.out.println(treeCapitais.get("ST")+ " \" Obs.: resposta nula porque parâmetro não existe na árvores.");

        System.out.println("*** Navegando na árvore através do FOREACH comum ***");

        for (String estado: treeCapitais.keySet()) {

            System.out.println(estado + " - " + treeCapitais.get(estado));
        }

        System.out.println("*** Navegando na árvore através do FOREACH + Map.Entry + entrySet ***");

        for (Map.Entry<String, String> capital: treeCapitais.entrySet()) {

            System.out.println(capital.getKey() + " - " + capital.getValue());
        }

        System.out.println("IMPRIMINDO COM 'descendingKeySet: " + treeCapitais.descendingKeySet());

        System.out.println("IMPRIMINDO COM 'descendingMap'  : " + treeCapitais.descendingMap());

        System.out.println("IMPRIMINDO COM 'navigableKeySet': " + treeCapitais.navigableKeySet());

        treeCapitais.replace("SC","Florianópolis", "Surf Island");

        System.out.println("Mudança no nome da Capital de'SC' para 'Surf Island' com 'replace");
        System.out.println("Árvore : " + treeCapitais);

        System.out.println("*** Apagar Árvore com 'clear' ***");
        treeCapitais.clear();

        System.out.println("Árvore vazia: " + treeCapitais);
    }
}
