package com.aurora.java.learning;

import hex.*;

public class LearningTest02 {
	
	public static void main(String[] args) {
		Func_scanner func_scanner = new Func_scanner();
		Func_convert func_convert = new Func_convert();
	    func_scanner._scan();
	    int len = func_convert._convert(func_scanner.hex);
	    int sum = Func_hex._hex(func_convert.hexint, len);
	    System.out.println("十进制数为："+sum);
	    System.out.println("二进制数为"+Func_bin._convert(sum, 2));
	
}
}
