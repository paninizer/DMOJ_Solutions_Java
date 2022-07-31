import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String blank = br.readLine();
		String A = br.readLine();
		int temp1 = A.length()-A.replace("A", "").length();
    	int temp2 = A.length()-A.replace("B", "").length();
		if (temp1>temp2) {
			System.out.println("A");
		}
		else if (temp1<temp2) {
			System.out.println("B");
		}
		else {
			System.out.println("Tie");
		}
    }
}
