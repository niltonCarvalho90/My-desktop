package Ap1;

public class Funcionario {

	private String nome;
	private float salario;
	private String CPF;
	float salarioIncial = 1500;
	
	public Funcionario(float salarioInicial) {
		salario = salarioIncial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	
}
