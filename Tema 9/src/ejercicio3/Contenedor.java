package ejercicio3;

import java.util.ArrayList;

public class Contenedor {
	public boolean comparar(ArrayList<String> c, String nombre) {
		boolean norepe = true;
		for(int i = 0; i<c.size(); i++) {
			if(nombre.equals(c.get(i))) {
				norepe = false;
			}
		}
		return norepe;
	}
}
