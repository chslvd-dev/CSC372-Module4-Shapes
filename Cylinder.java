/**
 * Cylinder.java
 * Cylinder shape that extends Shape.
 * Surface area = 2 * PI * r * (r + h)
 * Volume = PI * r^2 * h
 *
 * Critical Thinking Assignment, Module 4
 * Chris Jayson Salvadora
 */
public class Cylinder extends Shape {

    private double radius;
    private double height;

    // Parameterized constructor initializes radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder [radius=%.2f, height=%.2f] Surface Area: %.2f, Volume: %.2f",
                radius, height, surface_area(), volume());
    }
}
