package COJ;

import java.util.Scanner;

public class _2633 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numFiguras;
        char tipoFigura;
        double volumen = 0.0;
        double R, H, PI;

        PI = 3.14159;
        
        
        numFiguras = leer.nextInt();

        double[] vol_Figuras = new double[numFiguras];

        for (int i = 0; i < numFiguras; i++) {
            tipoFigura = leer.next().charAt(0);

            switch (tipoFigura) {
                case 'C':
                    R = leer.nextDouble();
                    H = leer.nextDouble();
                    volumen = (1.0 / 3.0) * PI * Math.pow(R, 2.0) * H;
                    break;
                case 'L':
                    R = leer.nextDouble();
                    H = leer.nextDouble();
                    volumen = PI * Math.pow(R, 2.0) * H;
                    break;
                case 'S':
                    R = leer.nextDouble();
                    volumen = (4.0/3.0) * PI * Math.pow(R, 3.0);
                    break;
            }
            vol_Figuras[i] = volumen;
        }
        
        vol_Figuras = burbuja(vol_Figuras);
        
        System.out.printf("%.3f\n", vol_Figuras[vol_Figuras.length-1]);

    }
    
    public static double[] burbuja(double[] arreglo){
        int i, j;
        double aux;
        
        for (i = 0; i < arreglo.length-1; i++) {
            for (j = 0; j <arreglo.length-i-1; j++) {
                if (arreglo[j+1] < arreglo[j]) {
                    aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        
        return arreglo;
    }
}
