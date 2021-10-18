
public class Main {

	public static void main(String[] args) {
		
		Students students = new Students();
		students.id=123456;
		students.firstName = "Ömer Faruk";
		students.lastName = "Özmen";
		students.email = "omerfarukozmen0@gmail.com";
		students.studentLesson ="Döngüler";
		
		Instructor instructor = new Instructor();
		instructor.id=789456;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.email ="aaaa@bbbb.com";
		instructor.instructorLesson="Method yapısı";
		
		UserMenager userMenager = new UserMenager();
		userMenager.Signin(instructor);
		userMenager.Login(students);
		userMenager.Logout();
		
		StudentsMenager studentsMenager = new StudentsMenager();
		studentsMenager.addWork(students);
		studentsMenager.completedWork(students);
		studentsMenager.deleteWork(students);
		
		InstructorMenager instructorMenager = new InstructorMenager();
		instructorMenager.addWork(instructor);
		instructorMenager.updatedWork(instructor);
		instructorMenager.deleteWork(instructor);

	}

}
