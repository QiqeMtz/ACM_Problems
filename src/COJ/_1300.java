package COJ;


import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author EnriqueJM
 */
public class _1300 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n;
        Stack<Integer> pila = new Stack<Integer>();
        
        for (int i = 0; i < 10; i++) {
            n = leer.nextInt();
            pila.push(n % 42);
        }
        
        System.out.println(pila.size());
    }
}
