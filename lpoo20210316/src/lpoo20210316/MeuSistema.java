package lpoo20210316;

public class MeuSistema {

	public static void main(String[] args) {

		Consulta con = new Consulta();
		Aluno alu = new Aluno();
		
		//UTILIZANDO A SOBRECARGA DE M�TODOS COM O PAR�MENTRO STRING
		alu = con.consultarDados("Jo�o");
		
		System.out.println("DADOS CONSULTADO PELO NOME: " + alu.nome);
		System.out.println("DADOS CONSULTADO PELA MATR�CULA: " + alu.matricula);
		
		//UTILIZANDO A SOBRECARGA DO MESMO M�TODO COM O PAR�MENTRO INTEIRO
		alu = con.consultarDados(654321);
		
		System.out.println("DADOS CONSULTADO PELO NOME: " + alu.nome);
		System.out.println("DADOS CONSULTADO PELA MATR�CULA: " + alu.matricula);

		//UTILIZANDO A SOBRECARGA DE M�TODOS PASSANDO AGORA DOIS PAR�MENTRO STRING'S DIFERENTES
		alu = con.consultarDados("Manu","09/03/1995");
		
		System.out.println("DADOS CONSULTADO PELO NOME: " + alu.nome);
		System.out.println("DADOS CONSULTADO PELA MATR�CULA: " + alu.matricula);
		
	}

}
