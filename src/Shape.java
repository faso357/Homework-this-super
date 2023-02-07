public class Shape {
    double radius;
    Shape(double radius){
        this.radius=radius;


    }
}
class Circle extends Shape{

    Circle(double radius) {
        super(radius);
    }
    double CircleArea(){
        return 3.14*radius*radius;
    }
};
