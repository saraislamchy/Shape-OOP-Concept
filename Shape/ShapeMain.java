/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapemain;

public class ShapeMain {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,3);
        System.out.println("Area of Rectangle is: " + r.area());
        
        Circle c = new Circle(5);
        System.out.println("Area of Circle is: " + c.area());
        
        Triangle t = new Triangle(5,8);
        System.out.println("Area of Triangle is: " + t.area());   
    }
}
