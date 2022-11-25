/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        double suma_final;
        double nota_final;
        boolean bandera = true;
        int salida;
        do {
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);

            System.out.println("Ingrese (-111) si desea salir del ciclo ");
            salida = entrada.nextInt();
            
            suma_final = nota +  nota;
            
                    
            

            if (salida == -111) {
                bandera = false;
            }

        } while (bandera); // (bandera==true)
        System.out.println("suma de las notas es:"+suma_final);
        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
