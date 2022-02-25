
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
	
		return pedido.getProdutos().stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO) )
				.collect(Collectors.toList());
	}

}
