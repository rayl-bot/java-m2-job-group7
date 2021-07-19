
public class Volunteer extends Empleado {

	public Volunteer(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
		netoAnual(precio);
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return this.precio;
	}

	@Override
	public double netoAnual(double precio) {
		// TODO Auto-generated method stub
		return this.precio * 12;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " precio mensual " + totalSalario() + " precio anual: " + netoAnual(this.precio);
	}

	@Override
	public double bonus() {
		// TODO Auto-generated method stub
		//El voluntario no tiene bonus
		return 0;
	}

}
