import java.io.*;
import java.util.*;

public class oddities {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int x = in.nextInt();
			if(Math.abs(x) % 2 == 1) {
				System.out.println(x + " is odd");
			}
			else {
				System.out.println(x + " is even");
			}
		}
	}

}
