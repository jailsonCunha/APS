
public class ComissaoConjunta implements Comissao {
	
	@Override
	public double calcularComissao(double qtdVendas, double percentual) {
		percentual = percentual / 2;
		return((qtdVendas * percentual) / 100);
	}

}
