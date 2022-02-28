package listas;

import java.util.ArrayList;
import java.util.List;

/*• Tamanho da lista: size()
• Obter o elemento de uma posição: get(position)
• Inserir elemento na lista: add(obj), add(int, obj)
• Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
• Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
• Filtrar lista com base em predicado:
List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
• Encontrar primeira ocorrência com base em predicado:
Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null); */

public class Exemplo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add(2, "Marco");
		list.remove("Maria");
	
		
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		list.removeIf(x -> x.charAt(0)== 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		System.out.println("index of Bob : "+ list.indexOf("Bob"));
		
		
		
	}

}















