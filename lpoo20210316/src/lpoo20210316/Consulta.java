package lpoo20210316;

public class Consulta {

	public Aluno consultarDados(String nome) {
		
		Aluno alunoConsultado = new Aluno();
		
		//CONSULTA OS DADOS
		
		//OBTENDO DADOS FICT�CIOS, PODERIA SER CONSULTADO EM ALGUMA BASE DE DADOS
		alunoConsultado.matricula = 123456;
		alunoConsultado.nome = "Jo�o";
		
		//AP�S A CONSULTA DOS DADOS RETORNO O OBJETO PREENCHIDO COM OS DADOS
		return alunoConsultado;		
	}
	
	public Aluno consultarDados(int matricula) {
		Aluno alunoConsultado = new Aluno();
		
		alunoConsultado.matricula = 654321;
		alunoConsultado.nome = "Maria";
		
		return alunoConsultado;
		
	}
	
	public Aluno consultarDados(String nomeMae, String dataNasc ) {
		Aluno alunoConsultado = new Aluno();
		
		alunoConsultado.matricula = 78910;
		alunoConsultado.nome = "Manu";
		
		return alunoConsultado;
	}
}
