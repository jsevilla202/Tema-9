package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numero = new int[5];
		int[] estrella = new int[2];
		int num;
		int i = 0;
		int respuesta = 0;
		Comprobar comprobar = new Comprobar();
		List<List<Integer>> numeros = new ArrayList<>();
		List<List<Integer>> estrellas = new ArrayList<>();

		for (int k = 0; k < 2; k++) {
			List<Integer> cantidad1 = new ArrayList<>();
			List<Integer> cantidad2 = new ArrayList<>();
			for (int j = 0; j < 50; j++) {
				cantidad1.add(0);
				if(i<12) {
					cantidad2.add(0);
				}
			}
			numeros.add(cantidad1);
			if (k < 12) {
				estrellas.add(cantidad2);
			}
		}

		Scanner sc = new Scanner(System.in);
		while (respuesta != 4) {
			System.out.print("Bienvenid@ a la loteria\n=======================\n 1. Introducir boleto\n "
					+ "2. Ver los numeros más tocados\n 3. "
					+ "Ver las estrellas más tocadas\n 4. Salir\n¿Qué desea hacer? ");
			respuesta = sc.nextInt();
			switch (respuesta) {
			case 1:
				i = 0;
				while (i < 5) {
					System.out.print("Inserte el numero: ");
					num = sc.nextInt();
					if (num > 0 && num < 51) {
						if (comprobar.compruebanum(numero, num)) {
							numero[i] = num;
							if (comprobar.comprueba(numeros, num)) {
								numeros.get(0).set(num - 1, num);
								numeros.get(1).set(num - 1, 1);
							} else {
								numeros = comprobar.incremento(numeros, num);
							}
							i++;
						} else {
							System.out.println("ERROR: Numero introducido repetido");
						}
					} else {
						System.out.println("ERROR: Valor introducido fuera de limites");
					}
				}
				i = 0;

				while (i < 2) {
					System.out.print("Inserte el numero estrella: ");
					num = sc.nextInt();
					if (num > 0 && num < 13) {
						if (comprobar.compruebanum(estrella, num)) {
							estrella[i] = num;
							if (comprobar.comprueba(estrellas, num)) {
								estrellas.get(0).set(num - 1, num);
								estrellas.get(1).set(num - 1, 1);
							} else {
								estrellas = comprobar.incremento(estrellas, num);
							}
							i++;
						} else {
							System.out.println("ERROR: Numero introducido repetido");
						}
					} else {
						System.out.println("ERROR: Valor introducido fuera de limites");
					}
				}

				for (int j = 0; j < numero.length; j++) {
					numero[j] = 0;
				}

				for (int j = 0; j < estrella.length; j++) {
					estrella[j] = 0;
				}
				break;
			case 2:
				int nummastocado = comprobar.mastocado(numeros) + 1;
				System.out.println("El número que más ha tocado es " + nummastocado + " tocando un total de "
						+ numeros.get(1).get(nummastocado - 1));
				break;
			case 3:
				int esmastocado = comprobar.mastocado(estrellas) + 1;
				System.out.println("La estrella que más ha tocado es " + esmastocado + " tocando un total de "
						+ estrellas.get(1).get(esmastocado - 1));
			case 4:
				break;
			default:
				System.out.println("ERROR: Valor introducido no valido");
				break;
			}
		}
		sc.close();
	}

}
