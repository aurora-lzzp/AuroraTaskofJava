package hex;

public class Func_convert {
	public int[] hexint = new int[64];
	public int _convert(String hex){
		/*convert string to integer*/
		int bo = hex.length() ;
        char[] hexarr = hex.toCharArray();

		int i;
		for(i=0;i<hex.length();i++){
			switch (hexarr[i]){
			case 'a':
			case 'A': hexint[i] = 10;break;
			case 'b':
			case 'B': hexint[i] = 11;break;
			case 'c':
			case 'C': hexint[i] = 12;break;
			case 'd':
			case 'D': hexint[i] = 13;break;
			case 'e':
			case 'E': hexint[i] = 14;break;
			case 'f':
			case 'F': hexint[i] = 15;break;
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '0':
				hexint[i] = (int)hexarr[i] - 48;break;
			}
		}
		return bo;
		
	}

}
