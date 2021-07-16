
public abstract class Empleado {
	protected String nombre;
	protected double precio;
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Empleado(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		netoAnual(precio);
	}
	
	public abstract double totalSalario();
	
	public abstract double netoAnual(double brutoAnual);
}