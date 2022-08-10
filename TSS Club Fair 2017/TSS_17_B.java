import java.io.*;
import java.util.Arrays;

public class TSS_17_B {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ins = br.readLine().split(" ");
		int n = Integer.parseInt(ins[0]);
		int q = Integer.parseInt(ins[1]);
		
		double[] coords = new double[n];
		
		for (int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");
			double x = Math.abs(Double.parseDouble(input[0]));
			double y = Math.abs(Double.parseDouble(input[1]));
			
			double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			
			coords[i]=distance;
		}
		Arrays.sort(coords);
		
		for (int i=0; i<q; i++) {
			double range = Double.parseDouble(br.readLine());
			
			int low = 0, high = coords.length-1, ans = 0;
			
			while (low<=high) {
				int mid = (low+high)/2;
				if (range>=coords[coords.length-1]) {
					ans = n;
					break;
				}
				if (range<coords[mid]) {
					high = mid-1;
					ans=mid;
				} else if (range>=coords[mid]) {
					low = mid+1;
				}
			}
			
			System.out.println(ans);

		}
		
	}

}
