import java.util.List;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
		
		return produtos.stream().filter(t -> criterioFiltro.testar(t)).toList();
	}

}
