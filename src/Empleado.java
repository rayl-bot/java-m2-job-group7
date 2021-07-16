// asd
public abstract class Empleado {
	protected String nombre;
	protected int precio;
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Empleado(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public abstract double totalSalario();
	
}