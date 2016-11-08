package COJ.Java;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 *
 * Prime Numbers 1136
 *
 */
public class _1136 {

    static List<Integer> lista_Primos;
    static boolean[] criba = new boolean[32000];

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nCasos = 0;
        int n = 0;
        int m = 0;
        int i = 0;
        int j = 0;
        
       
        lista_Primos = calcula_Criba(32000);


        nCasos = leer.nextInt();

        for (i = 0; i < nCasos; i++) {
            
            m = leer.nextInt();
            n = leer.nextInt();
            int ultimo_numero = lista_Primos.get(lista_Primos.size()-1);
            
            /*Ejemplo en el caso
                1
                1 10
                Tira error porque el 10 no es primo y no lo encuentra, arroja -1
            
                Usar la matriz de booleans para buscar los primos menores a 32000,
                para los mayores a 32000 utilizar primalidad dividiendo el numero entre la criba
                
            
                En el caso 3 5 no da -1 porque el 5 si es primo y si está en la lista
            */
            int indice_final = lista_Primos.indexOf(n);
            
            if (m == 1)
                m = 2;
            int n1 = Arrays.asList(criba).indexOf(n);
            
            //El numero esta en la criba hasta raiz de 10 a la 9 // es array de boolean, hay que sacar el index
            if (n <= ultimo_numero) {
                for (j = Arrays.asList(criba).indexOf(m) ; j < Arrays.asList(criba).indexOf(n); j++) {
                    
                    // *******************     -->   no entra al pinche if -_-"
                    if (criba[j] == true) {
                        System.out.println(j);
                    }
                }
            }
        }
    }

    static List<Integer> calcula_Criba(int n_Tope) {
        //boolean[] criba = new boolean[n_Tope];

        List<Integer> numeros_Primos = new ArrayList<>();

        for (int i = 2; i < n_Tope; i++) {
            if (!criba[i]) {
                for (int j = i + i; j < n_Tope; j += i) {
                    criba[j] = true;
                }
            }
        }

        for (int i = 2; i < n_Tope; i++) {
            if (!criba[i]) {
                numeros_Primos.add(i);
            }
        }

        return numeros_Primos;
    }
}
