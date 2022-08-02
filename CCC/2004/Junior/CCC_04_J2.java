import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_04_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("All positions change in year "+start);
		
		for (int i=start+1; i<=end; i++) {
			int diff = i-start;
			if (diff%4==0&&diff%3==0&&diff%2==0&&diff%5==0) {
				System.out.println("All positions change in year "+i);
			}
		}
	}

}
