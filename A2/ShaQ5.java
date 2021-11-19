package A2;

public class ShaQ5 {
    public static void main(String[] args) {
        Shapes s1 = new Line();
        s1.draw();
        Shapes s2 = new Rectangle();
        s2.draw();
        Shapes s3 = new Cube();
        s3.draw();

    }
}
abstract class Shapes{
abstract void draw();
}
class Line extends Shapes{
    void draw(){
        System.out.println("Drawing a Line");
    }

}
class Rectangle extends Shapes{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Cube extends Shapes{
    void draw(){
        System.out.println("Drawing cube");
    }
}
