// Concept of constructor

class Rectangle{
    int length,breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    void area(){
        int a=length*breadth;
        System.out.println("Area is: " + a);
    }
}
class Assignment2{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(20,2);
        r.area();
    }
}