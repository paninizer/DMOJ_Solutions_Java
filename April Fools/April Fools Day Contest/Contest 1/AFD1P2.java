import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input.charAt(3)+""+input.charAt(2)+""+input.charAt(7)+""+input.charAt(0)+""+input.charAt(5)+""+input.charAt(1)+""+input.charAt(4)+""+input.charAt(6));
    }
}
