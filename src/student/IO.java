package student;

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
		System.out.println("*************************************");
		System.out.println("*                                   *");
		System.out.println("*             "+classmgr.getClassmgrname()+"�༶����              *");
		System.out.println("*               1:����                          *");
		System.out.println("*               2:���                          *");
		System.out.println("*               3:�޸�                          *");
		System.out.println("*               4:ɾ��                          *");
		System.out.println("*               5:�˳�                          *");
		System.out.println("*                                   *");
		System.out.println("*************************************");
		boolean bo = true;
		while(bo){
			int select = sc.nextInt();
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
		while(null == classmgr.searchClassbyNum(classid)){
			System.out.println("����ʧ�ܣ���������:");
			classid = sc.nextInt();
		}
		ClassandGrades cls = classmgr.searchClassbyNum(classid);
		System.out.println(cls);
		stumanager(cls);
		
	}
	private void classadd(ClassMgr classmgr){
		System.out.println("����Ҫ��ӵİ�:(��:1302)");
		int classid = sc.nextInt();
		String classname = numtoname(classid);
		while(!classmgr.addClass(classid, classname, null)){
			System.out.println("���ʧ�ܣ���������:");
			classid = sc.nextInt();
			classname = numtoname(classid);
		}
			ClassandGrades cls = classmgr.searchClassbyNum(classid);
			System.out.println(cls);
			stumanager(cls);
	}
	private void classedit(ClassMgr classmgr){
		System.out.println("����Ҫ�޸ĵİ�:(��:1302)");
		int classid = sc.nextInt();
		while(null == classmgr.searchClassbyNum(classid)){
			System.out.println("û�д˰࣡��������:");
			classid = sc.nextInt();
		}
		System.out.println("Ҫ�޸ĵ�����?\n1:���\n2:ѧ������");
		int sel = sc.nextInt();
		if(sel == 1){
			System.out.println("������ĺ�İ��:(����˰༶���ڣ����Ḳ��)");
			classid = sc.nextInt();
			classmgr.delClass(classid);
			classmgr.addClass(classid, numtoname(classid), null);
			System.out.println("�޸ĳɹ�!");
		}if(sel == 2){
			ClassandGrades cls = classmgr.searchClassbyNum(classid);
			stumanager(cls);
		}
	}
	private void classdel(ClassMgr classmgr){
		System.out.println("����Ҫɾ���İ�:(��:1302)");
		int classid = sc.nextInt();
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
		System.out.println("*************************************");
		System.out.println("*                                   *");
		System.out.println("*          "+cls.getClassname()+"ѧ������               *");
		System.out.println("*               1:����                          *");
		System.out.println("*               2:���                          *");
		System.out.println("*               3:�޸�                          *");
		System.out.println("*               4:ɾ��                          *");
		System.out.println("*               5:�˳�                          *");
		System.out.println("*                                   *");
		System.out.println("*************************************");
		
	}
}
