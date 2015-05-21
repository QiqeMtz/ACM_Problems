package COJ;

/**
 *
 * @author EnriqueJM
 */
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2916_Scanner {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        while(true){
            
            int a = leer.nextInt();
            int b = leer.nextInt();
            double mcd = calcula_MCD(a, b);
            
            if (mcd == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
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
