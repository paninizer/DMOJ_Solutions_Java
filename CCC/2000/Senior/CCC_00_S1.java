import java.io.*;

public class CCC_00_S1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = Integer.parseInt(br.readLine());
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int third = Integer.parseInt(br.readLine());
		int plays =0;
		
		while (money>=1) {
			first++;
			money--;
			plays++;
			if (first==35) {
				money+=30;
				first=0;
			}
			if (money==0) break;
			
			second++;
			money--;
			plays++;
			if (second==100) {
				money+=60;
				second=0;
			}
			if (money==0) break;
			
			third++;
			money--;
			plays++;
			if (third==10) {
				money+=9;
				third=0;
			}
			if (money==0) break;
		}
		
		System.out.println("Martha plays "+plays+" times before going broke.");
	}

}
