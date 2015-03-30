package student;

import java.util.ArrayList;

public class ClassInfo {
	private int classnum;
	private String classname;
	ArrayList Students = new ArrayList();
	
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
	public ArrayList getStudents() {
		return Students;
	}
	public void setStudents(ArrayList students) {
		Students = students;
	}
	
    
    
}
