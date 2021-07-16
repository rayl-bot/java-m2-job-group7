
public class Manager extends Empleado {

	public Manager(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
		netoAnual(precio);
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return this.precio+(this.precio*0.1);
	}

	@Override
	public double netoAnual(double brutoAnual) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " precio bruto mensual " + precio + " precio bruto anual: " + totalSalario()
				+ " precio neto mensual: " + netoAnual(this.precio) / 12 + " precio neto anual: "+ netoAnual(this.precio);
	}
	
}
