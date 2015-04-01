package student;

import java.util.ArrayList;

public class ClassMgr {
	//(TODO: 班级的添加，删除，查找，同时给一个manager id以区别学校)
	//finished
	private ArrayList<ClassandGrades> Cls = new ArrayList<ClassandGrades>();
	private int ClassMgrid;
	
	public ArrayList<ClassandGrades> getCls() {
		return Cls;
	}
	public void setCls(ArrayList<ClassandGrades> cls) {
		Cls = cls;
	}
	public int getClassMgrid() {
		return ClassMgrid;
	}
	public void setClassMgrid(int classMgrid) {
		ClassMgrid = classMgrid;
	}
	
	public ClassandGrades SearchClassbyNum(int id){
		for(ClassandGrades obj : Cls){
			if(obj.getClassnum() == id){
				return obj;
			}else{
				return null;
			}
		}
		return null;
	}
	
	public void AddClass(ClassandGrades cls){
		Cls.add(cls);
	}
	
	public boolean AddClass(int classnum , String classname , ArrayList<Student> students){
		ClassandGrades cls = new ClassandGrades(classnum, classname, students);
		for(ClassandGrades obj : Cls){
			if(obj.getClassnum() == classnum){
				return false;
			}
		}
		Cls.add(cls);
		return true;
	}
	
	public boolean DelClass(int id){
		for(ClassandGrades obj : Cls){
			if(obj.getClassnum() == id){
				Cls.remove(obj);
				return true;
			}
		}
		return false;
	}
	
	public boolean DelClass(ClassandGrades cls){
		return Cls.remove(cls);
	}

	public ClassMgr(ArrayList<ClassandGrades> cls, int classMgrid) {
		Cls = cls;
		ClassMgrid = classMgrid;
	}
	public ClassMgr(){
		
	}

}
