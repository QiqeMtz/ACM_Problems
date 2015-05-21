package COJ;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _3251 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String numero = leer.next();
        char[] numero_Descompuesto = numero.toCharArray();
        StringBuffer sb = new StringBuffer();
        int suma = 0;
        
        Arrays.sort(numero_Descompuesto);
        
        numero = String.copyValueOf(numero_Descompuesto);
        
        sb.append(numero);
        sb.reverse();
        numero = sb.toString();
        
        for (int i = 0; i < numero.length(); i++) {
            suma += numero.charAt(i) - 48;
        }
        
        if (suma % 3 == 0 && numero.charAt(numero.length()-1) == '0') {
            System.out.println(numero);
        } else{
            System.out.println("-1");
        }
    }
}
