package COJ;


import java.util.Scanner;


public class _1066 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos, n;
        double r, p_Insc, p_Circu;
        double PI;
        
        PI = 3.141592653589793;
        
        nCasos = leer.nextInt();
        
        for (int i = 0; i < nCasos; i++) {
            r = leer.nextDouble();
            n = leer.nextInt();
            
            p_Insc = 2 * r * n * Math.sin(PI/n);
            p_Circu = 2 * n * r * Math.tan(PI/n);
            
            System.out.printf("%.4f %.4f\n",p_Insc, p_Circu);
        }
    }
}
