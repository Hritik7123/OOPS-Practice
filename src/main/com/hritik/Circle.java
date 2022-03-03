package main.com.hritik;

public class Circle {
    private double radius;
    private String colour;

    public Circle(){
      this.radius = 1.0;
      this.colour = "red";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}


