/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conversor;
import java.util.Scanner;

/**
 *
 * @author Cristo Javier García Martín cristojgm2612@gmail.com
 */
public class Interface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Conversor");

        Boolean seguir = true;

        while (seguir) {
            System.out.println("------------Menú de Usuario------------");
            System.out.println("Introduce que quieres convertir:");
            System.out.println("1- De Dollar a Euro ($-€)");
            System.out.println("2- De Euro a Dollar (€-$)");

            int opcion = sc.nextInt();
            sc.nextLine();
            String temp1 = null;
            switch (opcion) {
                case 1:

                    temp1 = "$-€";
                    break;

                case 2:
                    temp1 = "€-$";
                    break;
            }

            System.out.println("Introduce la cantidad a cambiar");

            double cantidad = sc.nextDouble();
            sc.nextLine();

            Conversor conversor = new Conversor(temp1, cantidad);

            System.out.println(conversor);

            System.out.println("Desea continuar? y/n");

            String last = sc.nextLine();

            seguir = "y".equals(last);
        }
    }
}
