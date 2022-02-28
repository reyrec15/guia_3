
package edu.sv.ujmd.calculadora;

import edu.sv.ujmd.cavanzada.CalculadoraAvanzada;
import edu.sv.ujmd.cbasica.CalculadoraBasica;
import java.util.Scanner;

public class calculadora {

    public static int menuprincipal() {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int op;
        System.out.print("-----  MENU -----\n"
                + "Seleccione una opcion:\n"
                + "1. Calculadora Basica\n"
                + "2. Calculadora avanzada\n"
                + "3. Salir del programa\n"
        );

        op = teclado.nextInt();
        return op;
    }

    public static void main(String[] args) {
        boolean salir = false;
        int opc;
        opc = menuprincipal();
        do {
            switch (opc) {
                case 1:
                    CalculadoraBasica.main(null);
                    break;

                case 2:
                    CalculadoraAvanzada.main(null);
                    break;

                case 3:
                    System.out.println("Cerrando el programa...");
                    System.exit(0);
                    break;
            }
        } while (!salir);
    }

}