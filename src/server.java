import java.util.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = in.nextInt();
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            sum += in.nextInt();
            if(sum <= total) count++;
        }
        System.out.println(count);
    }
}