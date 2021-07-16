import java.util.*;
// principal
public class JobExerciceApp {

	public static void main(String[] args) {
		//Objeto scanner para pedir por pantalla
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Tipo de empleado: Manager/Boss/Volunteer/Employee");
		String emp = scanner.nextLine();
		
		if(emp.equalsIgnoreCase("Manager")) {
			//Manager manager = new Manager("Mario",2000);
			//System.out.println(manager.totalSalario());
			
		}else if(emp.equalsIgnoreCase("boss")) {
			//Boss boss = new Boss("Lucas",8000);
			//System.out.println(boss.totalSalario());
			
		}else if(emp.equalsIgnoreCase("employee")) {
			//Employee employee = new Employee("sandra",2000);
			//System.out.println(employee.totalSalario());
		}else {
			//Volunteer volunteer = new Volunteer("sandra",2000);
			//System.out.println(volunteer.totalSalario());
		}
	}
}
