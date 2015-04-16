package student;

public class MathTeacher extends Teacher implements IIntro {
	public MathTeacher(){
		this.setSubject("理科");
	}
	
	public MathTeacher(String name, int classnum) {
		super(name, classnum);
		this.setSubject("理科");
		// TODO Auto-generated constructor stub
	}

		@Override
		public String Intro() {
			// TODO Auto-generated method stub
			return("我教"+this.getSubject());
		}




}
