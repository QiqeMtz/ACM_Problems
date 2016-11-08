package COJ.Java;

import java.util.Arrays;
import java.util.Scanner;


public class _2789 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String text, text_Aux;        
        
        text = leer.next();
        text_Aux = text.replace("+", "");
        char[] array_Nums = text_Aux.toCharArray();
        Arrays.sort(array_Nums);
        
        //Hasta aqui ya esta ordenado de menor a mayor
        text = String.copyValueOf(array_Nums);
        text_Aux="";
        
        //Al final se va un + de extra
        for (int i = 0;  i < text.length(); i++) {
            
            text_Aux += "" + text.charAt(i) + "+";
            
        }
        
        System.out.println(text_Aux.substring(0, text_Aux.length()-1));
        
    }
}
