package lpoo20210309;

public class MeuPrograma {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta(166899,10000);
		
		double valorDeposito = 1500;
		double valorSaque = 10000;
		
		
		System.out.println("===SALDO CONTA CORRENTE=== NÚMERO: " + minhaConta.consultarNumConta());
		System.out.println("O saldo é : " + minhaConta.consultarSaldoConta());
		
		System.out.println("== VALOR DO DEPÓSITO : " + valorDeposito);
		minhaConta.depositar(valorDeposito);
		
		System.out.println("===SALDO CONTA CORRENTE=== NÚMERO: " + minhaConta.consultarNumConta());
		System.out.println("O saldo é : " + minhaConta.consultarSaldoConta());
		
		System.out.println("== O VALOR DO SAQUE É " + valorSaque);
			if(minhaConta.sacar(valorSaque)){
				System.out.println("SAQUE REALIZADO COM SUCESSO!!");
			}else {
				System.out.println("SAQUE NÃO PERMITIDO, SALDO INSUFICIENTE!");
			}
			
		
		System.out.println("===SALDO CONTA CORRENTE=== NÚMERO: " + minhaConta.consultarNumConta());
		System.out.println("O saldo é : " + minhaConta.consultarSaldoConta());
		
	}

}
