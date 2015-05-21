package COJ;


import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2853 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int lado;
        
        lado = leer.nextInt();
        double lado_triangulo;
        double semi_perim;
        double hipo;
        double area_t;
        double area_total;
        
        while(lado != 0){
            lado_triangulo = lado / 3.0;
            
            hipo = Math.pow(lado_triangulo, 2) + Math.pow(lado_triangulo, 2);
            
            semi_perim = (lado_triangulo + lado_triangulo + hipo) / 2;
            
            //area_t = (lado_triangulo * lado_triangulo) / 2;
            area_t = Math.sqrt(semi_perim) * (semi_perim - hipo);
            
            area_t *= Math.sqrt(semi_perim - lado_triangulo) * (semi_perim - lado_triangulo);
            
            lado = lado * lado;
            
            area_t *= 4;
            
            area_total = lado * lado;
            
            area_total -= area_t;
            
            System.out.println(lado_triangulo);
            System.out.println(area_t);
            System.out.println(area_total);
            
            lado = leer.nextInt();
        }
    }
}
