/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diphontine.equation;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DiphontineEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);//lector
        System.out.println("la ecaucion diofantica tiene esta forma: ax + by = c \n"
                + "donde c es necesariamente gcd(a,b) divide a c\n"
                + "escribe el numero a");
        int numero_a;
        numero_a = lectura.nextInt();
        System.out.println("escribe elnumero b");
        int numero_b;
        numero_b = lectura.nextInt();

        System.out.println("tu ecuacion es " + numero_a + "x + " + numero_b + "y " + "=" + " gcd(" + numero_a + "," + numero_b + ")");

        // buscamos el gcd de a y b
        int gcd = 1;

        if (numero_a <= numero_b) {
            for (int i = 1; i <= numero_a && i <= numero_b; i++) {
                if (numero_a % i == 0 && numero_b % i == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <= numero_b && i <= numero_a; i++) {
                if (numero_a % i == 0 && numero_b % i == 0) {
                    gcd = i;
                }
            }
        }

        System.out.println("gcd(" + numero_a + "," + numero_b + ")" + " = " + gcd + "\n"
                + "tu ecuacion es " + numero_a + "x + " + numero_b + "y " + "= " + gcd);

        System.out.println("como una ecuacion diofantica tiene infinitas soluciones,\n elija hasta que numero desea buscar solucion");
        int rangoRespuestas = lectura.nextInt();

        if (numero_a <= numero_b) {
            for (int x = 1; x < rangoRespuestas; x++) {
                if (gcd - numero_a * x % numero_b == 0) {
                    System.out.println("x  = " + x);
                    System.out.println("y = " + (gcd - numero_a * x) / numero_b);
                    System.out.println("el siguiente par que resuelve la ecuacion es ");

                }
            }
        } else {
                        for (int x = 1; x < rangoRespuestas; x++) {
                if (gcd - numero_b * x % numero_a == 0) {
                    System.out.println("x  = " + x);
                    System.out.println("y = " + (gcd - numero_a * x) / numero_b);
                    System.out.println("el siguiente par que resuelve la ecuacion es ");

                }
            }

        }

    }

}
