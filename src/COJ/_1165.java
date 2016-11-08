package COJ.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 * 
 * RUNTIME ERROR prueba 0
 * 
 * 
 */

public class _1165 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String str = "";
        List<Integer> lista_NumsY = new ArrayList<>();
        List<Integer> lista_NumsN = new ArrayList<>();
        int a = 0;
        boolean flag = false;

        str = leer.next();

        while (!str.equals("*")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'Y') {
                    lista_NumsY.add(i + 1);
                } else {
                    lista_NumsN.add(i + 1);
                }
            }

            a = lista_NumsY.get(0);
            for (int j = 1; j < lista_NumsY.size(); j++) {
                a = (int) calcula_MCM(a, lista_NumsY.get(j));
            }

            for (Integer lista_NumsN1 : lista_NumsN) {
                if (a % lista_NumsN1 == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                System.out.println(a);
            } else {
                System.out.println("-1");
            }
            
            str = leer.next();
            flag = false;
            lista_NumsY.clear();
            lista_NumsN.clear();
            
        }
    }

    static double calcula_MCM(int a, int b) {

        double mcm = (a * b) / calcula_MCD(a, b);

        return mcm;
    }

    static double calcula_MCD(int _n, int _m) {
        double a, b, r, resp;
        a = b = r = resp = 0;

        if (_m == 0) {
            resp = _n;
        } else {
            a = _n;
            b = _m;
            r = _m;
        }

        while (r != 0) {
            //arriba o abajo
            resp = r;
            r = a % b;
            a = b;
            b = r;
        }
        return resp;
    }
}

/*

 **** check it's 
 Iterator itY = lista_NumsY.iterator();
            
 while(itY.hasNext()){
 System.out.println("SI: " + itY.next().toString());
 }
            
            
 Iterator itN = lista_NumsN.iterator();
            
 while(itN.hasNext()){
 System.out.println("NO: " + itN.next().toString());
 }





 */
