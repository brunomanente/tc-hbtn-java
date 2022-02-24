import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate) {
		
		return produtos.stream().filter(t -> predicate.test(t)).toList();
	}

}
