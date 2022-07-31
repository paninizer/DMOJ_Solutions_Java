import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte input = Byte.parseByte(br.readLine());
        if (input==1) {
          System.out.println("\n      *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println();
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *\n");
          System.out.flush();
        }
        else if (input==2) {
          System.out.println(" * * *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println(" * * *");
          System.out.println("*");
          System.out.println("*");
          System.out.println("*");
          System.out.println(" * * *");
          System.out.flush();
        }
        else if (input==3) {
          System.out.println(" * * *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println(" * * *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println(" * * *");
          System.out.flush();   
        }
        else if (input==4) {
          System.out.println("\n*     *");
          System.out.println("*     *");
          System.out.println("*     *");
          System.out.println(" * * *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *\n");
          System.out.flush();
        }
        else if (input==5) {
          System.out.println(" * * *");
          System.out.println("*");
          System.out.println("*");
          System.out.println("*");
          System.out.println(" * * *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println(" * * *");
          System.out.flush();
        }
        else if (input==6) {
           System.out.println(" * * *");
           System.out.println("*");
           System.out.println("*");
           System.out.println("*");
           System.out.println(" * * *");
           System.out.println("*     *");
           System.out.println("*     *");
           System.out.println("*     *");
           System.out.println(" * * *");
           System.out.flush();
        }
        else if (input == 7) {
          System.out.println(" * * *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *");
          System.out.println();
          System.out.println("      *");
          System.out.println("      *");
          System.out.println("      *\n");
          System.out.flush();
        }
        else if (input==8) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.flush();
        }
        else if (input==9) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");
            System.out.flush();
        }
        else if (input ==0) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println();
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.flush();
        }
    }
}
