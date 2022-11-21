// Concept of overriding methods

class Room{
    int length, breadth;
    Room(int l, int b){
        length=l;
        breadth=b;
    }
    void show(){
        int a =length*breadth;
        System.out.println("Area is: " + a);
    }
}
class Classroom extends Room{
    int window;
    Classroom(int l, int b, int w){
        super(l, b);
        window=w;
    }
    void show(){
        int a =length*breadth;
        System.out.println("Area is:"+ a);
        System.out.println("No of windows: " + window);
    }
}
class Assignment5{
    public static void main(String[] args) {
        Room r=new Room(20,3);
        r.show();
        Classroom c=new Classroom(10,3,5);
        c.show();
    }
}