// Concept of Interface

interface variable{
    float pi=3.14f;
}
interface methods{
    void area();
}
class Rectangle implements methods{
    float length, breadth;
    Rectangle(float a, float b){
        length=a;
        breadth=b;
    }
    public void area(){
        System.out.println("Area is: " + length*breadth);
    }
}
class Circle implements variable, methods{
    float radius;
    Circle(float a){
        radius=a;
    }
    public void area(){
        System.out.println("Area is: " + pi*radius*radius);
    }
}
class Assignment6{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(13,6);
        r.area();
        Circle c=new Circle(3);
        c.area();
    }
}