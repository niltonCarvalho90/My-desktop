package lpoo20210309;

public class Conta {

	private int numero;
	private double saldo;
	
	public Conta(int numeroConta, double saldoConta) {
		numero = numeroConta;
		saldo = saldoConta;
	}
	
	public boolean sacar(double valorSaque) {
		if(saldo >= valorSaque) {
			saldo -= valorSaque;
			return true;
		 }else {
			return false;
		}
	}
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public int consultarNumConta() {
		return numero;
	}
	
	public double consultarSaldoConta() {
		return saldo;
	}
}
