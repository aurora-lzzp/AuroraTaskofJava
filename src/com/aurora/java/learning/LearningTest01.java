package com.aurora.java.learning;

import java.util.Scanner;

public class LearningTest01 {
	static String asc = new String();
	public void convert(){
		Scanner scan = new Scanner(System.in);
		scanner(scan);
		scan.close();
	}
	private static void scanner(Scanner scan) {
		int flag = 1;
		while(flag == 1){
		System.out.print("输入一串字符:");
		asc = scan.next();
		ascconvert();
		System.out.print("是否继续？1/0:");
		if(scan.nextInt() == 1){
			
		}
		else flag = 0;
		}
	}
	private static void ascconvert() {
		int i;
		for(i = 0;i< asc.length();i++){
			System.out.println("第"+ (i+1) + "个字符的ASCII码是"+ (int)asc.charAt(i));
			
		}
		i = 0;
	}

}
