import java.io.*;

public class CCC_11_J2 {
	
	static int calc(int h, int t) {
		for (int i=1; i<=t; i++) {
			double A = -6*Math.pow(i, 4)+h*(Math.pow(i, 3))+2*(Math.pow(i, 2))+i;
			if (A<=0) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int h = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		
		int ans = calc(h, t);
		if (ans==Integer.MAX_VALUE) {
			System.out.println("The balloon does not touch ground in the given time.");
		} else {
			System.out.println("The balloon first touches ground at hour:\r\n"+ ans);
		}
	}

}
