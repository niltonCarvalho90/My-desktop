package lpoo20210323;

import Dominio.Gerente;

public class MeuSoftaware {

	public static void main(String[] args) {
	
		Gerente gerenteComercial = new Gerente();
		
		gerenteComercial.setNome("Jo�o");
		gerenteComercial.setSalario(15000);
		gerenteComercial.setNomeUsuario("Ana");
		gerenteComercial.setSenha("123456");
		
		System.out.println("=== DADOS DO FUNCION�RIO===");
		System.out.println("NOME: " + gerenteComercial.getNome());
		System.out.println("USU�RIO : " + gerenteComercial.getNomeUsuario());
		System.out.println("SAL�RIO : " + gerenteComercial.getSalario());
		
		
	}

}
