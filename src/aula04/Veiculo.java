package aula04;

import java.util.Date;

public class Veiculo {
	
	protected String numeroSerie, cor, placa, porte, modelo;
	protected Date dataFabricacao;
	protected int statusVeiculo;
	protected double limiteVeiculo, valorVeiculo,velocidadeVeiculo;
	private static long contador;

	
	public Veiculo(String numeroSerie,String placa, String porte,String modelo) {
		//apagar o SUPER
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
		this.placa = placa;
		this.porte = porte;
		this.dataFabricacao = new Date(System.currentTimeMillis());
		contador++;
	}
	

	public boolean statusVeiculo(int valor) {
		if (valor == 1) {
			if (this.statusVeiculo < valor) {
				this.statusVeiculo -= valor;
				return true;
			}

		}
		return false;
	}
	
	
	
	
	
	
	
	public static void exibirContador() {
		System.out.println(contador);
	}
	
	
	
	
}