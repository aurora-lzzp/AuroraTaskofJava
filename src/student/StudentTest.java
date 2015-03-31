package student;


public class StudentTest {
	public static void main(String[] args) {
			String[] stuarr = StudentMgr.studentscanner();
	        Student student = new Student();
	        StudentMgr.studentin(stuarr, student);
	        System.out.println(student);

	}
	
}
