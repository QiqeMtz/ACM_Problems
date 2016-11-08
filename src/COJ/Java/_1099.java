package COJ.Java;

import java.util.Scanner;

public class _1099 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int a, b, c, mayor, medio, chico;
        mayor = medio = chico = 0;
        
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        
        while(true){
            
            
            
            
            if(a > b && a > c){
                mayor = a;
                if(b > c){
                    medio = b;
                    chico = c;
                } else {
                    medio = c;
                    chico = b;
                }
            } else if(b > a && b > c){
                mayor = b;
                if(a > c){
                    medio = a;
                    chico = c;
                } else{
                    medio = c; 
                    chico = a;
                }
            } else{
                mayor = c;
                if(a > b){
                    medio = a;
                    chico = b;
                } else{
                    medio = b;
                    chico = a;
                }
            }
            
            
            if (Math.pow(medio, 2) + Math.pow(chico, 2) == Math.pow(mayor, 2)) {
                System.out.printf("right\n");
            } else{
                System.out.printf("wrong\n");
            }
            a = leer.nextInt();
            if (a == 0) {
                break;
            }
            b = leer.nextInt();
            c = leer.nextInt();
        }
    }
}