package COJ.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2867 {

    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        //Scanner leer = new Scanner(System.in);
        
        int G;
        long N;
        int i, j;
        
        while (cin.ready()) {
            N = Integer.parseInt(cin.readLine());
            //N = leer.nextInt();
            G = 0;
            for (i = 1; i <= N; i++) {
                for (j = i; j <= N; j++) {
                    G += calcula_MCM(i, j);
                }
            }
            System.out.println(G);
        }
        out.close();
    }

    static double calcula_MCM(int a, int b) {

        double mcm = (a * b) / calcula_MCD(a, b);

        return mcm;
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
