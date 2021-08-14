package Q_06;

public class ConsultarDados {
	
	public void criarConexao (BancoDeDados bd, String usuario, String senha) {
		bd.conectar(usuario, senha);
		
	}
}