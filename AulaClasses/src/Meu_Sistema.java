
public class Meu_Sistema {

	public static void main(String[] args) {
		
		Conta minhaConta; //Declara��o de uma vari�vel que receber� um objeto
		minhaConta = new Conta(1998); // Instaciei o objeto e o atribu� � vari�vel
		
		// Outra forma de criar e instanciar um objeto
		// Conta minhaConta = new Conta(); 
		
		//minhaConta.numero = 0;
		minhaConta.saldo = 20.50;
		minhaConta.limite = 500;
		
		System.out.println("====== N�MERO DA CONTA ======  " + minhaConta.consultarNumero());
		System.out.println("Saldo da conta � " + minhaConta.consultarSaldo());
		System.out.println("Saldo dispon�vel para saque � " + minhaConta.valorDisponivelSaque());
		
		
	}

}
