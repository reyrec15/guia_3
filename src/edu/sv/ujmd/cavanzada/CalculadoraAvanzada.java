package edu.sv.ujmd.cavanzada;

import edu.sv.ujmd.calculadora.calculadora;
import edu.sv.ujmd.cbasica.CalculadoraBasica;
import java.util.Scanner;
import java.lang.Math;

public class CalculadoraAvanzada {

    Scanner teclado = new Scanner(System.in);
    int n1;

    public void menu() {
        int opc;
        boolean salir = false;

        do {
            System.out.println();
            System.out.print("----- Menú Principal -----"
                    + "\n1. INGRESAR DATOS"
                    + "\n2. POTENCIA"
                    + "\n3. OPUESTO"
                    + "\n4. FACTORIAL"
                    + "\n5. Salir"
                    + "\nIngrese una opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    ingresaDatos();
                    break;
                    case 2:
                    potencia();
                    break;
                case 3:
                    opuesto();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
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

    public void potencia() {

        int potencia;
        System.out.print("Ingrese la potencia: ");
        potencia = teclado.nextInt();

        System.out.println("La potencia de " + n1 + " elevado a  " + potencia + " es igual a " + Math.pow(n1, potencia));
    }

    public void opuesto() {
        int opuesto;

        opuesto = n1 * -1;

        System.out.print("El opuesto de " + n1 + " es " + opuesto);

    }

    public void factorial() {
        int factorial = 1;
        for (int i = 1; i <= n1; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n1 + " es  " + factorial);

    }

    public void ingresaDatos() {
        System.out.print("Ingrese número 1: ");
        n1 = teclado.nextInt();
        teclado.nextLine();
    }

    public static void main(String[] args) {
        CalculadoraAvanzada fc = new CalculadoraAvanzada();
        fc.menu();
    }
}