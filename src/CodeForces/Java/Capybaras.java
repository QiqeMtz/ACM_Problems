package CodeForces.Java;

import java.util.Scanner;

/**
 * ====================================================================
 * || Project: ACM_Practicas
 * || Created by Enrique (QiqeMtz) on 07/11/16 at 18:06.
 * ====================================================================
 */
public class Capybaras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String capybaras = "";
        int contDereecha, contIzquierda;
        contDereecha = contIzquierda = 0;

        capybaras = in.nextLine();

        for (int i = 0; i < capybaras.length(); i++) {
            if (capybaras.charAt(i) == 'A')
                contDereecha++;
            else if (capybaras.charAt(i) == 'B')
                contIzquierda++;

            if (contIzquierda > contDereecha){
                System.out.println("Nao");
                break;
            }
        }

        if (contDereecha == contIzquierda)
            System.out.println("Sim");
        else
            System.out.println("Nao");
    }
}
