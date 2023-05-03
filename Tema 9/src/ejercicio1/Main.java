package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Contenedor<Integer> c = new Contenedor<>();
		
		for(int i = 0; i<10; i++) {
			c.guardar((int) (Math.random()*100));
			int n = c.extraer();
			System.out.println(n);
		}
	}

}
