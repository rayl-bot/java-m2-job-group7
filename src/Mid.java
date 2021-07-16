
public class Mid extends Employee {

	/**
	 * @param nombre
	 * @param precio
	 */
	public Mid(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return this.precio-(this.precio*0.1);
	}

}
