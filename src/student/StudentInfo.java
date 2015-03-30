package student;

public class StudentInfo {
	private String name;
	private String classnum;
	private int id;
	private int age;
	private ClassInfo ofclass;
	
	public StudentInfo(String name, String classnum, int id, int age) {
		super();
		setName(name);
		setClassnum(classnum);
		setId(id);
		setAge(age);
	
	}
	
	public StudentInfo() {
	
		
	}
	
	public String getName() {
		return name;
	
	}
	
	public void setName(String name) {
		this.name = name;
	
	}
	
	public String getClassnum() {
		return classnum;
	
	}
	
	public void setClassnum(String classnum) {
		this.classnum = classnum;
	
	}
	
	public int getId() {
		return id;
	
	}
	
	public boolean setId(int id) {
		if(id >= 1 && id <= 36){
		this.id = id;
		return true;
	
		}
		else{
			System.out.println("The input of ID is invalid.");
			return false;
		
		}
	
	}
	
	public int getAge() {
		return age;
	
	}
	
	public boolean setAge(int age) {
		if(age >= 14 && age <= 22){
		this.age = age;
		return true;
		
		}
		else{
			System.out.println("The input of age is invalid");
			return false;
		
		}
	
	}
	
	public ClassInfo getOfclass() {
		return ofclass;
	
	}
	
	public void setOfclass(ClassInfo ofclass) {
		this.ofclass = ofclass;
	
	}
	
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", classnum=" + classnum + ", id="
				+ id + ", age=" + age + ", ofclass=" + ofclass + "]";
	}
	

}
