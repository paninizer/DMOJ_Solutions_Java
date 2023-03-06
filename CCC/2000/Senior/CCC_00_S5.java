import java.io.*;
import java.text.*;


public class CCC_00_S5 {

	static double[] x;
	static double[] y;
	static boolean[] out;
	static double xm, ym, s, p;
	static int n;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat formatter = new DecimalFormat("0.00");

		n=Integer.parseInt(br.readLine());
		
		x = new double[n];
		y = new double[n];
		out = new boolean[n+1];

		for (int i=0; i<n; i++) {
			x[i]=Double.parseDouble(br.readLine())*1000;
			y[i]=Double.parseDouble(br.readLine())*1000;
			out[i]=false;
		}

		for (int i=0; i<n; i++) {
			double left=0, right=1000000;
			for (int j=0; j<n; j++) {
				if (!out[n]&&!out[j]&&i!=j) {
					xm = (x[i]+x[j]);
					ym = (y[i]+y[j]);
					s = (x[i]-x[j])/(y[j]-y[i]);
					if (s==0) {
						if (y[i]<y[j]) {
							out[j] = true;
						}
						else {
							out[i] = true;
						}
					} else {
						p = xm-ym/s;
						if (x[j]<x[i]) {
							left = Math.max(p, left);
						} else {
							right = Math.min(p, right);
						}
					}
				}
			}
			if (left > right) {
				out[i] = true;
			}
		}
		
		for (int i=0; i<n; i++) {
			if (!out[i]) {
				System.out.println("The sheep at ("+formatter.format(x[i]/1000)+", "+formatter.format(y[i]/1000)+") might be eaten.");
			}
		}

	}
}
