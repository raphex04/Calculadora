package calculos;

public class Principal {

	public static void main(String[] args) {
		adicionar adicionar = new adicionar();
		System.out.println(adicionar.somar(37, 98));
		
		subtrair subtrair = new subtrair();
		System.out.println(subtrair.sub(53, 21));
		
		Calcular calcular = new Calcular();
		System.out.println(calcular.div(25, 5));
		System.out.println(calcular.mult(6, 3));
		
		Exp expo = new Exp();
		System.out.println(expo.exp(9, 7));

	}

}