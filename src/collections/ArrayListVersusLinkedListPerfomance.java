package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ArrayListVersusLinkedListPerfomance {

	public static void main(String[] args) {

		Collection<Long> lista = new ArrayList <Long>();

		long inicio = System.currentTimeMillis();

		for (long i = 0; i <= 999999999; i++) {
			lista.add(i);
		}

		long fim = System.currentTimeMillis();

		long tempoGasto = fim - inicio;
		
		System.out.println(tempoGasto);
	}

}
