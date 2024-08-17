/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2shape;


public class Triangle extends Shape {
    double base = 5;
    double height = 8;
    
    @Override
    void area(){
        System.out.println("Area of Triangle is: " + 0.5 * base * height);
    }
    
}
