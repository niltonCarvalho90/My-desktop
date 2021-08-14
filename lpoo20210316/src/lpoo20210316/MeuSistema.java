package lpoo20210316;

public class MeuSistema {

	public static void main(String[] args) {

		Consulta con = new Consulta();
		Aluno alu = new Aluno();
		
		//UTILIZANDO A SOBRECARGA DE MÉTODOS COM O PARÂMENTRO STRING
		alu = con.consultarDados("João");
		
		System.out.println("DADOS CONSULTADO PELO NOME: " + alu.nome);
		System.out.println("DADOS CONSULTADO PELA MATRÍCULA: " + alu.matricula);
		
		//UTILIZANDO A SOBRECARGA DO MESMO MÉTODO COM O PARÂMENTRO INTEIRO
		alu = con.consultarDados(654321);
		
		System.out.println("DADOS CONSULTADO PELO NOME: " + alu.nome);
		System.out.println("DADOS CONSULTADO PELA MATRÍCULA: " + alu.matricula);

		//UTILIZANDO A SOBRECARGA DE MÉTODOS PASSANDO AGORA DOIS PARÂMENTRO STRING'S DIFERENTES
		alu = con.consultarDados("Manu","09/03/1995");
		
		System.out.println("DADOS CONSULTADO PELO NOME: " + alu.nome);
		System.out.println("DADOS CONSULTADO PELA MATRÍCULA: " + alu.matricula);
		
	}

}
