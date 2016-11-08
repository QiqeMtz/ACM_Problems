package COJ.Java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 * 
 * Algoritmo con implementación de búsqueda binaria
 * 
 * j es el limite maximo o rango en el que se va a buscar
 * 
 * i es el inicio del rango
 * 
 * m es el punto medio
 * 
 * tm es el numero que se encuentre en el punto medio o punto
 * 
 */
public class _binary_search {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        BigInteger numero;

        numero = leer.nextBigInteger();

        while (!numero.equals(BigInteger.ZERO)) {
            BigInteger j = new BigInteger("5656854249");
            //BigInteger j = new BigInteger("50");
            BigInteger i = new BigInteger("1");
            BigInteger m = new BigInteger("0");
            BigInteger tm = new BigInteger("0");

            m = calcula_M(i, j);
            tm = calcula_TM(m);
            
            while(!tm.equals(numero) && (j.subtract(i)).compareTo(BigInteger.ONE) > 0){
                //System.out.println("Valor de tm: " + tm);
                //System.out.println("Valor de m: " + m);
                //System.out.println("Valor de comparacion: " + (tm.compareTo(numero)));
                if (tm.compareTo(numero) > 0) {
                    j = m;
                } else{
                    i = m.add(BigInteger.ONE);
                }
                
                m = calcula_M(i, j);
                tm = calcula_TM(m);
            }
            
            if (tm.compareTo(numero) == 0) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            
            numero = leer.nextBigInteger();
        }

    }

    //Hallar numero triangular
    static BigInteger calcula_TM(BigInteger M) {
        //BigInteger numTriangular;
        //BigInteger j = new BigInteger("32000000000");
        BigInteger Tm;
        BigInteger dos = new BigInteger("2");

        Tm = M.multiply((M.add(BigInteger.ONE)));
        Tm = Tm.divide(dos);

        return Tm;
    }

    //Hallar punto medio
    static BigInteger calcula_M(BigInteger i, BigInteger j) {
        BigInteger m = new BigInteger("0");
        BigInteger dos = new BigInteger("2");
        m = i.add(j);

        m = m.divide(dos);

        return m;
    }
}
