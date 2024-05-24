public abstract class Shape {

    String color ;
    protected abstract double area();
    protected abstract double perimeter();
    public Shape(String color) {
        this.color = color;
    }

    public void print_area_perimeter(){
        System.out.println("area is :"+this.area()+" perimeter is :"+this.perimeter());
    }

    public String getColor() {
        return color;
    }
}
