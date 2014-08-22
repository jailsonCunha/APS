
public class ComissaoIndividual implements Comissao{
	
	@Override
	public double calcularComissao(double vendas, double percentual) {
		return ((vendas * percentual) / 100);
	}

}
