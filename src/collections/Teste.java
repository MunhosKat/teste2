package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {
//
	public static void main(String[] args) {

		// Objetos tipo Usuario.
		Usuario matheus = new Usuario(1, "Matheus", "123");
		Usuario henrique = new Usuario(2, "Henrique", "123");
		Usuario joao = new Usuario(3, "Joao", "123");
		Usuario miguel = new Usuario(4, "Miguel", "123");
		Usuario emilia = new Usuario(5, "Emilia", "123");

		// Collection (lista de usuarios).

		List<Usuario> listaUsuarios = new ArrayList<Usuario>();

		// Adicionando objetos Usuario a lista de Usuario.
		listaUsuarios.add(emilia);
		listaUsuarios.add(miguel);
		listaUsuarios.add(henrique);
		listaUsuarios.add(matheus);
		listaUsuarios.add(joao);

		System.out.println("----------------------");

		// iterando a lista
		for (Usuario usuario : listaUsuarios) {
			System.out.println("ID: " + usuario.getIdUsuario() + " Nome: " + usuario.getNome());

		}

		System.out.println("----------------------");

		// Ordenar a lista conforme a regra definida no compareTo
		Collections.sort(listaUsuarios);

		// iterando a lista ordenada
		for (Usuario usuario : listaUsuarios) {
			System.out.println("ID: " + usuario.getIdUsuario() + " Nome: " + usuario.getNome());

		}

		System.out.println("----------------------");

		Map mapa = new HashMap();
		mapa.put("emilia", emilia);

		Object objeto = mapa.get("emilia");
		Usuario usuario = (Usuario) objeto;
		System.out.println(usuario.getNome());
		
		
		
		
		

	}

}
