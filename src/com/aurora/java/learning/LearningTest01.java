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
		System.out.print("����һ���ַ�:");
		asc = scan.next();
		ascconvert();
		System.out.print("�Ƿ������1/0:");
		if(scan.nextInt() == 1){
			
		}
		else flag = 0;
		}
	}
	private static void ascconvert() {
		int i;
		for(i = 0;i< asc.length();i++){
			System.out.println("��"+ (i+1) + "���ַ���ASCII����"+ (int)asc.charAt(i));
			
		}
		i = 0;
	}

}
