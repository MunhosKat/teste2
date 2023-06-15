package aula03;

import java.util.Date;

public abstract class Conta { // abstract usado na classe, proibe a instancia da classe

	// atributos
	protected int numeroConta, agencia;
	protected String senha;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente; // composicao //private encapsulamento
	private static long contador;

	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {
		// atributos
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.senha = senha;
		contador++;
		System.out.println("Conta criada");
		System.out.println("Data abertura: " + this.dataAbertura);
	}

	public Conta(Cliente cliente2, long numeroConta2) {
		// TODO Auto-generated constructor stub
	}

	// METODOS
	// Sacar
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}

		}
		return false;
	}

	// Depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// ConsultarSaldo /abstract força a classe filha reescrever o metodo
	public abstract void exibirSaldo();

	// this é o objeto que esta chamando o metodo
	// Tranferencia
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}

	}

	public static void exibirContador() {
		System.out.println("Contas: " + contador);
	}
	
	
	
	
	
	
	
}
