package ejercicio1;

public class Contenedor<T> {
	private T objeto;
	public Contenedor() {}
	
	public void guardar(T nuevo) {
		objeto = nuevo;
	}
	T extraer() {
		T res = objeto;
		objeto = null;
		return res;
	}
}
