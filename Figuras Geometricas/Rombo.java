/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_2_parte_2;

/**
 *
 * @author Pablo
 */
public class Rombo {
     int diagonalM; 
        int diagonalm;
        
        Rombo(int diagonalM ,int diagonalm){
            this.diagonalM = diagonalM;
            this.diagonalm = diagonalm;
        }
        double lado(){
            return Math.pow(((diagonalM/2)*(diagonalM/2))+((diagonalm/2)*(diagonalm/2)),0.5);
        }
        
        double Area(){
            return (diagonalM*diagonalm)/2;
        }
        
        double Perimetro(){
            return (4*lado());
        }
    
}
