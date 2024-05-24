//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Shape[] shapes = new Shape[20];

       Circle a = new Circle(4);
       Circle b = new Circle(5);
       Circle c = new Circle(6);
       Rectangle d = new Rectangle(7,8);
       Rectangle e = new Rectangle(8,9);

       shapes[0] = a;
       shapes[1] = b;
       shapes[2] = c;
       shapes[3] = d;
       shapes[4] = e;
       for (int i = 0; i < shapes.length; i++) {
           if(shapes[i] !=null) {
               shapes[i].print_area_perimeter();
           }
       }


    }
}