package lpoo20210309;

public class MeuPrograma {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta(166899,10000);
		
		double valorDeposito = 1500;
		double valorSaque = 10000;
		
		
		System.out.println("===SALDO CONTA CORRENTE=== N�MERO: " + minhaConta.consultarNumConta());
		System.out.println("O saldo � : " + minhaConta.consultarSaldoConta());
		
		System.out.println("== VALOR DO DEP�SITO : " + valorDeposito);
		minhaConta.depositar(valorDeposito);
		
		System.out.println("===SALDO CONTA CORRENTE=== N�MERO: " + minhaConta.consultarNumConta());
		System.out.println("O saldo � : " + minhaConta.consultarSaldoConta());
		
		System.out.println("== O VALOR DO SAQUE � " + valorSaque);
			if(minhaConta.sacar(valorSaque)){
				System.out.println("SAQUE REALIZADO COM SUCESSO!!");
			}else {
				System.out.println("SAQUE N�O PERMITIDO, SALDO INSUFICIENTE!");
			}
			
		
		System.out.println("===SALDO CONTA CORRENTE=== N�MERO: " + minhaConta.consultarNumConta());
		System.out.println("O saldo � : " + minhaConta.consultarSaldoConta());
		
	}

}
