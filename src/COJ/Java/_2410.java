package COJ.Java;


import java.util.Scanner;


public class _2410 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos, A, N;
        double resultado;
        
        nCasos = leer.nextInt();
        
        for (int i = 1; i <= nCasos; i++) {
            A = leer.nextInt();
            N = leer.nextInt();
            
            resultado = Math.pow(A, 2) * Math.pow(1.0/2.0, N-1);
            
            System.out.printf("Case #%d: %.2f\n", i, resultado);
        }
    }
}
