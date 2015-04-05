package student;

import java.util.ArrayList;
import java.util.Scanner;

public class IO {
	ClassMgr classmgr1 = new ClassMgr();
	Scanner sc = new Scanner(System.in);
	public void init(){
		System.out.println("*************************************");
		System.out.println("*                                   *");
		System.out.println("*           ϵͳ��ʼ����                       *");
		System.out.println("*                                   *");
		System.out.println("*************************************");
		System.out.print("������ѧУ����");
		classmgr1.setClassmgrname(sc.nextLine());
		classmgr1.setClassMgrid(classmgr1.getClassmgrname().hashCode());
		classmanager(classmgr1);
		
	}
	private void classmanager(ClassMgr classmgr){
		boolean bo = true;
		while(bo){
			System.out.println("*************************************");
			System.out.println("*                                   *");
			System.out.println("*             "+classmgr.getClassmgrname()+"�༶����             *");
			System.out.println("*               1:����                          *");
			System.out.println("*               2:���                          *");
			System.out.println("*               3:�޸�                          *");
			System.out.println("*               4:ɾ��                          *");
			System.out.println("*               5:�˳�                          *");
			System.out.println("*                                   *");
			System.out.println("*************************************");
			int select = sc.nextInt();
			sc.nextLine();
			switch(select){
			case 1 : classearch(classmgr); break;
			case 2 : classadd(classmgr); break;
			case 3 : classedit(classmgr); break;
			case 4 : classdel(classmgr); break;
			case 5 : bo = false; break;
			default : System.out.println("���������������:");
			}
		
		}
	}
	
	private void classearch(ClassMgr classmgr){
		System.out.println("����Ҫ���ҵİ�:(��:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		while(null == classmgr.searchClassbyNum(classid)){
			System.out.println("����ʧ�ܣ���������:");
			classid = sc.nextInt();
			sc.nextLine();
		}
		ClassandGrades cls = classmgr.searchClassbyNum(classid);
		System.out.println(cls);
		stumanager(cls);
		
	}
	private void classadd(ClassMgr classmgr){
		System.out.println("����Ҫ��ӵİ�:(��:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		String classname = numtoname(classid);
		ArrayList<Student> stus = new ArrayList<Student>();
		while(!classmgr.addClass(classid, classname, stus)){
			System.out.println("���ʧ�ܣ���������:");
			classid = sc.nextInt();
			sc.nextLine();
			classname = numtoname(classid);
		}
			ClassandGrades cls = classmgr.searchClassbyNum(classid);
			System.out.println(cls);
			stumanager(cls);
	}
	private void classedit(ClassMgr classmgr){
		System.out.println("����Ҫ�޸ĵİ�:(��:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		while(null == classmgr.searchClassbyNum(classid)){
			System.out.println("û�д˰࣡��������:");
			classid = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Ҫ�޸ĵ�����?\n1:���\n2:ѧ������");
		int sel = sc.nextInt();
		sc.nextLine();
		if(sel == 1){
			System.out.println("������ĺ�İ��:(����˰༶���ڣ����Ḳ��)");
			classid = sc.nextInt();
			sc.nextLine();
			classmgr.delClass(classid);
			ArrayList<Student> stus = new ArrayList<Student>();
			classmgr.addClass(classid, numtoname(classid), stus);
			System.out.println("�޸ĳɹ�!");
		}if(sel == 2){
			ClassandGrades cls = classmgr.searchClassbyNum(classid);
			stumanager(cls);
		}
	}
	private void classdel(ClassMgr classmgr){
		System.out.println("����Ҫɾ���İ�:(��:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		if(!classmgr.delClass(classid)){
			System.out.println("û�ҵ�Ҫɾ���İ�");
		}else{
			System.out.println("ɾ���ɹ�!");
		}
	}
	//TODO: stumanager  numtoname  test

	private String numtoname(int classid){
		StringBuilder str = new StringBuilder();
		Integer a = classid / 100;
		Integer b = classid % 100;
		str.append(a.toString() + "��" + b.toString() + "��");
		return str.toString();
	}
	private void stumanager(ClassandGrades cls){
		
		boolean bo = true;
		while(bo){
			System.out.println("*************************************");
			System.out.println("*                                   *");
			System.out.println("*          "+cls.getClassname()+"ѧ������                  *");
			System.out.println("*               1:����                          *");
			System.out.println("*               2:���                          *");
			System.out.println("*               3:�޸�                          *");
			System.out.println("*               4:ɾ��                          *");
			System.out.println("*               5:�˳�                          *");
			System.out.println("*                                   *");
			System.out.println("*************************************");
			int select = sc.nextInt();
			sc.nextLine();
			switch(select){
			case 1 : stusearch(cls); break;
			case 2 : stuadd(cls); break;
			case 3 : stuedit(cls); break;
			case 4 : studel(cls); break;
			case 5 : bo = false; break;
			default : System.out.println("���������������:");
			}
		}
	}
	
	private void stusearch(ClassandGrades cls){
		System.out.println("������Ҫ���ҵ�ѧ��:");
		String stuname = sc.nextLine();
		while(null == cls.searchStubyName(stuname) ){
			System.out.println("����ʧ��!��������:");
			stuname = sc.nextLine();
		}
		System.out.println(cls.searchStubyName(stuname));
	}
	private void stuadd(ClassandGrades cls){
		System.out.println("������Ҫ��ӵ�ѧ������ ѧ�� ����:");
		boolean bo = true;
		while(bo){
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			if(ss.length != 3){
				System.out.println("��ʽ����ȷ:");
				continue;
			}
			if (!cls.addStudent(ss[0], Integer.parseInt(ss[1]), Integer.parseInt(ss[2]), cls.getClassnum())){
				System.out.println("������Ϣ����ȷ:");
				continue;
			}
            System.out.println(cls.searchStubyName(ss[0]));
            bo = false;
		}
		
	}
	public void stuedit(ClassandGrades cls){
		System.out.println("������Ҫ�޸ĵ�ѧ������:");
		String name = sc.nextLine();
		while(null == cls.searchStubyName(name)){
			System.out.println("δ�ҵ�!��������:");
			name = sc.nextLine();
		}
		System.out.println(cls.searchStubyName(name));
		System.out.println("����δ���");
	}
	public void studel(ClassandGrades cls){
		System.out.println("������Ҫɾ����ѧ��ѧ��");
		int id = sc.nextInt();
		sc.nextLine();
		while(!cls.delStudent(id, cls.getClassnum())){
			System.out.println("û�����ѧ��!��������:");
			id = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("ɾ���ɹ�!");
	}
		
}
