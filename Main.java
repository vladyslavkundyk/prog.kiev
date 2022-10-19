package students;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Алексей", "Дмитров", Gender.Male, 563, "Основная");
		Student student2 = new Student("Степан", "Баранов", Gender.Male, 623, "Основная");
		Student student3 = new Student("Олег", "Волынов", Gender.Male, 924, "Основная");
		Student student4 = new Student("Борис", "Пугачев", Gender.Male, 427, "Основная");
		Student student5 = new Student("Богдан", "Митрофанов", Gender.Male, 746, "Основная");
		Student student6 = new Student("Андрей", "Антонов", Gender.Male, 315, "Основная");
		Student student7 = new Student("Марина", "Леонова", Gender.Female, 258, "Основная");
		Student student8 = new Student("Анастасия", "Сорокина", Gender.Female, 916, "Основная");
		Student student9 = new Student("Зоя", "Гришина", Gender.Female, 257, "Основная");
//		Student student10 = new Student("Тамара", "Орлова", Gender.Female, 10, "Основная");
//		Student student11 = new Student("Юрий", "Гришин", Gender.Male, 11, "Основная");

		Group group1 = new Group();

		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);
			group1.addStudent(student6);
			group1.addStudent(student7);
			group1.addStudent(student8);
			group1.addStudent(student9);
//			group1.addStudent(student10);
//			group1.addStudent(student11);

		} catch (GroupOverflowException e) {
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		}
		System.out.println();

		try {
			System.out.println(group1.searchStudentByLastName("Леонова"));
			System.out.println();
//			System.out.println(group1.searchStudentByLastName(student11.getLastName())); // Не существует

		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}

		group1.removeStudentByID(746);
		group1.removeStudentByID(258);
		group1.removeStudentByID(491); // Не существует

		// (ВНИЗУ) sortStudentsByLastName, создание студента

		System.out.println();
		System.out.println("Создание нового студента:");
		System.out.println();
		Student student10 = new CreateStudent().newStudent();
		CreateStudent.addStudentToGroup(student10, group1);

		System.out.println();
		System.out.println("Информация о созданном студенте:");
		System.out.println();
		System.out.println(student10);

		System.out.println();
		System.out.println("Сортировка всех студентов по фамилии,\nсписок студентов:");

		group1.sortStudentsByLastName();

		System.out.println();
		System.out.println(group1);
	}
}
