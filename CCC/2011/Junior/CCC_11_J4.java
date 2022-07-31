import java.io.*;
import java.util.ArrayList;

public class CCC_11_J4 {

	public static String travel (String dir, String pos, int leng, ArrayList<String> collection) {
		int curx = Integer.parseInt(pos.split(" ")[0]);
		int cury = Integer.parseInt(pos.split(" ")[1]);

		boolean safe = true;

		switch(dir) {
		case "l":
			for (int i=0; i<leng; i++) {
				curx-=1;
				if (collection.contains(curx+" "+cury)) {
					collection.add(curx+" "+cury);
					safe=false;
				} else {
					collection.add(curx+" "+cury);
				}
			}
			break;

		case "r":
			for (int i=0; i<leng; i++) {
				curx+=1;
				if (collection.contains(curx+" "+cury)) {
					collection.add(curx+" "+cury);
					safe=false;
				} else {
					collection.add(curx+" "+cury);
				}
			}
			break;
			
		case "u":
			for (int i=0; i<leng; i++) {
				cury+=1;
				if (collection.contains(curx+" "+cury)) {
					collection.add(curx+" "+cury);
					safe=false;
				} else {
					collection.add(curx+" "+cury);
				}
			}
			break;
			
		case "d":
			for (int i=0; i<leng; i++) {
				cury-=1;
				if (collection.contains(curx+" "+cury)) {
					collection.add(curx+" "+cury);
					safe=false;
				} else {
					collection.add(curx+" "+cury);
				}
			}
			break;
		}

		return (safe) ? "safe": "DANGER";
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> traversed = new ArrayList<String>();
        String start = "0 -1";
        traversed.add(start);
        travel("d", start, 2, traversed);
        travel("r", traversed.get(traversed.size() - 1), 3, traversed);
        travel("d", traversed.get(traversed.size() - 1), 2, traversed);
        travel("r", traversed.get(traversed.size() - 1), 2, traversed);
        travel("u", traversed.get(traversed.size() - 1), 2, traversed);
        travel("r", traversed.get(traversed.size() - 1), 2, traversed);
        travel("d", traversed.get(traversed.size() - 1), 4, traversed);
        travel("l", traversed.get(traversed.size() - 1), 8, traversed);
        travel("u", traversed.get(traversed.size() - 1), 2, traversed);
        String[] command = br.readLine().split(" ");

        while (!command[0].equals("q")) {
        	String dir = command[0];
        	int leng = Integer.parseInt(command[1]);
        	String cond = travel(dir, traversed.get(traversed.size() - 1), leng, traversed);
            String end = traversed.get(traversed.size() -1);
            String ans = end + " " + cond;
            System.out.println(ans);
            if (cond.equals("DANGER")) break;
            command = br.readLine().strip().split(" ");
        }
	}

}
