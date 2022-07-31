import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte a = Byte.parseByte(br.readLine());
		byte b = Byte.parseByte(br.readLine());
		byte c = Byte.parseByte(br.readLine());
		System.out.println("The 1-3-sum is "+(91+a+b*3+c));
    }
}
