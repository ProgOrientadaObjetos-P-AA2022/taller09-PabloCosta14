/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author PabloCosta14
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona garante1;
    private double valorAuto;
    private double mensualPrestamoAutomovil;

    public PrestamoAutomovil(Persona p, int b, String c, String d, String e,
            double f, Persona t) {
        super(p, b, c.toLowerCase());
        tipo = d;
        marca = e;
        valorAuto = f;
        garante1 = t;

    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerGarante1(Persona n) {
        garante1 = n;
    }

    public void establecerValorAuto(double n) {
        valorAuto = n;
    }

    public void establecervalorMensualPagoPrestamoAutomovil() {
        mensualPrestamoAutomovil = valorAuto / meses;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerMensualPrestamoAutomovil() {
        return mensualPrestamoAutomovil;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("%s", super.toString());

        cadenaFinal = String.format("%s\nPrestamoAutomovil\n"
                + "Tipo de automovil: %s\n"
                + "Marca de automovil: %s\n"
                + "Valor del automovil: %.2f\n"
                + "Valor mensual del pago prestamo automovil : %.2f\n",
                cadenaFinal,
                obtenerTipo(),
                obtenerMarca(),
                obtenerValorAuto(),
                obtenerMensualPrestamoAutomovil());

        return cadenaFinal;

    }

}
