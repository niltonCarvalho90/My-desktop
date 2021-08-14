package models;

public abstract class Conta {
	
	public int numero;
	public float saldo;

	public abstract void depositar();
	
	public abstract void sacar();
	
	public abstract void transferir();
}
