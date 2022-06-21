/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author PabloCosta14
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int opcion;
        boolean flag = true;
        int contador1 = 0;
        int contador2 = 0;

        String cadena1 = "";
        String cadena2 = "";

        do {

            System.out.println("Ingrese 1 si desea ingrear datos para un PrestamoAutomovil \n"
                    + "Ingrese 2 si desea ingrear datos para un PrestamoEducativo \n"
                    + "Ingrese 3 para salir del programa");

            opcion = entry.nextInt();
            if (opcion < 1 || opcion > 3) {
                System.out.println("Numero invalido, intentelo de nuevo");
                System.out.println("----------------------------------------");

            }

            if (opcion == 3) {
                System.out.println("****Ha salido exitosamente del programa****");
                if (contador1 > 0) {
                    System.out.println(cadena1);
                }
                if (contador2 > 0) {
                    System.out.println(cadena2);
                }
                flag = false;
            }
            if (opcion == 1 || opcion == 2) {

                entry.nextLine();
                System.out.println("Datos del beneficiario");
                System.out.println("Ingrese su Nombre");
                String n = entry.nextLine();
                System.out.println("Ingrese su Apellido");
                String a = entry.nextLine();
                System.out.println("Ingrese su Username");
                String u = entry.nextLine();

                Persona p = new Persona(n, a, u);

                switch (opcion) {
                    case 1:
                        contador1 = contador1 + 1;
                        System.out.println("Ingrese el numero de meses");
                        int m = entry.nextInt();
                        entry.nextLine();
                        System.out.println("Ingrese la ciudad del prestamo");
                        String pres = entry.nextLine();

                        System.out.println("Ingrese el tipo de automovil");
                        String tipo = entry.nextLine();

                        System.out.println("Ingrese la marca del automovil");
                        String marca = entry.nextLine();

                        System.out.println("Ingrese su Nombre");
                        String no = entry.nextLine();

                        System.out.println("Ingrese su Apellido");
                        String ape = entry.nextLine();

                        System.out.println("Ingrese su Username");
                        String user = entry.nextLine();

                        System.out.println("Ingrese el valor del automovil");
                        double valor = entry.nextDouble();

                        Persona per = new Persona(no, ape, user);

                        PrestamoAutomovil pa = new PrestamoAutomovil(p, m, pres,
                                tipo, marca, valor, per);

                        pa.establecervalorMensualPagoPrestamoAutomovil();

                        cadena1 = String.format("%s %s\n------------------------------\n",
                                cadena1, pa);
                        break;
                    case 2:
                        contador2 = contador2 + 1;
                        System.out.println("Ingrese el numero de meses");
                        int mes = entry.nextInt();
                        entry.nextLine();

                        System.out.println("Ingrese la ciudad del prestamo");
                        String prest = entry.nextLine();

                        System.out.println("Ingrese el nivel de estudio");
                        String est = entry.nextLine();

                        System.out.println("Ingrese el nombre de la unidad educativa");
                        String nedu = entry.nextLine();

                        System.out.println("Ingrese las siglas de la unidad educativa");
                        String siglas = entry.nextLine();

                        System.out.println("Ingrese el valor de la carrera");
                        double valo = entry.nextDouble();

                        InstitucionEducativa ie = new InstitucionEducativa(
                                nedu, siglas);
                        PrestamoEducativo pe = new PrestamoEducativo(
                                p, mes, prest, est, ie, valo);

                        pe.establecerValorMensualPrestamoCarrera();

                        cadena2 = String.format("%s %s\n----------------------------------\n",
                                cadena2, pe);
                        break;

                }
            }

        } while (flag);

    }
}
