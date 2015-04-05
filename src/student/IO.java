package student;

import java.util.ArrayList;
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
		boolean bo = true;
		while(bo){
			System.out.println("*************************************");
			System.out.println("*                                   *");
			System.out.println("*             "+classmgr.getClassmgrname()+"班级管理             *");
			System.out.println("*               1:查找                          *");
			System.out.println("*               2:添加                          *");
			System.out.println("*               3:修改                          *");
			System.out.println("*               4:删除                          *");
			System.out.println("*               5:退出                          *");
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
			default : System.out.println("输入错误！重新输入:");
			}
		
		}
	}
	
	private void classearch(ClassMgr classmgr){
		System.out.println("输入要查找的班:(例:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		while(null == classmgr.searchClassbyNum(classid)){
			System.out.println("搜索失败！重新输入:");
			classid = sc.nextInt();
			sc.nextLine();
		}
		ClassandGrades cls = classmgr.searchClassbyNum(classid);
		System.out.println(cls);
		stumanager(cls);
		
	}
	private void classadd(ClassMgr classmgr){
		System.out.println("输入要添加的班:(例:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		String classname = numtoname(classid);
		ArrayList<Student> stus = new ArrayList<Student>();
		while(!classmgr.addClass(classid, classname, stus)){
			System.out.println("添加失败！重新输入:");
			classid = sc.nextInt();
			sc.nextLine();
			classname = numtoname(classid);
		}
			ClassandGrades cls = classmgr.searchClassbyNum(classid);
			System.out.println(cls);
			stumanager(cls);
	}
	private void classedit(ClassMgr classmgr){
		System.out.println("输入要修改的班:(例:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		while(null == classmgr.searchClassbyNum(classid)){
			System.out.println("没有此班！重新输入:");
			classid = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("要修改的内容?\n1:班号\n2:学生管理");
		int sel = sc.nextInt();
		sc.nextLine();
		if(sel == 1){
			System.out.println("输入更改后的班号:(如果此班级存在，将会覆盖)");
			classid = sc.nextInt();
			sc.nextLine();
			classmgr.delClass(classid);
			ArrayList<Student> stus = new ArrayList<Student>();
			classmgr.addClass(classid, numtoname(classid), stus);
			System.out.println("修改成功!");
		}if(sel == 2){
			ClassandGrades cls = classmgr.searchClassbyNum(classid);
			stumanager(cls);
		}
	}
	private void classdel(ClassMgr classmgr){
		System.out.println("输入要删除的班:(例:1302)");
		int classid = sc.nextInt();
		sc.nextLine();
		if(!classmgr.delClass(classid)){
			System.out.println("没找到要删除的班");
		}else{
			System.out.println("删除成功!");
		}
	}
	//TODO: stumanager  numtoname  test

	private String numtoname(int classid){
		StringBuilder str = new StringBuilder();
		Integer a = classid / 100;
		Integer b = classid % 100;
		str.append(a.toString() + "届" + b.toString() + "班");
		return str.toString();
	}
	private void stumanager(ClassandGrades cls){
		
		boolean bo = true;
		while(bo){
			System.out.println("*************************************");
			System.out.println("*                                   *");
			System.out.println("*          "+cls.getClassname()+"学生管理                  *");
			System.out.println("*               1:查找                          *");
			System.out.println("*               2:添加                          *");
			System.out.println("*               3:修改                          *");
			System.out.println("*               4:删除                          *");
			System.out.println("*               5:退出                          *");
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
			default : System.out.println("输入错误！重新输入:");
			}
		}
	}
	
	private void stusearch(ClassandGrades cls){
		System.out.println("请输入要查找的学生:");
		String stuname = sc.nextLine();
		while(null == cls.searchStubyName(stuname) ){
			System.out.println("搜索失败!重新输入:");
			stuname = sc.nextLine();
		}
		System.out.println(cls.searchStubyName(stuname));
	}
	private void stuadd(ClassandGrades cls){
		System.out.println("请输入要添加的学生姓名 学号 年龄:");
		boolean bo = true;
		while(bo){
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			if(ss.length != 3){
				System.out.println("格式不正确:");
				continue;
			}
			if (!cls.addStudent(ss[0], Integer.parseInt(ss[1]), Integer.parseInt(ss[2]), cls.getClassnum())){
				System.out.println("输入信息不正确:");
				continue;
			}
            System.out.println(cls.searchStubyName(ss[0]));
            bo = false;
		}
		
	}
	public void stuedit(ClassandGrades cls){
		System.out.println("请输入要修改的学生姓名:");
		String name = sc.nextLine();
		while(null == cls.searchStubyName(name)){
			System.out.println("未找到!重新输入:");
			name = sc.nextLine();
		}
		System.out.println(cls.searchStubyName(name));
		System.out.println("功能未完成");
	}
	public void studel(ClassandGrades cls){
		System.out.println("请输入要删除的学生学号");
		int id = sc.nextInt();
		sc.nextLine();
		while(!cls.delStudent(id, cls.getClassnum())){
			System.out.println("没有这个学生!重新输入:");
			id = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("删除成功!");
	}
		
}
