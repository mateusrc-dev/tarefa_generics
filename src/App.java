import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String args[]) {
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Civic());
		carros.add(new Corolla());
		
		imprimirCarros(carros);
	}

	private static void imprimirCarros(List<? extends Carro> carros) {
		for (Carro carro : carros) {
			System.out.println(carro);
		}
	}
}
