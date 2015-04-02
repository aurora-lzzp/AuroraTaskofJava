package student;

import java.util.ArrayList;

public class ClassandGrades {
	private int classnum;
	private String classname;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	
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
		return students;
	}
	public void setStudents(ArrayList<Student> stu) {
		students = stu;
	}
	
	public boolean addStudent(Student stu){
		if(stu.getOfclass() == this.classnum){
			return students.add(stu);	
		}
		return false;
	}
	
	public boolean addStudent(String name, int id, int age, int classid){
		if(this.classnum == classid){
		for(Student obj : students){
			if(obj.getId() == id){
				return false;
			}
		}
		Student stu = new Student(name, id, age, classid);
		students.add(stu);
		return true;
		}
		return false;
	}
	
	public boolean delStudent(int id, int classid){
		if(this.classnum == classid){
			for(Student obj : students){
				if(obj.getId() == id){
					students.remove(obj);
					return true;
					}
				}
			return false;
			}
		return false;
	}
	
	public boolean delStudent(Student stu){
		if(stu.getOfclass() == this.classnum){
			return students.remove(stu);	
		}
		return false;

	}
	
	public boolean editStudent(String name, int id, int age, int classid){
		if(this.classnum == classid){
			Student stu = new Student(name, id, age, classid);
			for(int i =0; i< students.size(); i++){
				if(students.get(i).getOfclass() == classid){
					students.set(i, stu);
					return true;
				}
			}
		}
		return false;
		
	}
	
	public ClassandGrades(int classnum, String classname,
			ArrayList<Student> stu) {
		this.classnum = classnum;
		this.classname = classname;
		students = stu;
	}
	
	public ClassandGrades(){
		
	}
	
	@Override
	public String toString() {
		return "ClassandGrades [classnum=" + classnum + ", classname="
				+ classname + ", students=" + students.size() + "]";
	}

    
}
