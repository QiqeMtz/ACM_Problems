package COJ.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author EnriqueJM
 */
public class _Criba_Eratostenes {

    public static void main(String[] args) {
        List<Integer> n_Primos;

        n_Primos = calcula_Criba(100);

        System.out.println(n_Primos);
    }

    static List<Integer> calcula_Criba(int n_Tope) {
        boolean[] criba = new boolean[n_Tope];

        List<Integer> numeros_Primos = new ArrayList<Integer>();

        for (int i = 2; i < (int) Math.sqrt(n_Tope); i++) {
            if (!criba[i]) {
                for (int j = i + i; j < (int) Math.sqrt(n_Tope); j += i) {
                    criba[j] = true;
                    //System.out.println("(╯ಠ▃ಠ)╯︵ ┻━┻");
                }
            }
        }

        for (int i = 2; i < (int) Math.sqrt(n_Tope); i++) {
            if (!criba[i]) {
                numeros_Primos.add(i);
            }
        }

        return numeros_Primos;
    }
}
