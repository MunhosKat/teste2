package aula04;

public class Caminhao extends Veiculo{

    private int controlarJanela;
    private int controlarCarga;
	public Caminhao(Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo) {
		super(motor, pneu, transmissao, numeroSerie, placa, porte, modelo);
	}
		
		//Métodos
	public boolean controlarCarga(int valor1) {
		controlarJanela = valor1;

		if (valor1 == 1) {
			System.out.println("Carregando");
			return true;

		} else {
			System.out.println("Descarregando");
			return false;
		}
	}		
	
		public boolean controlarJanela(int valor) {
			controlarJanela = valor;

			if (valor == 1) {
				System.out.println("Levantando a janela");
				return true;

			} else {
				System.out.println("abaixando a janela");
				return false;
			}	
	}

}
