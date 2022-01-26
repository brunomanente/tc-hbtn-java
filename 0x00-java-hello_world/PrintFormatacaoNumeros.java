import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {

	public static void main(String[] args) {
		float taxa = 0.2456f;
        float valor = 7654.321f;       
        System.out.printf("Valor: " + String.format("R$ %, .2f",valor) + "\nTaxa: %.2f%%\n", taxa);
        //System.out.print(NumberFormat.getCurrencyInstance().format(valor) + '\n');
        //System.out.printf("Taxa: " + "%.2f%%", taxa);
	}

}
