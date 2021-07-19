package ejerciciom2;

public abstract class Empleado {
	//declaracion de las variables
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
	
	//metodo abstracto que calcula el salario total
	public abstract double totalSalario();
	//metodo abstracto que calcula el neto anual
	public abstract double netoAnual(double brutoAnual);
	// metodo abstracto para sumar el bonus
	public abstract double bonus();
}