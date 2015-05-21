package COJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


/**
 *
 * @author EnriqueJM
 */
public class _2916 {
    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        
        while(cin.ready()){
            String arr[] = cin.readLine().split(" ");
            
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            double mcd = calcula_MCD(a, b);
            
            if (mcd == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        out.close();
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
