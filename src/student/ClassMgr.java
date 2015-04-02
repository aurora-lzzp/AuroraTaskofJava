package student;

import java.util.ArrayList;

public class ClassMgr {
	//(TODO: 班级的添加，删除，查找，同时给一个manager id以区别学校)
	//finished
	private ArrayList<ClassandGrades> classes = new ArrayList<ClassandGrades>();
	private int classmgrid;
	private String classmgrname;
	
	public String getClassmgrname() {
		return classmgrname;
	}
	public void setClassmgrname(String classmgrname) {
		this.classmgrname = classmgrname;
	}
	public ArrayList<ClassandGrades> getCls() {
		return classes;
	}
	public void setCls(ArrayList<ClassandGrades> cls) {
		classes = cls;
	}
	public int getClassMgrid() {
		return classmgrid;
	}
	public void setClassMgrid(int classMgrid) {
		classmgrid = classMgrid;
	}
	
	public ClassandGrades searchClassbyNum(int id){
		for(ClassandGrades obj : classes){
			if(obj.getClassnum() == id){
				return obj;
			}
		}
		return null;
	}
	public ClassandGrades searchClassbyName(String s){
		for(ClassandGrades obj : classes){
			if(obj.getClassname() == s){
				return obj;
			}
		}
		return null;
	}
	
	public void addClass(ClassandGrades cls){
		classes.add(cls);
	}
	
	public boolean addClass(int classnum , String classname , ArrayList<Student> students){
		ClassandGrades cls = new ClassandGrades(classnum, classname, students);
		for(ClassandGrades obj : classes){
			if(obj.getClassnum() == classnum){
				return false;
			}
		}
		classes.add(cls);
		return true;
	}
	
	public boolean delClass(int id){
		for(ClassandGrades obj : classes){
			if(obj.getClassnum() == id){
				classes.remove(obj);
				return true;
			}
		}
		return false;
	}
	
	public boolean delClass(ClassandGrades cls){
		return classes.remove(cls);
	}

	public ClassMgr(ArrayList<ClassandGrades> cls, int classMgrid) {
		classes = cls;
		classmgrid = classMgrid;
	}
	public ClassMgr(){
		
	}

}
