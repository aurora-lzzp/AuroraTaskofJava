package student;

public class ChiTeacher extends Teacher implements IIntro{
	public ChiTeacher(){
		this.setSubject("�Ŀ�");
	}
	
	public ChiTeacher(String name, int classnum) {
		super(name, classnum);
		this.setSubject("�Ŀ�");
		// TODO Auto-generated constructor stub
	}

		@Override
		public String Intro() {
			// TODO Auto-generated method stub
			return("�ҽ�"+this.getSubject());
		}

	}
