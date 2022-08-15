import java.io.*;
import java.util.StringTokenizer;
public class CCC_17_J3 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int sx = Integer.parseInt(st.nextToken());
		int sy = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int ex = Integer.parseInt(st.nextToken());
		int ey = Integer.parseInt(st.nextToken());
		
		int charge = Integer.parseInt(br.readLine());

		int cost = Math.abs(ex-sx)+Math.abs(ey-sy);
		
		if (charge==cost) {
			System.out.println("Y");
		} else if (charge>cost) {
			if ((cost-charge)%2==0) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		} else {
			System.out.println("N");
		}
    }

}
