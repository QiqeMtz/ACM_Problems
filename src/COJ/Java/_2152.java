package COJ.Java;

import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2152 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nCasos;
        int num;
        int sum = 0;

        nCasos = leer.nextInt();

        for (int i = 0; i < nCasos; i++) {
            num = leer.nextInt();
            sum = 0;
            
            while(num > 0){
                sum += num %10;
                num /= 10;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
