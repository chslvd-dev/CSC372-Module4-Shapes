/**
 * Shape.java
 * Abstract superclass for 3D shapes.
 * Every subclass must compute its own surface area and volume.
 *
 * Critical Thinking Assignment, Module 4
 * Chris Jayson Salvadora
 */
public abstract class Shape {

    // Returns the surface area of the shape
    public abstract double surface_area();

    // Returns the volume of the shape
    public abstract double volume();
}
