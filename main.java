import java.util.*;

interface Shape {
    int getPerimeter();  
}

class Rectangle implements Shape {
    int length, breadth;
    
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public int getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle implements Shape {
    int side1, side2, side3;
    
    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    
    public int getPerimeter() {
        return side1 + side2 + side3;
    }
}

class Circle implements Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }


    public int getPerimeter() {
        return (int) (2 * Math.PI * radius); 
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Shape tri = new Triangle(3, 4, 5);
        Shape cir = new Circle(4);
        
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter());
        System.out.println("Circle Perimeter: " + cir.getPerimeter());
    }
}
