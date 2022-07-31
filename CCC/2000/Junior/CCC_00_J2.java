import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_00_J2 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Short startindex = Short.parseShort(br.readLine());
		Short endindex = Short.parseShort(br.readLine());
		boolean shouldcheck = true;
		short count=0;
		for (short i = startindex; i<=endindex; i++) {
			char check[] = String.valueOf(i).toCharArray();
			char reversecheck[] = new char[String.valueOf(i).length()];
			short l = (short) (check.length - 1);
			for (short j=0; j<=l; j++) {
				if (check[l-j]=='6') reversecheck[j] = '9';
				else if (check[l-j]=='9') reversecheck[j] = '6';
				else if (check[l-j]=='1'||check[l-j]=='8'||check[l-j]=='0') reversecheck[j] = check[l-j];
				else {
					shouldcheck=false;
					break;
				}
			}
			if (String.valueOf(check).equals(String.valueOf(reversecheck))&&shouldcheck==true) count++;
			shouldcheck=true;
		}
		System.out.println(count);
	}

}
