package COJ;

import java.util.Arrays;

/*
    Algoritmo de Búsqueda por Conteo 
    Counting Sort
*/

public class _counting_Sort {
    public static void main(String[] args) {
        
        int[] arreglo = {3, 4, 3, 6, 7, 9, 4};
        
        int[] arreglo_ordenado;
        
        arreglo_ordenado = ordena_Lista(arreglo, 9);
        
        System.out.println("El arreglo ordenado es: " + Arrays.toString(arreglo_ordenado));
        
        
        //Forma fácil de ordenar un arreglo xD
        //Arrays.sort(arreglo);
        //System.out.println("Usando Arrays.Sort " + Arrays.toString(arreglo));
        
    }
    
    static int[] ordena_Lista(int[] lista, int max){
        int[] lista_aux = new int[max+1];
        int[] arreglo_ordenado = new int[lista.length];
        
        for (int i = 0; i < lista.length; i++) {
            lista_aux[lista[i]]++;
        }
        
        
        int k = 0;
        
        for (int i = 0; i < lista_aux.length; i++) {
            //como entrar al arreglo nuevo -_-
            for (int j = 0; j < lista_aux[i]; j++) {
                arreglo_ordenado[k] = i;
                k++;
            }
        }
        return arreglo_ordenado;
    }
}
