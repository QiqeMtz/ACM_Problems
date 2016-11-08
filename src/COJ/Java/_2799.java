package COJ.Java;


import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2799 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int a, b, g;
        
        a = leer.nextInt();
        b = leer.nextInt();
        g = leer.nextInt();
        
        //Un angulo podria ser valor cero (0) D: hay que verificar
        if ((a+b+g == 180)) {
            if (a == b && a == g && b == g) {
                System.out.println("Equilateral");
            }
            else if (a != b && a != g && b != g) {
                System.out.println("Scalene");
            }
            else{
                System.out.println("Isosceles");
            }
            
        }
        else{
            System.out.println("Error");
        }
    }
}
