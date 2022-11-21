// Concept of class and object

class Rectangle{
    int length,breadth;
    void getData(int a, int b ){ 
        length=a;
        breadth=b;
    }
    void area(){
        int a=length*breadth;
        System.out.println("Area is: "+a);
    }
}
class Assignment1{
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.getData(20,20);
        r.area();
    }
}