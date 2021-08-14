package lpoo20210330;

public class Pagamento {

	private int codPedido;
	private String cpfCliente;
	private float valor;
	private int tipoPagamento;
	
	public Pagamento(int codPedido, String cpfCliente) {
		this.codPedido = codPedido;
		this.cpfCliente = cpfCliente;
	}
	
	public void definirDadosPagamento(String cpfCliente, float valor, int tipoPagamento ) {
		this.cpfCliente = cpfCliente;
		this.valor = valor;
		this.tipoPagamento = tipoPagamento;		
	}
	
	public String consultarCpfCliente() {
		return cpfCliente;
	}
	
	public float consultarValorPagamento() {
		return valor;
	}
	
	public int tipoPagamento() {
		return tipoPagamento;
	}
}
