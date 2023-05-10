package ejercicio5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int eleccion = -1;
		String nombre;
		double valor;
		Map<String, Double> productos = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while (eleccion != 0) {
			System.out.print("Base de Productos\n=================\n 1. Alta de producto\n" + " 2. Baja de producto\n"
					+ " 3. Listar existencias\n" + " 0. Salir\n" + "¿Qué desea hacer? ");
			eleccion = sc.nextInt();
			sc.nextLine();
			switch (eleccion) {
			case 1:
				System.out.print("Inserte el nombre del producto: ");
				nombre = sc.nextLine();
				if (productos.containsKey(nombre)) {
					System.out.println("ERROR: El producto ya está en la base de datos");
				} else {
					System.out.print("Inserte el valor del producto: ");
					valor = sc.nextDouble();
					productos.put(nombre, valor);
					System.out.println("Producto añadido");
				}
				break;
			case 2:
				System.out.print("Inserte el nombre del producto: ");
				nombre = sc.nextLine();
				sc.nextLine();
				if (!productos.containsKey(nombre)) {
					System.out.println("ERROR: El producto no existe en la base de datos");
				} else {
					productos.remove(nombre);
					System.out.println("Producto eliminado");
				}
				break;
			case 3:
				System.out.println();
				for (HashMap.Entry<String, Double> entry : productos.entrySet()) {
					System.out.printf("Nombre: %s Valor: %.2f\n", entry.getKey(), entry.getValue());
					System.out.println();
				}
				break;
			case 0:
				System.out.println("Saliendo......");
				break;
			}
			System.out.println();
		}
		sc.close();
	}

}