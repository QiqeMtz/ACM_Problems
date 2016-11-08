package COJ.Java;


import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2853 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int lado;
        double A = 0.0;
        double area = 0.0;
        
        lado = leer.nextInt();
        while(lado != 0){
            A = (double) lado;
            
            area = Math.pow(A, 2.0) * (1.0 - 1.0/2.0 * (Math.pow((2.0 - Math.sqrt(2.0)), 2.0)));
            
            System.out.printf("%.3f\n", area);
            
            lado = leer.nextInt();
            area = 0.0;
            A = 0.0;
        }
    }
}
