class Room {
    int length, breadth;

    Room(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int a = length * breadth;
        System.out.println("Area is: " + a);
    }
}

class Classroom extends Room {
    int window;

    Classroom(int l, int b, int w) {
        super(l, b);
        window = w;
    }

    void show() {
        System.out.println("No of windows is: " + window);
    }
}

class Assignment4 {
    public static void main(String[] args) {
        Room r1 = new Room(40, 40);
        r1.area();
        Classroom cr = new Classroom(20, 25, 4);
        cr.show();
    }
}