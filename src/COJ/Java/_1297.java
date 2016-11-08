package COJ.Java;


import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _1297 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos;
        String numero;
        
        nCasos = leer.nextInt();
        
        for (int i = 0; i < nCasos; i++) {
            numero = leer.next();
            calcula_Div(numero);
        }   
    }
    
    static void calcula_Div(String numero){
        Boolean bandera_11 = false;
        Boolean bandera_9 = false;
        Boolean bandera_5 = false;
        int suma = 0;
        int sumaImpar = 0;
        int total = 0;
        
        //Divisible por 495 = 11 * 9 * 5 <----- Revisar divisibilidad por esas 3 cifras
        
        //Suma par
        for (int i = 0; i < numero.length(); i += 2) {
            suma += numero.charAt(i) - 48;
        }
        
        //Suma impar
        for (int i = 1; i < numero.length(); i += 2) {
            sumaImpar += numero.charAt(i) - 48;
        }
        
        total = suma - sumaImpar;
        
        if (total % 11 == 0) {
            bandera_11 = true;
        } else {
            bandera_11 = false;
        }
        
        
        //Div por 9
        suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            suma += numero.charAt(i) - 48;
        }
        
        if (suma % 9 == 0) {
            bandera_9 = true;
        } else{
            bandera_9 = false;
        }
        
        //Div por 5
        if (numero.charAt(numero.length()-1) == '5' || numero.charAt(numero.length()-1) == '0') {
            bandera_5 = true;
        } else{
            bandera_5 = false;
        }
        
        if (bandera_11 == true && bandera_9 == true && bandera_5 == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
