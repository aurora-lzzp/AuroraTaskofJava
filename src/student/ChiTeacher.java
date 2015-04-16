package student;

public class ChiTeacher extends Teacher implements IIntro{
	public ChiTeacher(){
		this.setSubject("文科");
	}
	
	public ChiTeacher(String name, int classnum) {
		super(name, classnum);
		this.setSubject("文科");
		// TODO Auto-generated constructor stub
	}

		@Override
		public String Intro() {
			// TODO Auto-generated method stub
			return("我教"+this.getSubject());
		}

	}
