package student;

import java.util.ArrayList;

public class ClassandGrades {
	private int classnum;
	private String classname;
	ArrayList<Student> Students = new ArrayList<Student>();
	
	//TODO: Ìí¼Ó°à¼¶¼ì²é
	
    public int getClassnum() {
		return classnum;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public ArrayList<Student> getStudents() {
		return Students;
	}
	public void setStudents(ArrayList<Student> students) {
		Students = students;
	}
	
	public ClassandGrades(int classnum, String classname,
			ArrayList<Student> students) {
		this.classnum = classnum;
		this.classname = classname;
		Students = students;
	}
	
	public ClassandGrades(){
		
	}
    
}
