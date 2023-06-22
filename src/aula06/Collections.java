package aula06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Matheus");
		lista.add("Henrique");
		lista.add("Joao");
		lista.add("Cintia");
		lista.add("Fernando");
		
		List<Usuario> list = new ArrayList<Usuario>();
		Usuario matheus = new Usuario("Matheus","123");
		Usuario henrique = new Usuario("Henrique","123");
		Usuario joao = new Usuario("Joao","123");
		
		list.add(matheus);
		list.add(henrique);
		list.add(joao);
		
		
		
		for (String string : lista ) {
			System.out.println(string + "\t");
		}
		
		System.out.println("");
		
		for (Usuario usuario : list) {
			System.out.println(usuario.getNome());
		}
		
		
		
		
	}
	
	
	
}
