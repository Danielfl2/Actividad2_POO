/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_2_parte_2;

/**
 *
 * @author Pablo
 */
public class TrianguloRectangulo {
    int base;
        int altura;
 
 
        TrianguloRectangulo(int base, int altura){
            this.base = base;
            this.altura = altura;
         }
        
        double Hipotenusa(){
            return Math.pow(base*base+altura*altura, 0.5);
        }

         double Area(){
            return (base*altura)/2;
         }

         double Perimetro(){
             return(base+altura+Hipotenusa());
         }    
         
         void tipoTriangulo(){
             
            if((base ==altura)&&(base==Hipotenusa())&&(altura==Hipotenusa()))
            System.out.println("Triángulo Equilátero"); 
                
            else if((base != altura)&&(base != Hipotenusa())&&(altura != Hipotenusa()))
            System.out.println("Triángulo Escaleno");
            
            else
            System.out.println("Triángulo Isósceles");
            
            
         }
}
