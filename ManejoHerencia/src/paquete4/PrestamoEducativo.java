/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author PabloCosta14
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPrestamoCarrera;

    public PrestamoEducativo(Persona p, int b, String c, String a,
            InstitucionEducativa h, double o) {
        super(p, b, c.toUpperCase());
        nivelEstudio = a;
        centroEducativo = h;
        valorCarrera = o;

    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerCentroEducativo(InstitucionEducativa n) {
        centroEducativo = n;
    }

    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }

    public void establecerValorMensualPrestamoCarrera() {
        double a = valorCarrera / meses;
        double b = a * 0.10;
        valorMensualPrestamoCarrera = a - b;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa ObtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double ObtenerValorMesnualPrestamoCarrera() {
        return valorMensualPrestamoCarrera;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("%s", super.toString());

        cadenaFinal = String.format("%s\nPrestamoEducativo\n"
                + "Nivel de estudio: %s\n"
                + "Nombre del Centro Educativo: %s\n"
                + "Siglas del Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual del pago del prestamo del valor de la carrera "
                + ": %.2f\n",
                cadenaFinal,
                obtenerNivelEstudio(),
                ObtenerCentroEducativo().obtenerNombre(),
                ObtenerCentroEducativo().obtenerSiglas(),
                obtenerValorCarrera(),
                ObtenerValorMesnualPrestamoCarrera());

        return cadenaFinal;

    }

}
