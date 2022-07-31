import java.io.*;
import java.util.Arrays;
public class CCC_13_S1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer input = Integer.parseInt(br.readLine());
		boolean check = true;
		while (check==true) {
			input++;
			char[] checkarr = input.toString().toCharArray();
			int count = 1;
		    Arrays.sort(checkarr);
		    for (int i = 0; i < checkarr.length - 1; i++) {
		        if (checkarr[i] != checkarr[i + 1]) {
		            count++;
		        }
		    }
		    if (count==checkarr.length) {
		    	System.out.println(input);
		    	check=false;
		    }
		}
	}

}
