
public class Manager extends Empleado {
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Manager(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return this.precio+(this.precio*0.1);
	}
	
}
