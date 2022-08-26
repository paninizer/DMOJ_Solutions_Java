import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Alpaca_Shapes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        	String  lines = br.readLine();    
        
        	String[] strs = lines.trim().split("\\s+");
        	double[] a = new double[2];
        	a[0] = Double.parseDouble(strs[0]);
        	a[1] = Double.parseDouble(strs[1]);
        
        	double squarearea = Math.pow(a[0], 2);
        	double circlearea = Math.pow(a[1], 2)*3.14;
        
        	if(squarearea>circlearea) {
        		System.out.println("SQUARE");
        	}
        	else {
        		System.out.println("CIRCLE");
        	}
	}

}
