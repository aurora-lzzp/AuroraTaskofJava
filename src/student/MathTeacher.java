package student;

public class MathTeacher extends Teacher implements IIntro {
	public MathTeacher(){
		this.setSubject("���");
	}
	
	public MathTeacher(String name, int classnum) {
		super(name, classnum);
		this.setSubject("���");
		// TODO Auto-generated constructor stub
	}

		@Override
		public String Intro() {
			// TODO Auto-generated method stub
			return("�ҽ�"+this.getSubject());
		}




}
