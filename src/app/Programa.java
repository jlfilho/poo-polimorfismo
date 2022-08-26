package app;

import entidades.Conta;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		Conta x = new Conta(1001, "Alex", 1000.0);
		Conta y = new ContaPoupanca(1001, "Maria", 1000.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
		
		
	}
	
	

}
