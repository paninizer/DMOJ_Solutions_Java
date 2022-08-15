import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte apple3 = Byte.parseByte(br.readLine());
        byte apple2 = Byte.parseByte(br.readLine());
        byte apple1 = Byte.parseByte(br.readLine());
        byte banana3 = Byte.parseByte(br.readLine());
        byte banana2 = Byte.parseByte(br.readLine());
        byte banana1 = Byte.parseByte(br.readLine());

        if ((3*apple3+2*apple2+apple1)>(3*banana3+2*banana2+banana1)) {
          System.out.println("A");
        }
        else if ((3*apple3+2*apple2+apple1)<(3*banana3+2*banana2+banana1)) {
          System.out.println("B");
        }
        else {
          System.out.println("T");
        }
    }
}
