import java.io.*;
import java.util.StringTokenizer;

public class Big_Deposits {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long P = Long.parseLong(st.nextToken());
		long Y = Long.parseLong(st.nextToken()), T = Long.parseLong(st.nextToken());
		
		long low = 0, high = T+1, ans = 0;
		
		while (low<=high) {
			long mid = (low+high)/2;
			long e = 0;
			for (int i=0; i<Y; i++) {
				e+=mid;
				e=e*(100+P)/100;
				if (e>=T) break;
			}
			if (e<T) {
				low = mid+1;
			} else if (e>=T) {
				high = mid-1;
				ans = mid;
			}
		}
		System.out.println(ans);
		
		
	}

}
