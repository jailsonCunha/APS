import static org.junit.Assert.*;
import org.junit.Test;


public class VendasTest {
	
	private Vendas vendas;
	private double comissaoDoVendedos;
	
	
	@Test
	public void calcularComissaoIndividualTest() {
		this.vendas = new Vendas(new ComissaoIndividual());
		this.comissaoDoVendedos += this.vendas.executaCalculo(3 , ValorDaComissao.PERCENTUAL_COMISSAO_PRODUTOS_NORMAL.getValor());
		
		assertEquals(0.3, this.comissaoDoVendedos, 0.0001);
	}
	
	@Test
	public void calcularComissaoConjuntaTest() {
		this.vendas = new Vendas(new ComissaoConjunta());
		this.comissaoDoVendedos += this.vendas.executaCalculo( 4 , ValorDaComissao.PERCENTUAL_COMISSAO_PRODUTOS_ESPECIAL.getValor());
		
		assertEquals(0.6, this.comissaoDoVendedos, 0.001);
	}

}
