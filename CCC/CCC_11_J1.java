import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte a = Byte.parseByte(br.readLine);
        byte e = Byte.parseByte(br.readLine);
        if (a>=3&&e<=4) {
          System.out.println("TroyMartian");
        }
        if (a<=6&&e>=2) {
          System.out.println("VladSaturnian");
        }
        if (a<=2&&e<=3) {
          System.out.println("GraemeMercurian");
        }
    }
}
