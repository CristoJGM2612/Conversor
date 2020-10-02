/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase Operacion que se encarga de almacenar las operaciones en la base de datos
 * @author Cristo Javier García Martín cristojgm2612@gmail.com
 */
public class Operacion {
    
    private final double valorInicial;
    private final double valorFinal;
    private final String cambioDivisa;

    public Operacion(double valorInicial, double valorFinal, String cambioDivisa) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.cambioDivisa = cambioDivisa;
    }

    @Override
    public String toString() {
        return "Operacion: " + "Valor Inicial=" + valorInicial + ", Valor Final=" + valorFinal + ", Cambio de Divisa=" + cambioDivisa;
    }
    
}
