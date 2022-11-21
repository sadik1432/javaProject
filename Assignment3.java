// Concept of Overloading

class Rectangle{
    int length, breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    Rectangle(int x){
        length=breadth=x;
    }
    void area(){
        int a=length*breadth;
        System.out.println("Area is: " + a);
    }
}
class Assignment3{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(20,20);
        r1.area();
        Rectangle r2=new Rectangle(20);
        r2.area();

    }
}