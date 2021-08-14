package lpoo20210316;

public class This {

	private int numero;
	private double saldo;
	
	//O THIS � UTILIZADO PARA REFER�NCIAR O ATRIBUTO QUE RECEBER� O VALOR, SENDO O EXTERNO AO CONSTRUTOR
	//OU M�TODO POSSUIDO A MESMA NOMECLATURA
	
	public This(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
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


