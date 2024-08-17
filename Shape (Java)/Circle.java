/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2shape;

public class Circle extends Shape {
    
    double radius = 5;
    
    @Override
    void area(){
        System.out.println("Area of Circle is: " + 3.1416 * radius * radius);
    }
    
}
