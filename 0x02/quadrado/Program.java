
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Quadrado.area(5, 8));
		try {
            double lado1 = -5;
            double resultado = Quadrado.area(lado1);
            System.out.println(resultado);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            double lado2 = 3;
            double resultado = Quadrado.area(lado2);
            System.out.println(resultado);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
	}

}
