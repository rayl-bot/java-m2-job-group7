
public class Mid extends Employee {

	public Mid(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
		netoAnual(precio);
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		this.precio = this.precio - (this.precio * 0.1);
		return this.precio;
	}

	@Override
	public double netoAnual(double precio) {
		double brutoAnual = precio * 12;
		double netoAnual = brutoAnual - (brutoAnual * 0.15);
		return netoAnual;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " precio bruto mensual " + precio + " precio bruto anual: " + totalSalario() * 12
				+ " precio neto mensual: " + netoAnual(this.precio) / 12 + " precio neto anual: "
				+ netoAnual(this.precio);
	}

	@Override
	public double bonus() {
		double brutoAnual = precio * 12;
		return brutoAnual += brutoAnual * 0.10;
	}
}
