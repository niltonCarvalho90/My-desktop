
public class Conta {
	
	private int numero;			//ATRIBUTOS
	public double saldo;
	public double limite;
	
	public Conta(int numeroConta) {		//CONSTRUTOR
		numero = numeroConta;
	}
	
	public Conta(int numeroConta, double valorSaldo ) {		//CONSTRUTOR
		numero = numeroConta;
		saldo = valorSaldo;
	}
	
	
	public double consultarSaldo() {		//M�TODO
		return saldo;
	}	
	
	public double valorDisponivelSaque() {		//M�TODO
		return saldo + limite;
	}
	
	public int consultarNumero() {	//M�TODO
		return numero;
	}
	
}
 