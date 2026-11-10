/**
 * ShapeArray.java
 * Driver class. Creates one sphere, one cylinder, and one cone,
 * stores them in an array of Shape, then prints each with toString.
 *
 * Critical Thinking Assignment, Module 4
 * Chris Jayson Salvadora
 */
public class ShapeArray {

    public static void main(String[] args) {
        // Test case 1
        Shape[] shapeArray = {
            new Sphere(3.0),
            new Cylinder(2.0, 5.0),
            new Cone(3.0, 4.0)
        };

        System.out.println("=== Test Case 1 ===");
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }

        // Test case 2, different dimensions
        shapeArray = new Shape[] {
            new Sphere(1.5),
            new Cylinder(4.0, 10.0),
            new Cone(6.0, 8.0)
        };

        System.out.println();
        System.out.println("=== Test Case 2 ===");
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
