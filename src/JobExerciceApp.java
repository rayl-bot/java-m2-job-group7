import java.util.*;

// principal
public class JobExerciceApp {

	public static void main(String[] args) {
		// Objeto scanner para pedir por pantalla
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Tipo de empleado: Manager/Boss/Volunteer/Senior/Junior/Mid");
		String emp = scanner.nextLine();

		try {

			if (emp.equalsIgnoreCase("Manager")) {
				Manager manager = new Manager("Mario", 2000);
				if (manager.precio >= 3000 && manager.precio <= 5000)
					System.out.println(manager.totalSalario());
				else
					throw new OurException(2);

			} else if (emp.equalsIgnoreCase("boss")) {
				Boss boss = new Boss("Lucas", 1);
				if (boss.precio >= 8000)
					System.out.println(boss.totalSalario());
				else
					throw new OurException(1);

			} else if (emp.equalsIgnoreCase("senior")) {
				Employee senior = new Senior("sandra", 1);
				if (senior.precio >= 2700 && senior.precio <= 4000)
					System.out.println(senior.totalSalario());
				else
					throw new OurException(3);

			} else if (emp.equalsIgnoreCase("mid")) {
				Employee mid = new Mid("sandra", 1);
				if (mid.precio >= 1800 && mid.precio <= 2500)
					System.out.println(mid.totalSalario());
				else
					throw new OurException(4);

			} else if (emp.equalsIgnoreCase("junior")) {
				Employee junior = new Junior("sandra", 1);
				if (junior.precio >= 900 && junior.precio <= 1600)
					System.out.println(junior.totalSalario());
				else
					throw new OurException(5);

			} else {
				Volunteer volunteer = new Volunteer("sandra", 0);
				if (volunteer.precio == 0)
					System.out.println(volunteer.totalSalario());
				else
					throw new OurException();

			}

		} catch (OurException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}