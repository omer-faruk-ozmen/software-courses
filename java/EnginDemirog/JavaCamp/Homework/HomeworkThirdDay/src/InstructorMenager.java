
public class InstructorMenager extends UserMenager {

	

	public void addWork(Instructor instructor) {
		System.out.println(instructor.instructorLesson + " isimli ödev verildi");
		Brace brace = new Brace();
		brace.sBrace();
	}

	public void deleteWork(Instructor instructor) {
		System.out.println(instructor.instructorLesson + " isimli ödev silindi");
		Brace brace = new Brace();
		brace.lBrace();
	}

	public void updatedWork(Instructor instructor) {
		System.out.println(instructor.instructorLesson + " isimli ödev güncellendi");
		Brace brace = new Brace();
		brace.sBrace();
	}

}
