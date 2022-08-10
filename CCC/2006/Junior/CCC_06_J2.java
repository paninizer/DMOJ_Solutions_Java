import java.io.*;

public class CCC_06_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i=1; i<=m; i++) {
			for (int j=1; j<=n; j++) {
				if (i+j==10) count++;
			}
		}
		if (count==1) System.out.println("There is 1 way to get the sum 10.");
		else System.out.println("There are "+count+" ways to get the sum 10.");
	}

}
