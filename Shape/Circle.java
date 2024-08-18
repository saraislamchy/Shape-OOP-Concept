/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapemain;


 class Circle extends Shape {
     private double radius;

    public Circle(double redius) {
        this.radius = redius;
    }
     
     @Override
     public double area(){
        return 3.14 * radius * radius ;
    }
    
}
