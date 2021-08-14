package lista1.questao7;

public class Conta {

	private int numero;
	private float limite;
	private float saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(float valor) {
		saldo = saldo + valor;
	}		
	public void sacar(float valor) {
		saldo = saldo - valor;
	}
	
}
