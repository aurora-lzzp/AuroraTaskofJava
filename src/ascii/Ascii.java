package ascii;

public class Ascii {

	public static void main(String[] args) {
		String ascii = "hello!123";
		char[] ascarr = ascii.toCharArray();
		for (int i=0;i<ascii.length();i++){
            System.out.println((int)ascarr[i]);
		}
		

	}

}
