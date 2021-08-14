
public class Meu_Sistema {

	public static void main(String[] args) {
		
		Conta minhaConta; //Declaração de uma variável que receberá um objeto
		minhaConta = new Conta(1998); // Instaciei o objeto e o atribuí á variável
		
		// Outra forma de criar e instanciar um objeto
		// Conta minhaConta = new Conta(); 
		
		//minhaConta.numero = 0;
		minhaConta.saldo = 20.50;
		minhaConta.limite = 500;
		
		System.out.println("====== NÚMERO DA CONTA ======  " + minhaConta.consultarNumero());
		System.out.println("Saldo da conta é " + minhaConta.consultarSaldo());
		System.out.println("Saldo disponível para saque é " + minhaConta.valorDisponivelSaque());
		
		
	}

}
