/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_2_parte_2;

/**
 *
 * @author Pablo
 */
public class Circulo {
        int radio;
 
 
        Circulo(int radio){
            this.radio = radio;

         }

         double Area(){
            return Math.PI*Math.pow(radio, 2);
         }

         double Perimetro(){
             return 2*Math.PI*radio;
         }
    }
