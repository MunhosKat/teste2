package aula04;

import java.util.Date;

public class Veiculo {

	protected String numeroSerie, cor, placa, porte, modelo;
	protected Date dataFabricacao;
	protected int statusVeiculo;
	protected double limiteVeiculo, valorVeiculo, velocidadeVeiculo;
	private static long contador;

	public Veiculo(String numeroSerie, String placa, String porte, String modelo) {
		// apagar o SUPER
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
		this.placa = placa;
		this.porte = porte;
		this.dataFabricacao = new Date(System.currentTimeMillis());
		contador++;
	}

	public boolean statusVeiculo(int valor) {
		statusVeiculo = valor;

		if (valor == 1) {
			return true;

		}
		return false;

	}

	public double acelerar(double acelerar) {

		if (statusVeiculo == 1) {
			if (acelerar > 0) {
				this.velocidadeVeiculo = acelerar;
			}
		}
		System.out.println(velocidadeVeiculo + " KM/H");
		return acelerar;

	}

	public double freiar(double freiar) {

		if (velocidadeVeiculo > 0) {
			velocidadeVeiculo -= freiar;
		}
		System.out.println(velocidadeVeiculo + " KM/H");
		return freiar;

	}
	
	
	
	public static void exibirDados() {
		try {
			System.out.println();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void exibirContador() {
		System.out.println(contador);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

}