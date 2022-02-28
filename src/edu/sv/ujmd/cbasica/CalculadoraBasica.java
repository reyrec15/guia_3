package edu.sv.ujmd.cbasica;

import java.util.Scanner;
import edu.sv.ujmd.calculadora.calculadora;

public class CalculadoraBasica {

    Scanner teclado = new Scanner(System.in);
    int n1, n2;

    public void menu() {
        int opc;
        boolean salir = false;

        do {
            System.out.println();
            System.out.print("----- Menú Principal -----"
                    + "\n1. Ingresar datos"
                    + "\n2. SUMA"
                    + "\n3. RESTA"
                    + "\n4. MULTIPLICACION"
                    + "\n5. DIVISION"
                    + "\n6. Salir"
                    + "\nIngrese una opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    ingresaDatos();
                    break;
                case 2:
                    suma();
                    break;
                case 3:
                    resta();
                    break;
                case 4:
                    multiplicacion();
                    break;
                case 5:
                    division();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Cerrando el programa...");
                    calculadora.main(null);
                    break;
                default:
                    System.out.println("Error al digitar...");
                    break;
            }

        } while (!salir);
    }

    public void ingresaDatos() {
        System.out.print("Ingrese número 1: ");
        n1 = teclado.nextInt();
        System.out.print("Ingrese número 2: ");
        n2 = teclado.nextInt();
        teclado.nextLine();
    }

    public void suma() {
        int suma = n1 + n2;
        System.out.println("La suma de " + n1 + " y " + n2 + " es igual a " + suma);
    }

    public void resta() {
        System.out.println();
        int resta = n1 - n2;
        System.out.println("La resta de " + n1 + " y " + n2 + " es igual a " + resta);
    }

    public void multiplicacion() {
        System.out.println();
        int resta = n1 * n2;
        System.out.println("La multiplicacion de " + n1 + " y " + n2 + " es igual a " + resta);
    }

    public void division() {
        System.out.println();
        int resta = n1 / n2;
        System.out.println("La division de " + n1 + " y " + n2 + " es igual a " + resta);
    }

    public static void main(String[] args) {
        CalculadoraBasica fc = new CalculadoraBasica();
        fc.menu();
    }
}