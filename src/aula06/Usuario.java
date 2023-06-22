package aula06;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private Date dataCadastro;
	private List<Usuario> list = new ArrayList<Usuario>();

	public Usuario(String nome, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}

	public static void main(String[] args) {
		// VETOR PARA GUARDAR OBJETOS DO TIPO USUARIO
		Usuario usuario[] = new Usuario[2];
		usuario[0] = new Usuario("Jose", "root");
		usuario[1] = new Usuario("Maria", "root");

		for (int i = 0; i < usuario.length; i++) {
			System.out.print(usuario[i].getNome() + "  ");

		}

		for (Usuario usuario1 : usuario) {
			System.out.println("Nome: " + usuario1.getNome());
			System.out.println("Data de cadastro: " + usuario1.getDataCadastro());
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return list;
	}

}
