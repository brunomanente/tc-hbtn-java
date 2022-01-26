import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {

	public static void main(String[] args) {
		float taxa = 0.2456f;
        float valor = 7654.321f; 
        Locale moeda = new Locale("pt","BR");
        String valorAFormatar = NumberFormat.getCurrencyInstance(moeda).format(valor);
        System.out.printf("Valor: " + valorAFormatar + '\n');
        //System.out.print(NumberFormat.getCurrencyInstance().format(valor) + '\n');
        System.out.printf("Taxa: " + "%.2f%%", taxa);
	}

}
