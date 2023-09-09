/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_2_parte_2;

/**
 *
 * @author Pablo
 */
public class Trapecio {
    int baseM;
        int basem;
        int altura;
        
        Trapecio(int baseM, int basem, int altura){
            this.baseM = baseM;
            this.basem = basem;
            this.altura = altura;
        }
        
        double Area(){
            return ((baseM+basem)/2)*altura;
        }
        
        double lado(){
            return Math.pow((((baseM-basem)/2)*((baseM-basem)/2))+(altura*altura),0.5);
        }
        
        double Perimetro(){
            return lado()+lado()+baseM+basem;
        }
    
}
