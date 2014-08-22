public class Vendas {

	private Comissao comissao;

	public Vendas(Comissao comissao) {
		this.comissao = comissao;
	}

	public double executaCalculo(double qtdVendas, double percentual) {
		return this.comissao.calcularComissao(qtdVendas, percentual);
	}

}
