package COJ.Java;


import java.util.Arrays;



/**
 *
 * @author EnriqueJM
 * 
 * Algoritmo de Euclides Extendido
 * 
 */
public class _MCD_Extendido {
    public static void main(String[] args) {
        
        int[] valores = calcula_MCD_Ext(105, 38);
        
        System.out.println(Arrays.toString(valores));
        System.out.println("\n(╯ಠ▃ಠ)╯︵ ┻━┻");
       
    }
    
    static int[] calcula_MCD_Ext(int a, int b){
        
        int i;
        System.out.println("a " + a);
        System.out.println("b " + b);
        
        int[] resultados = new int[3];
        int[]  r, s, t, q;
        
        r = new int[20000];
        s = new int[20000];
        t = new int[20000];
        q = new int[20000];
        
        r[0] = a;
        r[1] = b;
        s[0] = 1;
        s[1] = 0;
        t[0] = 0;
        t[1] = 1;
        
        
        int val1, val2, val3, val4;
        
        i = 1;
        
        while(r[i] != 0){
            /*
            q.add(r.get(i-1) / r.get(i));
            r.add(r.get(i-1) % r.get(i));
            s.add(s.get(i-1) - q.get(i) * s.get(i));
            t.add(t.get(i-1) - q.get(i) * t.get(i));
            
            
            System.out.println("r[i-1] " + r[i-1]);
            System.out.println("r[i] " + r[i]);
            System.out.println("s[i-1] " + s[i-1]);
            System.out.println("t[i-1] " + t[i-1]);
            System.out.println("q[i] " + q[i]);
            System.out.println("s[i] " + s[i]);
            */
            System.out.println(r[i-1] % r[i]);
            
            val1 = r[i-1] / r[i];
            val2 = r[i-1] % r[i];
            val3 = s[i-1] - (q[i] * s[i]);
            val4 = t[i-1] - (q[i] * t[i]);
            
            
            q[i] = val1;
            r[i+1] = val2;
            s[i+1] = val3;
            t[i+1] = val4;
            
            i++;
        }
        
        resultados[0] = (int)r[i-1];
        resultados[1] = (int)s[i-1];
        resultados[2] = (int)t[i-1];
        
        return resultados;
    }
}
