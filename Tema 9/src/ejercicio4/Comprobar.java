package ejercicio4;

import java.util.List;

public class Comprobar {
	public boolean comprueba(List<List<Integer>> numeros, int numero) {
		boolean repe = false;
		for(int i = 0; i<numeros.get(0).size() && numeros.get(0).get(i) != numero; i++) {
			if(numeros.get(0).get(i) == numero) {
				repe = true;
			}
		}
		return repe;
	}
	
	public List<List<Integer>> incremento(List<List<Integer>> numeros, int pos) {
		List<List<Integer>> tempo = numeros;
		int temp;
		temp = tempo.get(1).get(pos-1) + 1;
		tempo.get(1).set(pos-1, temp);
		return tempo;
	}
	
	public boolean compruebanum(int[] array, int num) {
		boolean norepe = true;
		int i = -1;
		do {
			i++;
			if(array[i] == num) {
				norepe = false;
			}
		}while(i<array.length-1 && array[i] != num);
		return norepe;
	}
	
	public int mastocado(List<List<Integer>> numeros) {
		int mas = numeros.get(1).get(0);
		int pos = 0;
		for(int i = 0; i<numeros.get(1).size()-1; i++) {
			if(mas<numeros.get(1).get(i+1)) {
				mas = numeros.get(1).get(i+1);
				pos = i+1;
			}
		}
		return pos;
	}
}
