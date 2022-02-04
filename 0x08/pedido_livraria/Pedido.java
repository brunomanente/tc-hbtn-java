
public class Pedido{
	private int percentualDesconto;
	private ItemPedido[] itens;
	
	
	public Pedido(int percentualDesconto, ItemPedido[] itens) {
		super();
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}
	

	public int getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(int percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public void setItens(ItemPedido[] itens) {
		this.itens = itens;
	}

	public ItemPedido[] getItens() {
		return itens;
	}

	
	public double calcularTotal() {
		double xx = 0;
		for (ItemPedido itemPedido : itens) {
			xx += (itemPedido.getProduto().obterPrecoLiquido(itemPedido.getProduto().getPrecoBruto())*itemPedido.getQuantidade());
		}
		
		return xx - (xx * percentualDesconto / 100 );
	}
	
	
	
}
