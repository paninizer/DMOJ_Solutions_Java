import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    byte Younger = Byte.parseByte(br.readLine());
    byte Middle = Byte.parseByte(br.readLine());
    System.out.println(2*Middle-Younger);

    }
}
