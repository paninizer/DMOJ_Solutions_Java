import java.io.*;

public class CCC_03_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		int n, min, mini = 0, minn = 0;
		while (p!=0) {
			min = Integer.MAX_VALUE;
			for (int i = (int) Math.sqrt(p); i>0; i--) {
				if (p%i==0) {
					n=p/i;
					if (i+i+n+n<min) {
						min = i+i+n+n;
						mini = i;
						minn = n;
					}
				}
			}
			System.out.printf("Minimum perimeter is %d with dimensions %d x %d\n", min, mini, minn);
			p = Integer.parseInt(br.readLine());
		}
	}

}
