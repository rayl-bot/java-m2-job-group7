
public class Employee extends Empleado {
	/**
	 * @param nombre
	 * @param precio
	 */
	public Employee(String nombre, int precio) {
		super(nombre, precio);
		
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return this.precio-(this.precio*0.15);
	}

}
