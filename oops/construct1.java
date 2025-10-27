package oops;

class Students {
    static int count = 0 ;

    int sid;
    String sname;

    Students() {
        this(01,"defaulter");
        System.out.println("default constructor");
    }

    Students(int sid, String sname) {
        //this();
        count++;
        this.sid = sid;
        this.sname = sname;
    }

    // for passing an object as an argument also.
    void show(Students std){
        System.out.println(std.sname);
        System.out.println(std.sid);
    }
    void display(){
        show(this);
    }
}

public class construct1 {
    void greet(){
        System.out.println("Hi , hello!!");
        saybye();
    }
    static  void saybye(){
        System.out.println("bye bye bitch!!");
    }

    public static void main(String[] args) {
//        Students s1 = new Students();
//        System.out.println(s1.sname);
//
//        // calling the static variable without an object reference
//        System.out.println("student count :"+Students.count);
//
//        //Students s2 = new Students(1, "Aayush");
//        //System.out.println(s2.sname);
//
//        System.out.println();
//        s1.display();

        // stactic methods
        // greet(); -> Non-static method 'greet()' cannot be referenced from a static context

        construct1 obj= new construct1();
        obj.greet();
    }
}
