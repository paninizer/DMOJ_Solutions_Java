import java.io.*;
import java.util.StringTokenizer;

public class FHC_15_Round_1_P1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 10000000, i, j;
		byte[] primacity = new byte[max+1];
		for(i = 2; i <= max; i+=2) {
			primacity[i]++;
		}
		for(i = 3; i <= max; i+=2) {
			if(primacity[i] != 0) continue;
			for(j = i; j <= max; j+=i) {
				primacity[j]++;
			}
		}
		
		
		int num = Integer.parseInt(br.readLine());
		
		for (i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			if(t == 8) {
				if(a <= 9699690 && b >= 9699690) ans = 1;
			} else if(t < 8) {
				for(; a <= b; a++) if(primacity[a] == t) ans++;
			}
			
			System.out.println("Case #"+i+": "+ans);
		}
	}

}
