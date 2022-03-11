import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double bmi = (weight/Math.pow(height, 2));
        if (bmi>25) {
          System.out.println("Overweight");
        }
            if (bmi<18) {
          System.out.println("Underweight");
        }
        if (bmi>=18.5&&bmi<=25) {
          System.out.println("Normal weight");
        }
    }
}
