package COJ;


import java.util.Scanner;

public class _1483 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int val1;
        
        String s;
        
        s = read.next();
        
        if(s.equals("square")){
            val1 = read.nextInt();
            System.out.printf("%d\n", val1 * val1);
        }
        else if(s.equals("rectangle")){
            int val2;
            val1 = read.nextInt();
            val2 = read.nextInt();
            System.out.printf("%d\n", val1 * val2);
        }
    }
}
