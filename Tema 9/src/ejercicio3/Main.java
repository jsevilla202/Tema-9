package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		Contenedor c = new Contenedor();
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		while(!nombre.equals("fin")) {
			System.out.print("Inserte un nombre en la lista: ");
			nombre = sc.next();
			if(!nombre.equals("fin") && c.comparar(al, nombre)) {
				al.add(nombre);
			}
		}
		
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}

}
