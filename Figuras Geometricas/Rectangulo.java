/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_2_parte_2;

/**
 *
 * @author Pablo
 */
public class Rectangulo {
    int base;
        int altura;
 
 
        Rectangulo(int base, int altura){
            this.base = base;
            this.altura = altura;

         }

         double Area(){
            return base*altura;
         }

         double Perimetro(){
             return 2*(base + altura);
         }    
    
    
}
