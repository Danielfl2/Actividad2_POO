/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_2_parte_2;

/**
 *
 * @author Pablo
 */
public class Actividad_2_Parte_2 {
    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5 = new Rombo(2,1);
        Trapecio figura6 = new Trapecio(2,1,3);
        System.out.println("El área del círculo es = " + figura1.Area());
        System.out.println("El perímetro del círculo es = " + figura1.Perimetro());
        System.out.println("El área del rectángulo es = " + figura2.Area());
        System.out.println("El perímetro del rectángulo es = " + figura2.Perimetro());
        System.out.println("El área del cuadrado es = " + figura3.Area());
        System.out.println("El perímetro del cuadrado es = " + figura3.Perimetro());
        System.out.println("El área del triángulo es = " + figura4.Area());
        System.out.println("El perímetro del triángulo es = " + figura4.Perimetro());
        figura4.tipoTriangulo();
        System.out.println("El área del rombo es = " + figura5.Area());
        System.out.println("El perímetro del trombo es = " + figura5.Perimetro());
        System.out.println("El área del trapecio es = " + figura6.Area());
        System.out.println("El perímetro del trapecio es = " + figura6.Perimetro());
   
}
}
  