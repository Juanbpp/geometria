/**
 * 
 * @author Juan Bautista Penalva Perez
 *  	
 * @version 1.2
 * 
 */
public class Rectangulo_JBPP extends FiguraGeometrica_JBPP {
	private double l1;
	private double l2;
	/**
	 * constructor Rectangulo_JBPP
	 * @param tipoFigura String 
	 * @param lG double  longitud lado 1
	 * @param lP double  longitud lado 2
	 */
	public Rectangulo_JBPP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * @return double calcula el area
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * @return double calcula el perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
