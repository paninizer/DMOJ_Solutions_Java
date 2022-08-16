import java.io.*;

public class SEED_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		boolean[] complete = new boolean[5];
		
		if (input.contains("B")) complete[0]=true;
		if (input.contains("F")) complete[1]=true;
		if (input.contains("T")) complete[2]=true;
		if (input.contains("L")) complete[3]=true;
		if (input.contains("C")) complete[4]=true;
		
		if (!complete[0]) {
			System.out.println('B');
		} 
		if (!complete[1]) {
			System.out.println('F');
		} 
		if (!complete[2]) {
			System.out.println('T');
		} 
		if (!complete[3]) {
			System.out.println('L');
		} 
		if (!complete[4]) {
			System.out.println('C');
		} 
		
		if (complete[0]&&complete[1]&&complete[2]&&complete[3]&&complete[4]) {
			System.out.println("NO MISSING PARTS");
		}
	}

}
