import java.util.*;
import java.io.*;

class Stoken{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a line of integers");
        String s = sc.next();
        StringTokenizer st = new StringTokenizer(s,",");
       int sum = 0;
        while(st.hasMoreTokens()){
           int i= 0;
           String n = st.nextToken();
           System.out.println(n);
           i   = Integer.parseInt(n);
           sum = sum + i;
           }
        System.out.println("sum is" + sum);
    }
}