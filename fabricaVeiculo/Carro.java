package fabricaVeiculo;

public class Carro extends Veiculo {
	private int janela = 1;
	private int portaMalas = 1;
	private int capo = 1;// começa como 1 pois está fechado.



	public Carro(String cor,Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo, double limiteVeiculo, int capo, int portaMalas, int janela) {
		super(cor, motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo);
		this.janela = janela;
		this.portaMalas = portaMalas;
		this.capo = capo;
	}

	// janela = 0 aberta/ 1 = fechada.
		public void abrirJanela() {
			if (janela == 1) {
				System.out.println("A janela abriu.");
				janela = 0;
			}else {
			System.out.println("A janelá já está aberta, nada aconteceu.");
			}
		}

		public void fecharJanela() {
			if (janela == 0) {
				System.out.println("A janela fechou.");
				janela = 1;
			} else {
				janela = 1;
				System.out.println("A janela já estava fechada, nada aconteceu.");
			}
		}

	public void abrirPortaMalas() {
		//arrumar

		if (portaMalas == 1) {
			System.out.println("Abrindo porta malas ");
			portaMalas = 0;

		} else {
			System.out.println("O porta malas já está aberto.");
		}
	}
	
	public void fecharPortaMalas() {
		if (portaMalas == 0) {
			System.out.println("Fechado porta malas ");
			portaMalas = 1;

		} else {
			System.out.println("O porta malas já está fechado.");
		}
	}

	public void abrirCapo() {
		if (capo == 1) {
			System.out.println("Abrindo capô ");
			capo = 0;
			
		} else {
			System.out.println("o capô já está aberto.");
			
		}

	}
	
	public void fecharCapo() {
		if (capo == 0) {
			System.out.println("fechando capô ");
			capo = 1;
			
		} else {
			System.out.println("o capô já está fechado.");
			
		}

	}

	public void exibirDadosVeiculo() {
		System.out.println(getModelo());
	}

}
