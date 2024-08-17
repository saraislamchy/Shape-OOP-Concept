/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2shape;


public class Rectangle extends Shape {
    double width = 5;
    double height = 3;
    
    @Override
    void area(){
        System.out.println("Area of Rectangle is: " + width * height);
    }
    
}
