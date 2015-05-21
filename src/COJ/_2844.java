package COJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author EnriqueJM
 */
public class _2844 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        String texto;
        Pattern patron_Busqueda;
        Matcher texto_PBusqueda;

        int contador = 0;

        patron_Busqueda = Pattern.compile(entrada.readLine());

        while (entrada.ready()) {
            
            texto = entrada.readLine();
            texto_PBusqueda = patron_Busqueda.matcher(texto);

            while (texto_PBusqueda.find()) {
                contador++;
            }
        }
        System.out.println(contador);
        out.close();
    }
}
