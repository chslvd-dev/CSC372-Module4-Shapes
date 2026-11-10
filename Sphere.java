/**
 * Sphere.java
 * Sphere shape that extends Shape.
 * Surface area = 4 * PI * r^2
 * Volume = (4/3) * PI * r^3
 *
 * Critical Thinking Assignment, Module 4
 * Chris Jayson Salvadora
 */
public class Sphere extends Shape {

    private double radius;

    // Parameterized constructor initializes the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return String.format("Sphere   [radius=%.2f] Surface Area: %.2f, Volume: %.2f",
                radius, surface_area(), volume());
    }
}
