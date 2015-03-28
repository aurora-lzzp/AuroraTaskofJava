package hex;

public class Func_bin {
	public static String _convert(int source,int radix){
        char[] charrad= new char[64];
        for (int i = 0; ; i++)
        {
            if (source % radix < 10)
            {
                charrad[i] = (char)(source % radix + 48);          
            }
            else
            {
                switch(source % radix)
                {
                    case 10: charrad[i] = 'a'; break;
                    case 11: charrad[i] = 'b'; break;
                    case 12: charrad[i] = 'c'; break;
                    case 13: charrad[i] = 'd'; break;
                    case 14: charrad[i] = 'e'; break;
                    case 15: charrad[i] = 'f'; break;
                } 
            }
                source /= radix;
                if (source == 0)
                {
                    break;
                }
            }
        String rad = new String(charrad);
        rad = _reverse(rad);
        return rad;
	}
	private static String _reverse(String str){
        StringBuilder sb = new StringBuilder(str.indexOf('\0'));
        for (int index = str.indexOf('\0') - 1; index >= 0; index--)
        {

            sb.append(str.charAt(index));

        }
        return sb.toString();
	}
}
