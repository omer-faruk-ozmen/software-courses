
public class StudentsMenager extends UserMenager {
	public void addWork(Students students) {
		System.out.println(students.firstName + " " + students.lastName + " " + students.studentLesson
				+ " isimli ödeve giriş yaptı");
		Brace brace = new Brace();
		brace.sBrace();
	}

	public void deleteWork(Students students) {
		System.out.println(
				students.firstName + " " + students.lastName + " " + students.studentLesson + " isimli ödevi sildi");
		Brace brace = new Brace();
		brace.sBrace();
	}

	public void completedWork(Students students) {
		System.out.println(students.firstName + " " + students.lastName + " " + students.studentLesson
				+ " isimli ödevi tamamladı");
		Brace brace = new Brace();
		brace.lBrace();
	}

}
