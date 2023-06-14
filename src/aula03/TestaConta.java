package aula03;

import java.util.Date;

public class TestaConta {

	public static void main(String[] args) {
		
		CDB CDB = new CDB();
		LCA LCA = new LCA();
		LCI LCI = new LCI();
		
		
		
		
		//objetos
		Cliente matheus = new Cliente("Matheus","46834155555","123456", "bom jesus da lapa");
		Cliente henrique = new Cliente("Henrique","46834144444","123556", "bom jesus da lapa");
		
		ContaCorrente contaMatheus = new ContaCorrente(matheus, 1, 1, "teste");
		ContaCorrente contaHenrique = new ContaCorrente(henrique, 2, 1, "teste");
		
		contaMatheus.depositar(10000);
		contaHenrique.depositar(9000);
		
		contaMatheus.exibirSaldo();
		contaHenrique.exibirSaldo();
		
		contaMatheus.sacar(5000);
		contaHenrique.sacar(3000);
		
		contaMatheus.exibirSaldo();
		contaHenrique.exibirSaldo();
		
		contaHenrique.transferir(contaMatheus, 1000);
		
		contaMatheus.exibirSaldo();
		contaHenrique.exibirSaldo();
		contaMatheus.exibirSaldo();
		
		Conta.exibirContador();
		
		contaMatheus.investimento(CDB,500 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
}
