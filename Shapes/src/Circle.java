public class Circle extends Shape {
    private double radius;
    public Circle( double radius) {
        super("red");
        this.radius = radius;
    }

    protected double area(){
        return (3.14*this.radius*this.radius);
    }

    protected double perimeter(){
        return (this.radius*2*3.14);
    }




}
