import java.util.TreeMap;

public class AnalisadorFrase {

	public static TreeMap<String, Integer> contagemPalavras(String frase) {
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		String[] contagem = frase.split(" ");
		
		int qtdPalavras = 0;
		
		for(int i=0; i<contagem.length; i++) {
			for(int x=0; x<contagem.length; x++) {
				if(contagem[i].equalsIgnoreCase(contagem[x])) {
					qtdPalavras++;
				}
			}
			map.put(contagem[i].toLowerCase(), qtdPalavras);
			qtdPalavras = 0;
		}
		
		return map;
	}

}

/*
 *  Crie a classe AnalisadorFrase que contenha o método estático contagemPalavras que retorne TreeMap, de forma que o elementos fiquem ordenados pela chave, com cada uma das palavras como chave e a quantidade de suas ocorrências na frase.

	A contagem não deve ser case-sensitive, ou seja, uma palavra em maiúsculo deve ser considerada a mesma palavra se em outra ocorrência ela aparece em minúsculo.

	Trate os caracteres especiais: ?, . e !

 * */
