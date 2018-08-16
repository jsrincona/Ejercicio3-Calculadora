/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class Calculadora {

   private int numerouno, numerodos, respuesta;
   
   public void setNumerouno (int valor){
       this.numerouno=valor;
   }
   public void setNumerodos (int valor){
       this.numerodos=valor;
   }
   public int getRespuesta(){
       return this.respuesta;     
   }
   public void sumar(){
       this.respuesta=this.numerouno + this.numerodos;
   }
   public void restar(){
       this.respuesta=this.numerouno - this.numerodos;
   }
   public void multi(){
       this.respuesta=this.numerouno * this.numerodos;
   }
   public void div(){
       this.respuesta=this.numerouno / this.numerodos;
   }
   public void leer() {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.numerouno= t.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.numerodos = t.nextInt();
    }
   public static void main(String[] args){
       new Interfaz();
   }
       
}
