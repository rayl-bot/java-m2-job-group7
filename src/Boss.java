
public class Boss extends Empleado {

	/**
	 * Constructor Boss
	 * @param nombre
	 * @param precio
	 */
	public Boss(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public double totalSalario() {
		
		return this.precio+(this.precio*0.5);
	}
	
}
