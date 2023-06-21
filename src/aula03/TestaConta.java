package aula03;

import java.text.ParseException;
import java.util.Date;

public class TestaConta {

	public static void main(String[] args) throws ParseException, SaldoInsuficiente {
		
		CDB CDB = new CDB();
		LCA LCA = new LCA();
		LCI LCI = new LCI();
		//CLASSE É A RECEITA DO BOLO / PROJETO
		
		
		
		//objetos
		Cliente clienteMatheus = new Cliente("Matheus","46834155555","20/12/2005","123456", "bom jesus da lapa");
		Cliente clienteHenrique = new Cliente("Henrique","46834144444","02/12/2003","123556", "bom jesus da lapa");
		
		ContaCorrente contaMatheus = new ContaCorrente(clienteMatheus, 1, 1, "teste");
		ContaCorrente contaHenrique = new ContaCorrente(clienteHenrique, 2, 1, "teste");
		
		
		contaMatheus.depositar(320);
	//	contaMatheus.exibirSaldo();
		try {
			contaMatheus.investimento(CDB, 100);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		
		try {
			contaMatheus.sacar(200);
		} catch (SaldoInsuficiente e1) {
			e1.printStackTrace();
		}
		
		
		contaMatheus.exibirSaldo();
		
	
		
		
		

	}
	
}
