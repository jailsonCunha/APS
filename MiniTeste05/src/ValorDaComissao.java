
public enum ValorDaComissao {
	
	PERCENTUAL_COMISSAO_PRODUTOS_NORMAL (10), PERCENTUAL_COMISSAO_PRODUTOS_ESPECIAL (30);
	
	private final double valor;

	private ValorDaComissao(final double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
