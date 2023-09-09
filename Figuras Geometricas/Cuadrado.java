/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_2_parte_2;

/**
 *
 * @author Pablo
 */
public class Cuadrado {
    int lado;
 
 
        Cuadrado(int lado){
            this.lado = lado;
         }

         double Area(){
            return lado*lado;
         }

         double Perimetro(){
             return 4*(lado);
         } 
    
}
