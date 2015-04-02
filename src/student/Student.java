package student;

public class Student {
	private String name;
	private int id;
	private int age;
	private int ofclass;
	
	public Student(String name, int id, int age, int classid) {
		super();
		setName(name);
		setId(id);
		setAge(age);
		setOfclass(classid);
	}
	
	public Student() {
	
		
	}
	
	public String getName() {
		return name;
	
	}
	
	public void setName(String name) {
		this.name = name;
	//TODO: Ìí¼ÓÃû×Ö
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
	
	public int getOfclass() {
		return ofclass;
	
	}
	
	public void setOfclass(int ofclass) {
		this.ofclass = ofclass;
	
	}
	
	@Override
	public String toString() {
		return "StudentInfo [name=" + name +  ", id="
				+ id + ", age=" + age + ", ofclass=" + ofclass + "]";
	}
	

}
