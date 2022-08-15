import java.io.*;

public class CCC_12_J4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int r = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		String ans = "";
		
		for (int i=0; i<s.length(); i++) {
			int w = alpha.indexOf(s.charAt(i));
			w-=(r+3*(i+1));
			if (w<0) w+=26;
			ans = ans + alpha.charAt(w);
		}
		System.out.println(ans);
	}

}
