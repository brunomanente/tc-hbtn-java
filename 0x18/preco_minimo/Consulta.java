
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
	
		return pedido.getProdutos().stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO) )
				.collect(Collectors.toList());
	}

	public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
	
		return produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().orElse(null);
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {	
		
		return produtos.stream().filter(t -> t.getPreco() >= precoMinimo).collect(Collectors.toList());	
				
	}

}
