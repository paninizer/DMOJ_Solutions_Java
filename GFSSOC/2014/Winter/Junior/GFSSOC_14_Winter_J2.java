import java.io.*;

public class GFSSOC_14_Winter_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int startx =0;
		int starty =0;
		for (int i=0; i<input; i++) {
			String dir = br.readLine();
			int leng = Integer.parseInt(br.readLine());

			if (dir.equals("North")) {
				starty+=leng;
			} else if (dir.equals("South")) {
				starty-=leng;
			} else if (dir.equals("West")) {
				startx-=leng;
			} else if (dir.equals("East")) {
				startx+=leng;
			}
		}
		System.out.println(startx + " " + starty);
	}

}
