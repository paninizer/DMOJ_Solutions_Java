import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_01_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short input = Short.parseShort(br.readLine());
		
		short lineNum =1;
		short astNum =1;
		while (lineNum <= Math.floor(input/2)) {
			for (short i=0; i<astNum; i++) System.out.print("*");
			for (short i=0; i<(input*2)-(astNum*2); i++) System.out.print(" ");
			for (short i=0; i<astNum; i++) System.out.print("*");
			astNum+=2;
			lineNum++;
			System.out.println();
		}
		for (short i=0; i<input*2; i++) {
			System.out.print("*");
		}
		System.out.println();
		lineNum=0;
		astNum-=2;
		while (lineNum <= Math.floor(input/2)) {
			for (short i=0; i<astNum; i++) System.out.print("*");
			for (short i=0; i<(input*2)-(astNum*2); i++) System.out.print(" ");
			for (short i=0; i<astNum; i++) System.out.print("*");
			astNum-=2;
			lineNum++;
			System.out.println();
		}
	}

}
