import java.io.*;

public class CCC_20_J4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		String S = br.readLine();
		
		for (int i=0; i<S.length(); i++) {
			String aShift = S.substring(i)+S.substring(0,i);
			if (A.contains(aShift)) {
				System.out.println("yes");
				System.exit(0);
			}
		}
		System.out.println("no");

	}

}
