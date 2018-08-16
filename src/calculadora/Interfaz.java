/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;
import calculadora.Calculadora;

/**
 *
 * @author Usuario
 */
public class Interfaz {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        c.setNumerouno(sc.nextInt());
        System.out.println("Ingrese el número 2");
        c.setNumerodos(sc.nextInt());
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("Escriba: 1) Suma  2) Resta  3)Multiplicación  4)División");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                c.sumar();
                break;
            case 2:
                c.restar();
                break;
            case 3:
                c.multi();
                break;
            case 4:
                c.div();
                break;
        }

        System.out.println(c.getRespuesta());

    }
}
