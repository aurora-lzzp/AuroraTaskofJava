package hex;

public class Func_hex {
	public static int _hex (int[] arr,int len){
		int result = 0;
		for(int i = 0; i<len;i++){
			result = result * 16 +arr[i];
			}
		return result;
	}

}
