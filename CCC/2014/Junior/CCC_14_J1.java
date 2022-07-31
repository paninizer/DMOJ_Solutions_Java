import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Byte A = Byte.parseByte(br.readLine());
        Byte B = Byte.parseByte(br.readLine());
        Byte C = Byte.parseByte(br.readLine());
        if (A==60&&B==60&&C==60) {
          System.out.println("Equilateral");
        }
        else if (A+B+C==180&&(A==B||C==B||A==C)) {
          System.out.println("Isosceles");
        }
        else if (A+B+C==180&&A!=B&&A!=C&&B!=C) {
          System.out.println("Scalene");
        }
        else {
          System.out.println("Error");
        }
    }
}
