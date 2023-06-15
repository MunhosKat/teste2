package aula03;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

//javabens
public class Cliente {
	//atributos
	private String nomeTitular, cpfTitular, rgTitular, enderecoTitular;
	private final Date dataNasc;
	
	//constructor vazio
	// this se refere ao atributo
	public Cliente() {
		this.dataNasc = new Date();
		
	}
	
	
	//constructor --> metodo para instanciar um objeto
	public Cliente(String nomeTitular, String cpfTitular, String dataNasc, String rgTitular, String enderecoTitular) throws ParseException {
		
		
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");
		this.dataNasc = formato.parse(dataNasc);
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
	}

	// getters / setters
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}

}

