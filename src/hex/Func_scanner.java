package hex;

import java.util.Scanner;

public class Func_scanner {
	public  String hex;
	public  void _scan(){
		/*build a Scanner to receive the input*/
	    Scanner scan = new Scanner(System.in);
	    System.out.println("������һ��ʮ����������\n");
	    hex = scan.nextLine();
	    scan.close();
	
	}

}
