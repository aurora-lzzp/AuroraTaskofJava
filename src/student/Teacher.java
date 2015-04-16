package student;

public class Teacher {
	private String name;
	private String subject;
	private int classnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getClassnum() {
		return classnum;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	
	public Teacher(String name, int classnum) {
		super();
		this.name = name;
		this.classnum = classnum;
	}
	public Teacher(){
		
	}

}
