

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
	
	//lista de postagem
	private List<Post> posts;
	
	
	public Blog() {
		posts = new ArrayList<>();
	}
	
	//adicionarPostagem: recebe uma postagem e adiciona a lista de postagens
	public void adicionarPostagem(Post postagem ) {
		posts.add(postagem);
	}

	//obterTodosAutores: que retorna um Set
	//com todos autores que possuem pelo menos um post no blog 
	//e deve-se retornar a lista de autores ordenados pelo nome.
	public Set<String> obterTodosAutores() {
		Set<String> autores = new TreeSet<>();
		
		for(Post post : posts) {
			String nome = post.getAutor();
			autores.add(nome);
		}
		return autores;
	}
	
	
	//que retorna um Map onde a chave é o nome da categoria,
	//o valor é a quantidade de postagens daquela categoria,
	//deve-se retornar os conjuntos ordenados pelo nome da categoria
	public Map<String, Integer> obterContagemPorCategoria() {
		 Map<String, Integer> map = new TreeMap<>();
		 
		 int total = 0;
			
			for(int i=0; i< posts.size(); i++) {
				for(int x=0; x<posts.size(); x++) {
					if(posts.get(i).getCategoria().equals(posts.get(x).getCategoria())) {
						total++;
					}
				}
				map.put(posts.get(i).getCategoria(), total);
				total = 0;
			}
		
		return map;
	}
}
