import java.util.ArrayList;

public class Agencia {
	private String nome;
	private ArrayList<Cliente> clientes;
	
	public Agencia() {
		
	}
	

	public Agencia(String nome) {
		super();
		this.nome = nome;
		this.clientes = new ArrayList<>();
	}


	public String getNome() {
		return nome;
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public boolean novoCliente(String nomeCliente, double valorTransacaoInicial) {
		Cliente clienteLocalizado = buscarCliente(nomeCliente);
		if(clienteLocalizado != null) {
			return false;
		}
		Cliente novoCliente = new Cliente(nomeCliente, valorTransacaoInicial);
		clientes.add(novoCliente);
		return true;
		
	}

	public boolean adicionarTransacaoCliente(String nomeAgencia, double valorTransacao) {
		Cliente verificarTransacaoCliente = buscarCliente(nomeAgencia);
		if(verificarTransacaoCliente == null) {
			return false;
		}
		verificarTransacaoCliente.adicionarTransacao(valorTransacao);	
		return true;
		
		
	}
	
	public Cliente buscarCliente(String nomeCliente) {
		for(int i = 0; i < this.clientes.size(); i++) {
			if(clientes.get(i).getNome().equals(nomeCliente)) {
				return clientes.get(i);
			}
		}
		return null;
		
	}	
	
}
