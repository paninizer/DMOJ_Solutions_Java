import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = Integer.parseInt(br.readLine());
		System.out.println(in*5-400);
		if ((in*5-400)>100) {
			System.out.println(-1);
		}
		else if ((in*5-400)<100) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

    }
}
