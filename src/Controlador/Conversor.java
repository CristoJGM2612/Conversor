/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operacion;

/**
 * Clase Conversor en la que se pasa de una divisa a otra
 * @author Cristo Javier García Martín cristojgm2612@gmail.com
 */
public final class Conversor {

    String divisa;
    double cantidad;
    Operacion op;
    
    
    /**
     * 
     * @param tipo      Tipo de Operacion que quiere realizar, de Dollar a Euro o de Euro a Dollar
     * @param cantidad  Cantidad a convertir
     */
    public Conversor(String tipo, double cantidad) {
        this.divisa = tipo;
        this.cantidad = cantidad;
        Conversion();
    }
    
    /**
     * En este método se realiza la conversión de divisas
     * @return Se devuelve la cantidad ya convertida a la respectiva divisa
     */
    public double Conversion() {
        
        double result=0;
        
        switch (divisa) {
            case "$-€":
                result=cantidad*0.85;
                break;
            case "€-$":
                result=cantidad*1.18;
                break;
        }
        
        op = new Operacion(cantidad, result, divisa);
        
        return result;
    }

    /**  
     * @return Este return devuleve el toString de la Clase
     */
    @Override
    public String toString() {
        return "Conversor{" + "divisa=" + divisa + ", cantidad=" + cantidad + ", " + op + '}';
    }
    
    
}
