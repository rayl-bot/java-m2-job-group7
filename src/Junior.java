
public class Junior extends Employee {
	
	public Junior(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
		netoAnual(precio);
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return this.precio-(this.precio*0.05);
	}
	
	@Override
	public double netoAnual(double precio) {
		double brutoAnual = precio * 12;
		double netoAnual = brutoAnual - (brutoAnual * 0.02);
		return netoAnual;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " precio bruto mensual " + precio + " precio bruto anual: " + totalSalario()
				+ " precio neto mensual: " + netoAnual(this.precio) / 12 + " precio neto anual: "+ netoAnual(this.precio);
	}
}
