package lista1.questao7;

public class Funcionario {

	private String nome;
	private float salario;
	private float salarioInicial = 200;
	
	
	public Funcionario() {
		salario = salarioInicial;
	}
	
	public float getSalarioInicial() {
		return salarioInicial;
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
	
	
}
