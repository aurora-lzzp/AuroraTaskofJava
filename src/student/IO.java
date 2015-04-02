package student;

import java.util.Scanner;

public class IO {
	ClassMgr classmgr1 = new ClassMgr();
	Scanner sc = new Scanner(System.in);
	public void init(){
		System.out.println("*************************************");
		System.out.println("*                                   *");
		System.out.println("*           系统初始化中                       *");
		System.out.println("*                                   *");
		System.out.println("*************************************");
		System.out.print("请输入学校名：");
		classmgr1.setClassmgrname(sc.nextLine());
		classmgr1.setClassMgrid(classmgr1.getClassmgrname().hashCode());
		classmanager(classmgr1);
		
	}
	private void classmanager(ClassMgr classmgr){
		System.out.println("*************************************");
		System.out.println("*                                   *");
		System.out.println("*                     "+classmgr.getClassmgrname()+"班级管理                     *");
		System.out.println("*               1:查找                          *");
		System.out.println("*               2:添加                          *");
		System.out.println("*               3:修改                          *");
		System.out.println("*               4:删除                          *");
		System.out.println("*               5:退出                          *");
		System.out.println("*                                   *");
		System.out.println("*************************************");
		int select = sc.nextInt();
		boolean bo = true;
		while(bo){
			switch(select){
			case 1 : classearch(classmgr); break;
			case 2 : classadd(classmgr); break;
			case 3 : classedit(classmgr); break;
			case 4 : classdel(classmgr); break;
			case 5 : bo = false; break;
			default : System.out.println("输入错误！重新输入:");
			}
		
		}
	}
	
	private void classearch(ClassMgr classmgr){
		System.out.println("输入要查找的班:(例:1302)");
		int classid = sc.nextInt();
		while(null == classmgr.searchClassbyNum(classid)){
			System.out.println("搜索失败！重新输入:");
			classid = sc.nextInt();
		}
		ClassandGrades cls = classmgr.searchClassbyNum(classid);
		System.out.println(cls);
		stumanager(cls);
		
	}
	private void classadd(ClassMgr classmgr){
		System.out.println("输入要添加的班:(例:1302)");
		int classid = sc.nextInt();
		String classname = numtoname(classid);
		while(!classmgr.addClass(classid, classname, null)){
			System.out.println("添加失败！重新输入:");
			classid = sc.nextInt();
			classname = numtoname(classid);
		}
			ClassandGrades cls = classmgr.searchClassbyNum(classid);
			System.out.println(cls);
			stumanager(cls);
	}
	private void classdel(ClassMgr classmgr){
		System.out.println("输入要删除的班:(例:1302)");
		int classid = sc.nextInt();
		if(!classmgr.delClass(classid)){
			System.out.println("没找到要删除的班");
		}else{
			System.out.println("删除成功!");
		}
	}
	//TODO: stumanager  numtoname  test

}
