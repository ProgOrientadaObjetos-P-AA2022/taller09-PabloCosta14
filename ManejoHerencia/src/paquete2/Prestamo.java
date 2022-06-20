/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author PabloCosta14
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int meses;
    protected String ciudadPrestamo;

    public Prestamo(Persona p, int b, String c) {
        beneficiario = p;
        meses = b;
        ciudadPrestamo = c;
    }

    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }

    public void establecerMeses(int n) {
        meses = n;
    }

    public void establecerciudadPrestamo(String n) {
        ciudadPrestamo = n;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerMeses() {
        return meses;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario:\n "
                + "Nombre %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n"
                + "Meses: %s\n"
                + "Ciudad del prestamo: %s\n",
                obtenerBeneficiario().obtenerNombre(),
                obtenerBeneficiario().obtenerApellido(),
                obtenerBeneficiario().obtenerUsername(),
                obtenerMeses(),
                obtenerCiudadPrestamo());

        return cadena;
    }

}
