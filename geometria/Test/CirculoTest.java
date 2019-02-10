

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CirculoTest {
	private double r;
	private double resultadoArea;
	private double resultadoPerimetro;
	
	public CirculoTest(double radio, double resArea,double resPerimetro) {
		r=radio;
		resultadoArea = resArea;
		resultadoPerimetro = resPerimetro;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{7,153.9384,43.9824},{0,0,0},{-3,28.2744,18.8496}
		});
		
	}


	@Test
	public void testArea() {
		Circulo_JBPP circulo= new Circulo_JBPP(r,"test");
		double res=circulo.area();
		assertEquals(resultadoArea,res,0);
	}

	@Test
	public void testPerimetro() {
		Circulo_JBPP circulo= new Circulo_JBPP(r,"test");
		double res=circulo.perimetro();
		assertEquals(resultadoPerimetro,res,0);
	}

}
