package COJ.Java;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EnriqueJM: Algoritmo de Euclides para el MCD de dos números
 *
 */
public class _MCD {
    
    
    
    public static void main(String[] args) {
        //System.out.println(calcula_MCD(110, 15));
        
        double MCM = 0;
        
        int[] numeros = {1, 2, 4, 5};
        int i = 2;
        int a = 0, b = 0;
        
        a = numeros[0];        
        
        
        for (int j = 1; j < numeros.length; j++) {
            a = calcula_MCM(a, numeros[j]);
        }
        System.out.println(a);
        
        /*
        do {
            MCM = calcula_MCM(a, b);
            
            a = (int)MCM;
            
            b = numeros[i];
            i++;
            
        } while (MCM != 1);
        */
        
        //System.out.println(i <= 3 && MCM != 1);
    }

    static int calcula_MCM(int a ,int b){
        
        double mcm = (a * b)/calcula_MCD(a, b);
        
        return (int)mcm;
    }
    
    static double calcula_MCD(int _n, int _m) {
        double a, b, r, resp;
        a = b = r = resp = 0;

        if (_m == 0) {
            resp = _n;
        } else {
            a = _n;
            b = _m;
            r = _m;
        }

        while (r != 0) {
            //arriba o abajo
            resp = r;
            r = a % b;
            a = b;
            b = r;
        }
        return resp;
    }
}
