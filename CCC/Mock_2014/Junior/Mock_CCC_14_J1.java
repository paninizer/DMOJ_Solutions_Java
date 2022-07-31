import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Lesson_7_hw_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Short A = Short.parseShort(br.readLine());
		Short B = Short.parseShort(br.readLine());
		Short R = Short.parseShort(br.readLine());
		

		if (A>R) {
			System.out.println("Bob overdoses on day 1.");
		}
		else if (A*0.5+B>R) {
			System.out.println("Bob overdoses on day 2.");
		}
		else {
			System.out.println("Bob never overdoses.");
		}
	}

}
