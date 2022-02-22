import java.util.ArrayList;
import java.util.Comparator;
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
		for (Post post : posts) {
			if(post.getAutor().equals(postagem.getAutor()) && post.getTitulo().equals(postagem.getTitulo())) {
				throw new IllegalArgumentException("Postagem jah existente");
			}
		}
		posts.add(postagem);
	}


	public Set<Autor> obterTodosAutores() {
		Set<Autor> autores = new TreeSet<>();
		
		for(Post post : posts) {
			Autor nome = post.getAutor();
			autores.add(nome);
		}
		return autores;
	}
	
	
	
	public Map<Categorias, Integer> obterContagemPorCategoria() {
		 Map<Categorias, Integer> map = new TreeMap<>();
		 
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

	public Set<Post> obterPostsPorCategoria(Categorias categoria) {
		Set<Post> postCategoria = new TreeSet<>();
		
		posts.sort(Comparator.comparing(Post::getTitulo));
		
		for (Post post : posts) {
			if(post.getCategoria().equals(categoria)){
				postCategoria.add(post);
			}
		}
		
		return postCategoria;
	}
	
	public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> postAutor = new TreeSet<>();
		
		posts.sort(Comparator.comparing(Post::getTitulo));
		
		for (Post post : posts) {
			if(post.getAutor().equals(autor)){
				postAutor.add(post);
			}
		}
		
		return postAutor;
	}

	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
		Map<Categorias, Set<Post>> mapCategorias =  new TreeMap<>();
		
		
		for (Post post : posts) {
			Set<Post> setposts;
			if(mapCategorias.containsKey(post.getCategoria())) {
				setposts = mapCategorias.get(post.getCategoria());
			}else {
				setposts = new TreeSet<>();
			}
			setposts.add(post);
			mapCategorias.put(post.getCategoria(), setposts);
		}
		
		return mapCategorias;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Map<Autor, Set<Post>> mapAutor =  new TreeMap<>();
		
		
		for (Post post : posts) {
			Set<Post> setposts;
			if(mapAutor.containsKey(post.getAutor())) {
				setposts = mapAutor.get(post.getAutor());
			}else {
				setposts = new TreeSet<>();
			}
			setposts.add(post);
			mapAutor.put(post.getAutor(), setposts);
		}
		
		return mapAutor;
	}
	
	
	
}