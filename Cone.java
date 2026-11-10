/**
 * Cone.java
 * Cone shape that extends Shape.
 * Slant height l = sqrt(r^2 + h^2)
 * Surface area = PI * r * (r + l)
 * Volume = (1/3) * PI * r^2 * h
 *
 * Critical Thinking Assignment, Module 4
 * Chris Jayson Salvadora
 */
public class Cone extends Shape {

    private double radius;
    private double height;

    // Parameterized constructor initializes radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double slant = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slant);
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Cone     [radius=%.2f, height=%.2f] Surface Area: %.2f, Volume: %.2f",
                radius, height, surface_area(), volume());
    }
}
