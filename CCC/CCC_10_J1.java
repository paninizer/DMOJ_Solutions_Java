import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		byte n = Byte.parseByte(st.nextToken());
		int count =0;
		for(int a=0;a<=5;a++) {
			for(int b=0;b<=5;b++) {
				if(a+b==n) {
					if(a==b) {
						count= count+1;
					}
					count++;
				}
			}
		}
		System.out.println(count/2);
		
    }
}
