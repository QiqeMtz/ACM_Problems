package COJ.Java;


import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2642 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos;
        String numeroBin;
        int numeroNormal;
        
        nCasos = leer.nextInt();
        
        for (int i = 1; i <= nCasos; i++) {
            
            numeroBin = leer.next(); //lee string binario
            numeroNormal = Integer.parseInt(numeroBin, 2); //convierte binario a int
            numeroBin = String.valueOf(numeroNormal); // regresas int a string
            
            numeroNormal = 0; //limpias para usar abajo 
            
            for (int j = 0; j < numeroBin.length(); j++) {
                numeroNormal += numeroBin.charAt(j)- 48;
            }
            System.out.println(numeroBin);
            System.out.println(numeroNormal);
            
            if (numeroNormal %3 == 0) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }  
    }
}
