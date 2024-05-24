public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle( double width, double height) {
        super("green");
        this.width = width;
        this.height = height;
    }

    protected double area(){
        return (width*height);
    }

    protected double perimeter(){
        return (width*2+2*height);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
