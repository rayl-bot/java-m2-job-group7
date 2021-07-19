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
				Manager manager = new Manager("Mario", 4000);
				if (manager.precio >= 3000 && manager.precio <= 5000)
					System.out.println(manager);
				else
					throw new OurException(2);
				System.out.println("Sueldo anual con bonus: " + manager.bonus());

			} else if (emp.equalsIgnoreCase("boss")) {
				Boss boss = new Boss("Lucas", 1);
				if (boss.precio >= 8000)
					System.out.println(boss);
				else
					throw new OurException(1);
				System.out.println("Sueldo anual con bonus: " + boss.bonus());

			} else if (emp.equalsIgnoreCase("senior")) {
				Employee senior = new Senior("Maria", 1);
				if (senior.precio >= 2700 && senior.precio <= 4000)
					System.out.println(senior);
				else
					throw new OurException(3);
				System.out.println("Sueldo anual con bonus: " + senior.bonus());

			} else if (emp.equalsIgnoreCase("mid")) {
				Employee mid = new Mid("Sandra", 1900);
				if (mid.precio >= 1800 && mid.precio <= 2500)
					System.out.println(mid);
				else
					throw new OurException(4);
				System.out.println("Sueldo anual con bonus: " + mid.bonus());

			} else if (emp.equalsIgnoreCase("junior")) {
				Employee junior = new Junior("Antonia", 1000);
				if (junior.precio >= 900 && junior.precio <= 1600)
					System.out.println(junior);
				else
					throw new OurException(5);
				System.out.println("Sueldo anual con bonus: " + junior.bonus());

			} else {

				System.out.println("Es ajut? (si/no) ");
				String ajut = scanner.nextLine();
				Volunteer volunteer = new Volunteer("Jesus", 0);

				if (ajut.equals("si")) {
					System.out.println("Cuanto cobras?");
					int sala = scanner.nextInt();
					if (sala <= 300) {
						volunteer.precio = sala;
						System.out.println(volunteer);
					} else
						throw new OurException(6);
				} else if (ajut.equals("no") && volunteer.precio > 0)
					throw new OurException();
				else
					System.out.println(volunteer);

			}

		} catch (OurException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}