package student;

import java.util.Scanner;

public class StudentIO {
	public static String read() {
		Scanner sc = new Scanner(System.in);
		String scstring = sc.nextLine();
		return scstring;
	}

	public static void studentin(String[] stuarr, StudentInfo student) {
		student.setName(stuarr[0]);
		student.setClassnum(stuarr[1]);
		if(!student.setId(Integer.parseInt(stuarr[2]))){
			System.out.println("Type the correct id:");
			String id = read();
			student.setId(Integer.parseInt(id));	
		}
		if(!student.setAge(Integer.parseInt(stuarr[3]))){
			System.out.println("Type the correct age:");
			String age = read();
			student.setAge(Integer.parseInt(age));	
		}
	}

	public static String[] studentscanner() {
		System.out.println("Type the name classnumber id age of the student:");
		String stu = read();
		String[] stuarr = stu.split(" ");
		if(stuarr.length != 4){
			System.out.println("the input is invalid!");
			stuarr = studentscanner();
		}
		return stuarr;
	}

}
