package student;


public class StudentTest {
	public static void main(String[] args) {
			String[] stuarr = StudentIO.studentscanner();
	        StudentInfo student = new StudentInfo();
	        StudentIO.studentin(stuarr, student);
	        System.out.println(student);

	}
	
}
