import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte streat = Byte.parseByte(br.readLine);
        byte mtreat = Byte.parseByte(br.readLine);
        byte ltreat = Byte.parseByte(br.readLine);
        if ((streat+2*mtreat+3*ltreat)>=10) {
          System.out.println("happy");
        }
        else {
          System.out.println("sad");
        }
    }
}
