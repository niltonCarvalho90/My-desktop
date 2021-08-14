package Aps_Q2;

public class Aluno_b {

	public String nomeCompleto;
	public int matricula;
	public int cpf;
	public String definirNome;
	public int definirMatricula;
	
	public Aluno_b(String nomeCompleto, int matricula) {
		definirNome = nomeCompleto;
		definirMatricula = matricula;
	}
	
	public void imprimirNome() {
		System.out.println(nomeCompleto); 	
		}

	public void imprimirMatricula() {
		System.out.println(matricula); 	
		}
	
	public void imprimirCpf() {
		System.out.println(cpf); 	
		}
	
}
