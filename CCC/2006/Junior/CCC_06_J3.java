import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_06_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ones = "adgjmptw-";
		String twos = "behknqux";
		String threes = "cfilorvy";
		
		String k2 = "abc", k3 = "def", k4 = "ghi", k5 = "jkl", k6 = "mno", k7 = "pqrs", k8 = "tuv", k9 = "wxyz";
		
		while (true) {
			String input = br.readLine();
			if (input.equals("halt")) break;
			char[] arr = input.toCharArray();
			int seconds = 0;
			int l = arr.length;
			for (int i=0; i<l; i++) {
				if (ones.contains(String.valueOf(arr[i]))) seconds++;
				else if (twos.contains(String.valueOf(arr[i]))) seconds+=2;
				else if (threes.contains(String.valueOf(arr[i]))) seconds+=3;
				else seconds+=4;
				
				if (i<l-1) {
					if ((k2.contains(""+arr[i])&&k2.contains(""+arr[i+1]))||
						(k3.contains(""+arr[i])&&k3.contains(""+arr[i+1]))||
						(k4.contains(""+arr[i])&&k4.contains(""+arr[i+1]))||
						(k5.contains(""+arr[i])&&k5.contains(""+arr[i+1]))||
						(k6.contains(""+arr[i])&&k6.contains(""+arr[i+1]))||
						(k7.contains(""+arr[i])&&k7.contains(""+arr[i+1]))||
						(k8.contains(""+arr[i])&&k8.contains(""+arr[i+1]))||
						(k9.contains(""+arr[i])&&k9.contains(""+arr[i+1])))
						seconds+=2;
				}
			}
			System.out.println(seconds);
		}
	}

}
