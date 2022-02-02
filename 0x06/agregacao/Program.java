import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		Endereco endereco = new Endereco("Rua Marechal Deodoro",
                "135",
                "",
                "Santo Amaro",
                "Sao Paulo",
                "SP",
                "Brasil");

        Empregado empregado = new Empregado("Jane Doe", 1, endereco);

        empregado.apresentar();

        System.out.println();

	}

}
